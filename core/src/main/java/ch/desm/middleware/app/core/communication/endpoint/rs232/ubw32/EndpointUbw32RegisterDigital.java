package ch.desm.middleware.app.core.communication.endpoint.rs232.ubw32;


public class EndpointUbw32RegisterDigital extends EndpointUbw32RegisterBase  {

	public static final int ALL_PINS_ON = 65535;
	
	/**
	 * 0 = output
	 * 1 = input
	 * 
	 * Pin-Mask
	 * default = 65535 = FF FF = 1111 1111  1111 1111 > all pins are configured for output
	 */
	private int pinBitMask;
	
	public EndpointUbw32RegisterDigital(String pinBitMask){
		this.pinBitMask = Integer.parseInt(pinBitMask);
	}
	
	/**
	 * 
	 * @return
	 */
	public int getPinBitMask(){
		return pinBitMask;
	}
}
