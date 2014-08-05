package ch.desm.middleware.modules.component.simulation.locsim;

import jssc.SerialPortException;
import ch.desm.middleware.modules.communication.endpoint.serial.EndpointRs232;
import ch.desm.middleware.modules.communication.endpoint.serial.EndpointRs232Config;
import ch.desm.middleware.modules.communication.endpoint.serial.EndpointRs232ConfigBuilder;

public class LocsimEndpointRs232 extends EndpointRs232 {
	
	public static final String LOCSIM_INIT_MESSAGE = "INI1";
	public static final String LOCSIM_RS232_IDENTIFIER_CONFIG = "locsim.rs232.config";
	public static final String LOCSIM_RS232_IDENTIFIER = "locsim.rs232";
	
	public LocsimEndpointRs232Parser parser;
	public boolean isLocsimInitialized;
	public boolean isLocsimReadyToInitialize;
	
	public LocsimEndpointRs232(EnumSerialPorts enumSerialPort) {		
		super(enumSerialPort, new EndpointRs232ConfigBuilder()
			.setBaudRate(EndpointRs232Config.BAUDRATE_38400)
			.setDataBits(EndpointRs232Config.DATABITS_8)
			.setStopBits(EndpointRs232Config.STOPBITS_1)
			.setParity(EndpointRs232Config.PARITY_NONE)
			.setEventMask(EndpointRs232Config.MASK_RXCHAR)
			.setFlowControl(EndpointRs232Config.FLOWCONTROL_XONXOFF_IN | EndpointRs232Config.FLOWCONTROL_XONXOFF_OUT)
			.build());
		
		this.parser = new LocsimEndpointRs232Parser();
		this.isLocsimInitialized = false;
		this.isLocsimReadyToInitialize = false;
	}
	
	public boolean isLocsimInitializationMessage(String message){
		return message.contentEquals(LOCSIM_INIT_MESSAGE);
	}
	
	public void sendMessage(String command){
		try {
			super.sendStream(command);
		} catch (SerialPortException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
