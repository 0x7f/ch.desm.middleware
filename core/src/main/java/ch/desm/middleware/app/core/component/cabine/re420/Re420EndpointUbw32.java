package ch.desm.middleware.app.core.component.cabine.re420;

import ch.desm.middleware.app.core.communication.endpoint.rs232.ubw32.EndpointUbw32;
import ch.desm.middleware.app.core.communication.message.MessageBase;
import ch.desm.middleware.app.core.communication.message.MessageCommon;
import ch.desm.middleware.app.core.communication.message.MessageUbw32Base;
import ch.desm.middleware.app.core.component.cabine.re420.maps.Re420MapUbw32Analog;
import ch.desm.middleware.app.core.component.cabine.re420.maps.Re420MapUbw32Digital;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Re420EndpointUbw32 extends EndpointUbw32 {

    private static Logger LOGGER = Logger.getLogger(Re420EndpointUbw32.class);

	protected Re420MapUbw32Digital re420MapDigital;
	protected Re420MapUbw32Analog re420MapAnalog;
	protected Re420Service service;
	
	public Re420EndpointUbw32(Re420Service service, EnumSerialPorts enumSerialPort) {
		super(enumSerialPort, Re420MapUbw32Digital.PINBITMASK_CONFIGURATION_DIGITAL, Re420MapUbw32Analog.PINBITMASK_INPUT_ANALOG);
		this.registerEndpointListener();

		this.service = service;
		re420MapDigital = new Re420MapUbw32Digital();
		re420MapAnalog = new Re420MapUbw32Analog();
	}

	public Re420MapUbw32Analog getMapAnalog(){
		return re420MapAnalog;
	}

	public Re420MapUbw32Digital getMapDigital(){
		return re420MapDigital;
	}

    @Override
    protected void registerEndpointListener() {
        try {
            addEndpointListener(this);
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, e);
        }
    }

	/**
	 *
	 * @param message
	 */
	@Override
	public void onIncomingEndpointMessage(String message) {
		LOGGER.log(Level.TRACE, "endpoint (" + getSerialPortName() + ") received message: " + message);

		service.getMessageProcessor().processEndpointMessage(service, message);
	}
}
