package ch.desm.middleware.modules.communication.controller;

import java.util.ArrayList;

import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;
import ch.desm.middleware.modules.communication.CommunicationControllerAbstract;

public class Rs232 extends CommunicationControllerAbstract{
	
	protected ArrayList<SerialPort> serialPorts;
	
	public static enum EnumSerialPorts {
		COM1, COM2, COM3, COM4, COM5, COM6, COM7, COM8, COM9, COM10;
	}
	
	public Rs232(){
		serialPorts = new ArrayList<SerialPort>();
		this.showSerialPortNames();
	}
	
	@Override
	public void initialize(){
		super.initialize();
		this.initializeSerialPorts();
	}
	
	public ArrayList<SerialPort> getSerialPorts(){
		return serialPorts;
	}
	
	/**
	 * Method getPortNames() returns an array of strings.
	 * Elements of the array is already sorted.
	 */
	public void showSerialPortNames(){
    String[] portNames = SerialPortList.getPortNames();
    for(int i = 0; i < portNames.length; i++){
        System.out.println(portNames[i]);
    	}
	}
	
	public void addSerialPort(EnumSerialPorts serialport){
		System.out.println("adding Port: "+ serialport.name());
		serialPorts.add(new SerialPort(serialport.name()));
	}
	
	private void initializeSerialPorts(){
		System.out.println("intialize port(s)...");
		
		for(SerialPort port : serialPorts){
			System.out.println(port.getPortName());
			try {     	
	        	port.openPort();
	        	port.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
	            //Preparing a mask. In a mask, we need to specify the types of events that we want to track.
	            //Well, for example, we need to know what came some data, thus in the mask must have the
	            //following value: MASK_RXCHAR. If we, for example, still need to know about changes in states 
	            //of lines CTS and DSR, the mask has to look like this: SerialPort.MASK_RXCHAR + SerialPort.MASK_CTS + SerialPort.MASK_DSR
	            
	            //Set the prepared mask
	            port.setEventsMask(SerialPort.MASK_RXCHAR);
	        }
			
	        catch (SerialPortException e) {
	            System.err.println(e);
	        }
		}
		System.out.println("... all serial port(s) initialized");
	}
		
	public void disconnectSerialPorts(){
		System.out.print("disconnecting all opened serial ports...");
		
		for(SerialPort port : serialPorts){
			try {
				if(port.isOpened()){
					System.out.print(port.getPortName()+ " ");
					port.purgePort(SerialPort.PURGE_RXABORT);
					port.purgePort(SerialPort.PURGE_TXABORT);
					port.closePort();
				}
			} catch (SerialPortException e) {
				System.err.println(e);
			}
		}
	}
	
	public void testSeriaPorts(){
		for(SerialPort port : serialPorts){
			try {
				port.writeString("Write Test to Serialport ..."+port.getPortName() + "\r\n");				
			} catch (SerialPortException e) {
				System.err.println(e);
			}
		}
	}
	
	protected boolean send(EnumSerialPorts enumPort, String commandString){
		boolean isPortFound = false;
		
		try {
			for(SerialPort port : serialPorts){
				if(port.getPortName().equals(enumPort.name())){	
						port.writeString(commandString);
						isPortFound = true;
				}
			}
			
			if(!isPortFound){
				throw new Exception("The serial port "+enumPort.name()+" is not connected.");
			}
		
		} catch (SerialPortException e) {
			System.err.println(e);
		} catch (Exception e){
			System.err.println(e);
		}
		
		return isPortFound;
	}
}
