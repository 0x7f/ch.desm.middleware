package ch.desm.middleware.app.core;


import ch.desm.middleware.app.common.ComponentServiceBase;
import ch.desm.middleware.app.core.communication.broker.Broker;
import ch.desm.middleware.app.core.communication.endpoint.rs232.EndpointRs232;
import ch.desm.middleware.app.core.component.cabine.re420.Re420EndpointUbw32;
import ch.desm.middleware.app.core.component.cabine.re420.Re420Service;
import ch.desm.middleware.app.core.component.interlocking.obermatt.OmService;
import ch.desm.middleware.app.core.component.gui.management.ManagementService;
import ch.desm.middleware.app.core.component.petrinet.obermatt.PetrinetOmService;
import ch.desm.middleware.app.core.component.simulation.locsim.Locsim;
import ch.desm.middleware.app.core.component.simulation.locsim.LocsimEndpointDll;
import ch.desm.middleware.app.core.component.simulation.locsim.LocsimEndpointRs232;
import ch.desm.middleware.app.common.DaemonThreadBase;
import ch.desm.middleware.app.core.component.simulation.zusi.ZusiService;
import ch.desm.middleware.app.core.server.JettyServer;
import ch.desm.middleware.app.core.server.TyrusServer;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class RunAppSingleton extends DaemonThreadBase {

	private static Logger LOGGER = Logger.getLogger(RunAppSingleton.class);
	private static final RunAppSingleton singleton = new RunAppSingleton();

    private String host;
    private int port;
    private String tyrusWebsocketContextPath;
    private String serverEndpointContextPath;
    private String serverJettyPath;
    private boolean isConfigured = false;

	private RunAppSingleton(){
		if (singleton != null)
	        throw new IllegalStateException("Already instantiated, only use of singleton allowed!");
	}
	
	public static RunAppSingleton getSingleton(){
		return RunAppSingleton.singleton;
	}

    public void setConfiguration(String host, String port, String websocketContextPath, String serverEndpointContextPath, String jettyPath){
        this.host = host;
        this.port = Integer.valueOf(port);
        this.tyrusWebsocketContextPath = websocketContextPath;
        this.serverEndpointContextPath = serverEndpointContextPath;
        this.serverJettyPath = jettyPath;
        isConfigured = true;

        LOGGER.log(Level.INFO, "set configuration:"+
                "\nhost: "+this.host +
                "\nport: "+this.port +
                "\ntyrusWebsocketContextPath: " + this.tyrusWebsocketContextPath +
                "\nserverEndpointContextPath: " + this.serverEndpointContextPath +
                "\nserverJettyPath: " + this.serverJettyPath +
                "\nisConfigured: " + isConfigured);
    }

    public boolean isConfigured(){
        return isConfigured;
    }

	public void run(){

        /************************** Start Server ************************************/
        TyrusServer tyrusServer = startServerTyrus(host, port, tyrusWebsocketContextPath);
        JettyServer jettyServer = startJettyServer(serverJettyPath);
        startManagement(jettyServer, "ws://"+host+":"+ port + tyrusWebsocketContextPath +serverEndpointContextPath);
        /***************************************************************************/

        //startOmStellwerk(EndpointRs232.EnumSerialPorts.COM3);
        //startCabineRe420(EndpointRs232.EnumSerialPorts.COM4, EndpointRs232.EnumSerialPorts.COM8);
        //startLocsim(EndpointRs232.EnumSerialPorts.COM9);
        startOmPetrinet();
        startZusiFahrpult("7.94.80.35", 1436);
        startZusiAusbildung("7.94.80.35", 1436);

        //startCabineRe420(EndpointRs232.EnumSerialPorts.COM12);
    }

    private JettyServer startJettyServer(String path){
        JettyServer server = new JettyServer(path);
        server.start();

        return server;
    }

    private TyrusServer startServerTyrus(String ip, int port, String path){
        TyrusServer server = new TyrusServer(ip, port, path);
        server.start();

        return server;
    }

	public void startManagement(JettyServer server, String uri){
        ManagementService management = isServerStarted(server) ? new ManagementService(Broker.getInstance(), uri) : null;
	}

	public void startOmPetrinet(){
        PetrinetOmService petrinet = new PetrinetOmService(Broker.getInstance());
	}

	public void startOmStellwerk(EndpointRs232.EnumSerialPorts port){
        OmService oml = new OmService(Broker.getInstance(), port);
	}

    public void startCabineRe420(EndpointRs232.EnumSerialPorts port){
        Re420Service service = new Re420Service(Broker.getInstance(), port);
        service.getEndpoint().init();
        service.getEndpoint().start();
    }

    public void startZusiFahrpult(String ip, int port){
        ZusiService serviceFahrpult = new ZusiService(Broker.getInstance(), ip, port);
        serviceFahrpult.getEndpointFahrpult().init();
        serviceFahrpult.getEndpointFahrpult().start();
        serviceFahrpult.getEndpointFahrpult().sendCommandRegisterClientFahrpult();
        serviceFahrpult.getEndpointFahrpult().sendCommandNeededDataFahrpult();
    }

    public void startZusiAusbildung(String ip, int port){
        ZusiService serviceAusbildung = new ZusiService(Broker.getInstance(), ip, port);
        serviceAusbildung.getEndpointAusbildung().init();
        serviceAusbildung.getEndpointAusbildung().start();
        serviceAusbildung.getEndpointAusbildung().sendCommandRegisterClientAusbildung();
        serviceAusbildung.getEndpointAusbildung().sendCommandNeededDataAusbildung();


        /*
        try {
            doHangout(3000);
            serviceAusbildung.getEndpointAusbildung().sendCommandSignalAspect();
            doHangout(3000);
            serviceAusbildung.getEndpointAusbildung().sendCommandSwitch();
            doHangout(3000);
            serviceAusbildung.getEndpointAusbildung().sendCommand("0300-0d01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:49,0300:00,0400:00,0500:01");
            doHangout(3000);
            serviceAusbildung.getEndpointAusbildung().sendCommand("0300-0D01::0100:526f757465735c5363687765697a5c3332545f303030345f303035325c3030303430365f3030353230315f4f6265726d6174745c3133303931382d454d4d2d4f4d2d4c4e2e737433,0200:49,0300:00,0400:00,0500:00");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */

    }


	public void startLocsim(EndpointRs232.EnumSerialPorts portRs232){
		LocsimEndpointDll endpointDll = new LocsimEndpointDll("dispatcher.json");
		LocsimEndpointRs232 endpointRs232 = new LocsimEndpointRs232(portRs232);
		Locsim locsimImpl = new Locsim(Broker.getInstance(), endpointRs232, endpointDll);
	}

	/**
	 * The "PM" Command : Set hardware PWM output values command Sets a PWM
	 * value for any of the 5 PWM hardware channels Format:
	 * "PM,<Channel>,<DutyCycle><CR>" <Channel> is required and is 1 through 5,
	 * which correspond to the output compare (OC0 through OC4 = RD0 through
	 * RD4) pins. <DutyCycle> is required and is 0 through 65535. If <DutyCycle>
	 * is 0, then the hardware PWM is shut off. The PWM frequency is 1220Hz
	 * (80MHz/0x10000) Example: "PM,3,512" Return Packet: "OK"
	 */
	public void startUbw32Pwm(String[] args) {

		String comPort = args[0];
		String channel = args[1];
		String dutyCycle = args[2];
		boolean autoCycle = Boolean.parseBoolean(args[3]);
		int step = Integer.parseInt(args[4]);
        boolean stepPositiv = Boolean.parseBoolean(args[5]);

		try {
			if (args.length == 0) {
				throw new Exception("no parameter!");
			} else {
				if (Integer.parseInt(comPort) <= 0
						|| Integer.parseInt(comPort) >= 23) {
					throw new Exception("wrong com Port!");
				}

				if (Integer.parseInt(channel) <= 0
						|| Integer.parseInt(channel) >= 6) {
					throw new Exception("wrong channel!");
				}

				if (Integer.valueOf(dutyCycle) < 1 || Integer.valueOf(dutyCycle) > 65535) {
					throw new Exception("wrong duty cycle!");
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.log(Level.ERROR, e);
		}

        /*
        Re420Service service = new Re420Service()
		Re420EndpointUbw32 re420EndpointUbw32;

        if (comPort.equals("1")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(new ComponentServiceBase(), EndpointRs232.EnumSerialPorts.COM1);

        } else if (comPort.equals("2")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM2);

        } else if (comPort.equals("3")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM3);

        } else if (comPort.equals("4")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM4);

        } else if (comPort.equals("5")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM5);

        } else if (comPort.equals("6")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM6);

        } else if (comPort.equals("7")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM7);

        } else if (comPort.equals("8")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM8);

        } else if (comPort.equals("9")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM9);

        } else if (comPort.equals("10")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM10);

        } else if (comPort.equals("11")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM11);

        } else if (comPort.equals("12")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM12);

        } else if (comPort.equals("13")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM13);

        } else if (comPort.equals("14")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM14);

        } else if (comPort.equals("15")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM15);

        } else if (comPort.equals("16")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM16);

        } else if (comPort.equals("17")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM17);

        } else if (comPort.equals("18")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM18);

        } else if (comPort.equals("19")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM19);

        } else if (comPort.equals("20")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM20);

        } else if (comPort.equals("21")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM21);

        } else if (comPort.equals("22")) {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM22);

        } else {
            re420EndpointUbw32 = new Re420EndpointUbw32(EndpointRs232.EnumSerialPorts.COM1);

        }

        re420EndpointUbw32.init();
		if(!autoCycle)re420EndpointUbw32.sendCommandPwm(channel, dutyCycle);

		while (autoCycle) {
            re420EndpointUbw32.sendCommandPwm(channel, dutyCycle);
            LOGGER.log(Level.INFO, "dutyCiycle: " + dutyCycle);

            if(stepPositiv){
                if (Integer.valueOf(dutyCycle) >= 65535) dutyCycle = "0";
                dutyCycle = String.valueOf(Integer.valueOf(dutyCycle) + Integer.valueOf(step));
            }
            else {
                if (Integer.valueOf(dutyCycle) <= 1) dutyCycle = "65535";
                dutyCycle = String.valueOf(Integer.valueOf(dutyCycle) - Integer.valueOf(step));
            }
		}
		*/
	}

     public void doHangout(){

         while(!isInterrupted()){
             try {
                 doHangout(1000*60);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
     }

    private boolean isServerStarted(JettyServer server){
        while(!server.isStarted()){
            try {
                doHangout(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return true;
    }
}
