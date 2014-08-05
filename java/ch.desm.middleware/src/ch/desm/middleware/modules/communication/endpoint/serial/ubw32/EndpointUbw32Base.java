package ch.desm.middleware.modules.communication.endpoint.serial.ubw32;

import ch.desm.middleware.modules.communication.endpoint.serial.EndpointRs232;
import ch.desm.middleware.modules.communication.endpoint.serial.EndpointRs232Config;

public abstract class EndpointUbw32Base extends EndpointRs232 {

	public EndpointUbw32Base(EnumSerialPorts enumSerialPort,
			EndpointRs232Config config) {
		super(enumSerialPort, config);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param port
	 * @param pin
	 * @param value
	 */
	public abstract void setPinOutputDigital(String port, String pin, String value);

	/**
	 * 
	 * @param port
	 * @param pin
	 * @param value
	 */
	public abstract void getPinInputDigital(String port, String pin);
	
	/**
	 * 
	 * @param port
	 * @param pin
	 * @param value
	 */
	public abstract void getPinInputAnalog(String register);
	
}
