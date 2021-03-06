package ch.desm.middleware.app.core.communication.endpoint.rs232.ubw32;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.HashMap;

import jssc.SerialPort;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class EndpointUbw32Cache {

	private static Logger LOGGER = Logger.getLogger(EndpointUbw32Cache.class);
	
	private String stateI;
	private LinkedList<String> statePI;
	private HashMap<String, String> stateMapIA;
	private boolean isCacheEnabled;
	
	public EndpointUbw32Cache() {
		this.stateI = "";
		this.statePI = new LinkedList<String>();
		this.stateMapIA = new HashMap<String, String>();
		this.isCacheEnabled = EndpointUbw32Config.CACHE_ENABLED;
	}

	public void reset(){
		this.stateI = "";
		this.statePI = new LinkedList<String>();
		this.stateMapIA = new HashMap<String, String>();
		this.isCacheEnabled = EndpointUbw32Config.CACHE_ENABLED;
	}
	
	public void setCacheEnabled(boolean value){
		this.isCacheEnabled = value;
	}
	
	public boolean isCacheEnabled(){
		return this.isCacheEnabled;
	}
	
	public boolean isStateChanged(String message, SerialPort serialPort) {

		if(!isCacheEnabled){
			LOGGER.log(Level.TRACE, "cache disabled.");
			return true;
		}
		
		boolean isChanged = false;
		message = message.replaceAll("\n", "");
		
		// e.g. IA,16,873,651,17,32,19,14,15,14,17,15,14,15,15,13
		// AN0,AN1,AN3,AN0,AN1,AN3,AN0,AN1,AN3,AN0,AN1,AN3,AN0,AN1,AN3
		if (message.startsWith("IA")) {
			
			portAN0 = new EndpointUbw32RegisterAnalog("1");
			portAN1 = new EndpointUbw32RegisterAnalog("2");
			portAN2 = new EndpointUbw32RegisterAnalog("4");
			portAN3 = new EndpointUbw32RegisterAnalog("8");
			portAN4 = new EndpointUbw32RegisterAnalog("16");
			portAN5 = new EndpointUbw32RegisterAnalog("32");
			portAN6 = new EndpointUbw32RegisterAnalog("64");
			portAN7 = new EndpointUbw32RegisterAnalog("128");
			portAN8 = new EndpointUbw32RegisterAnalog("256");
			portAN9 = new EndpointUbw32RegisterAnalog("512");
			portAN10 = new EndpointUbw32RegisterAnalog("1024");
			portAN11 = new EndpointUbw32RegisterAnalog("2048");
			portAN12 = new EndpointUbw32RegisterAnalog("5096");
			portAN13 = new EndpointUbw32RegisterAnalog("10192");
			portAN14 = new EndpointUbw32RegisterAnalog("20384");
			portAN15 = new EndpointUbw32RegisterAnalog("40768");

            LOGGER.log(Level.TRACE, "analog state message:" + message);

            String pinbitmask = getPinBitMaskIA(message);

			if (!stateMapIA.isEmpty() && stateMapIA.get(pinbitmask) != null) {
				String inputValue = getInputValue(message);
				int oldValue = Integer.valueOf(stateMapIA.get(pinbitmask));
				int newValue = Integer.valueOf(inputValue);

				double median = (Integer.valueOf(oldValue) + Integer
						.valueOf(newValue)) / 2;

				double driftNew = Math.abs(median - newValue);
				double driftOld = Math.abs(median - oldValue);

				isChanged = driftNew > EndpointUbw32Config.ANALOG_DRIFT_MAX
						|| driftOld > EndpointUbw32Config.ANALOG_DRIFT_MAX;

				if (isChanged) {
					LOGGER.log(Level.TRACE, "analog state significantly changed> " + "drift new: " + driftNew + ", driftOld" + driftOld + ", message:" + message);
					stateMapIA.replace(pinbitmask, inputValue);
				}

			} else {
				stateMapIA.put(pinbitmask, getInputValue(message));
				isChanged = true;
			}
		}

		else if (message.startsWith("I")) {
			
			if(!stateI.isEmpty()){
				String oldState = convertToBinaryStream(stateI);
				String newState = convertToBinaryStream(message);
				
				oldState = overridePin(oldState, 4, 4);
				newState = overridePin(newState, 4, 4);
				
				if(!oldState.equals(newState)){
					stateI = message;
					isChanged = true;
				}
			}else{
				stateI = message;
				isChanged = true;
			}
		}

		// e.g. PI,G,8PI,0
		else if (message.startsWith("PI")) {

			if (statePI.isEmpty()) {
				statePI.add(message);
			} else {

				String[] messageParts = message.split(",");
				boolean contains = false;

				for (int i = 0; i < statePI.size(); i++) {
					String element = statePI.get(i);

					String[] elementParts = element.split(",");

					// [1] = register, [2] = pin
					if (elementParts[1].equals(messageParts[1])
							&& elementParts[2].equals(messageParts[2])) {

						// is contained
						contains = true;
						
						if (!elementParts[3].equals(messageParts[3])) {
							statePI.set(i, message);
							isChanged = true;
						}
					}
				}

				if (!contains) {
					statePI.add(message);
				}
			}
		}

		if (isChanged) {
			LOGGER.log(Level.TRACE, "cache state changed on ubw("
					+ serialPort.getPortName() + "): " + message);
		}
		
		return isChanged;
	}

	public String changeBinaryStreamLength(String mask, int len){
		while(mask.length() < len){
			mask = "0" + mask;
		}
		
		return mask;
	}
		
	public String convertToBinaryStream(String s){
		
		String[] stateArray = s.split(",");
		
		String binaryStream = "";
		for(int i = 1; i<stateArray.length; i++){
			int value = Integer.valueOf(stateArray[i]);
			String binaryString = Integer.toBinaryString(value);
			
			String portBinary = changeBinaryStreamLength(binaryString, 15);
			
			if(i == 5){
				portBinary = overridePin(portBinary, i, 4);
			}
			
			binaryStream += portBinary;
			binaryStream += ",";
		}
		
		return binaryStream;
	}
	
	public String overridePin(String state, int port, int pin){
		
		String portMask = "";
		for(int i = 0; i<state.length(); i++){
			
			if(i == state.length()- pin){
				portMask += "0";
			}else{
				portMask += state.charAt(i);
			}
		}
		
		return portMask;
	}
	
	private EndpointUbw32RegisterAnalog portAN0;
	private EndpointUbw32RegisterAnalog portAN1;
	private EndpointUbw32RegisterAnalog portAN2;
	private EndpointUbw32RegisterAnalog portAN3;
	private EndpointUbw32RegisterAnalog portAN4;
	private EndpointUbw32RegisterAnalog portAN5;
	private EndpointUbw32RegisterAnalog portAN6;
	private EndpointUbw32RegisterAnalog portAN7;
	private EndpointUbw32RegisterAnalog portAN8;
	private EndpointUbw32RegisterAnalog portAN9;
	private EndpointUbw32RegisterAnalog portAN10;
	private EndpointUbw32RegisterAnalog portAN11;
	private EndpointUbw32RegisterAnalog portAN12;
	private EndpointUbw32RegisterAnalog portAN13;
	private EndpointUbw32RegisterAnalog portAN14;
	private EndpointUbw32RegisterAnalog portAN15;

	/**
	 * 
	 * @param payload
	 *            (IA,3,0,1IA,174,175)
	 * 
	 */
	protected void parsePayload(String payload) {

		if (payload.isEmpty()) {
			return;
		}

		String pinbitmask = getPinBitMaskIA(payload);

		payload = payload.substring(payload.lastIndexOf("A,") + 2,
				payload.length());
		String parts[] = payload.split(",");

		LOGGER.log(Level.TRACE, "analog sensor values: " + payload);
		
		LinkedList<String> list = new LinkedList<String>(Arrays.asList(parts));

		int nrPorts = Integer.toBinaryString(Integer.valueOf(pinbitmask))
				.length();

		int i = 0;
		while (!list.isEmpty()) {

			switch (i % nrPorts) {
			case (0): {
				portAN0.addValue(list.get(0));
				break;
			}
			case (1): {
				portAN1.addValue(list.get(0));
				break;
			}
			case (2): {
				portAN2.addValue(list.get(0));
				break;
			}
			case (3): {
				portAN3.addValue(list.get(0));
				break;
			}
			case (4): {
				portAN4.addValue(list.get(0));
				break;
			}
			case (5): {
				portAN5.addValue(list.get(0));
				break;
			}
			case (6): {
				portAN6.addValue(list.get(0));
				break;
			}
			case (7): {
				portAN7.addValue(list.get(0));
				break;
			}
			case (8): {
				portAN8.addValue(list.get(0));
				break;
			}
			case (9): {
				portAN9.addValue(list.get(0));
				break;
			}
			case (10): {
				portAN10.addValue(list.get(0));
				break;
			}
			case (11): {
				portAN11.addValue(list.get(0));
				break;
			}
			case (12): {
				portAN12.addValue(list.get(0));
				break;
			}
			case (13): {
				portAN13.addValue(list.get(0));
				break;
			}
			case (14): {
				portAN14.addValue(list.get(0));
				break;
			}
			case (15): {
				portAN15.addValue(list.get(0));
				break;
			}

			}

			list.remove(0);
			i++;
		}
	}

	private String getPinBitMaskIA(String payload) {
		String pinbitmask = payload.substring(3);
		pinbitmask = pinbitmask.substring(0, pinbitmask.indexOf(","));

		return pinbitmask;
	}

	/**
	 * 
	 */
	public String getInputValue(String message) {

		if (message.isEmpty()) {
			return "-1";
		}

		parsePayload(message);

		String pinbitmask = Integer.toBinaryString(Integer
				.valueOf(getPinBitMaskIA(message)));
		int value = 0;

		for (int i = 0; i < pinbitmask.length(); i++) {

			if (pinbitmask.charAt(i) == '1') {

				switch (i) {
					case (0): {
						value += Integer.valueOf(portAN0.getAverageValue());
						break;
					}
					case (1): {
						value += Integer.valueOf(portAN1.getAverageValue());
						break;
					}
					case (2): {
						value += Integer.valueOf(portAN2.getAverageValue());
						break;
					}
					case (3): {
						value += Integer.valueOf(portAN3.getAverageValue());
						break;
					}
					case (4): {
						value += Integer.valueOf(portAN4.getAverageValue());
						break;
					}
					case (5): {
						value += Integer.valueOf(portAN5.getAverageValue());
						break;
					}
					case (6): {
						value += Integer.valueOf(portAN6.getAverageValue());
						break;
					}
					case (7): {
						value += Integer.valueOf(portAN7.getAverageValue());
						break;
					}
					case (8): {
						value += Integer.valueOf(portAN8.getAverageValue());
						break;
					}
					case (9): {
						value += Integer.valueOf(portAN9.getAverageValue());
						break;
					}
					case (10): {
						value += Integer.valueOf(portAN10.getAverageValue());
						break;
					}
					case (11): {
						value += Integer.valueOf(portAN11.getAverageValue());
						break;
					}
					case (12): {
						value += Integer.valueOf(portAN12.getAverageValue());
						break;
					}
					case (13): {
						value += Integer.valueOf(portAN13.getAverageValue());
						break;
					}
					case (14): {
						value += Integer.valueOf(portAN14.getAverageValue());
						break;
					}
					case (15): {
						value += Integer.valueOf(portAN15.getAverageValue());
						break;
					}
				}
			}
		}

		portAN0.resetValue();
		portAN1.resetValue();
		portAN2.resetValue();
		portAN3.resetValue();
		portAN4.resetValue();
		portAN5.resetValue();
		portAN6.resetValue();
		portAN7.resetValue();
		portAN8.resetValue();
		portAN9.resetValue();
		portAN10.resetValue();
		portAN11.resetValue();
		portAN12.resetValue();
		portAN13.resetValue();
		portAN14.resetValue();
		portAN15.resetValue();
		return String.valueOf(value);
	}
}
