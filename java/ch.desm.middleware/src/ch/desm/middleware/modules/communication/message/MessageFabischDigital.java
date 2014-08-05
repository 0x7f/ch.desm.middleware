package ch.desm.middleware.modules.communication.message;

import java.util.ArrayList;
import java.util.Arrays;

import ch.desm.middleware.modules.communication.endpoint.serial.ubw32.EndpointUbw32RegisterAnalog;
import ch.desm.middleware.modules.component.cabine.re420.maps.Re420MapUbw32Analog;

public class MessageFabischDigital extends MessageUbw32Base {

	public MessageFabischDigital(String payload, String topic) {
		super(payload, topic);

		this.parsePayload(payload);
	}

	/**
	 * 
	 * @param payload
	 *            (IA,3,0,1IA,174,175)
	 */
	protected void parsePayload(String payload) {

		payload = payload.substring(payload.lastIndexOf("A,")+2, payload.length());
		String parts[] = payload.split(",");

		ArrayList<String> list = new ArrayList<String>(Arrays.asList(parts));

		int nrPorts = Integer.toBinaryString(Integer
				.valueOf(Re420MapUbw32Analog.PINBITMASK_INPUT_ANALOG)).length();

		int i=0;
//		while (!list.isEmpty()) {
//
//
//		}
	}

	/**
	 * 
	 */
	@Override
	public String getInputValue(String register, String pin) {
		String value = "";

		return value;
	}

	/**
	 * TODO implementation
	 */
	public String toString() {
		String s = super.toString();

		return s;
	}
}
