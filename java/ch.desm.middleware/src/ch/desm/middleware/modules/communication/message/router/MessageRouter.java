package ch.desm.middleware.modules.communication.message.router;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import ch.desm.middleware.modules.communication.message.MessageMiddleware;
import ch.desm.middleware.modules.communication.message.MessageUbw32Base;
import ch.desm.middleware.modules.communication.message.MessageUbw32DigitalRegisterComplete;
import ch.desm.middleware.modules.component.ComponentBase;
import ch.desm.middleware.modules.component.cabine.re420.Re420BaseImpl;
import ch.desm.middleware.modules.component.interlocking.obermattlangnau.OMLBaseImpl;
import ch.desm.middleware.modules.component.simulation.locsim.LocsimBaseImpl;
import ch.desm.middleware.modules.component.simulation.locsim.LocsimConfig;
import ch.desm.middleware.modules.component.simulation.locsim.elements.LocsimElementFahrschalter;
import ch.desm.middleware.modules.component.simulation.locsim.maps.LocsimMapRs232;

/**
 * 
 * @author Sebastian
 * 
 */
public class MessageRouter {

	private static Logger log = Logger.getLogger(MessageRouter.class);
	private LocsimElementFahrschalter fahrschalter;

	public MessageRouter() {
		fahrschalter = new LocsimElementFahrschalter();
	}

	/**
	 * 
	 * @param component
	 * @param message
	 */
	public void processEndpointMessage(ComponentBase component, String message,
			String topic) {
		if (message != null && !message.isEmpty()) {
			component.publish(message, topic);
		}
	}

	/**
	 * 
	 * @param impl
	 * @param messages
	 */
	public void processBrokerMessage(LocsimBaseImpl impl,
			ArrayList<MessageMiddleware> messages) {

		for (MessageMiddleware message : messages) {
			this.processBrokerMessage(impl, message);
		}
	}

	/**
	 * 
	 * @param impl
	 * @param messages
	 */
	public void processBrokerMessage(Re420BaseImpl impl,
			ArrayList<MessageMiddleware> messages) {

		for (MessageMiddleware message : messages) {
			this.processBrokerMessage(impl, message);
		}
	}

	/**
	 * 
	 * @param impl
	 * @param messages
	 */
	public void processBrokerMessage(OMLBaseImpl impl,
			ArrayList<MessageMiddleware> messages) {

		for (MessageMiddleware message : messages) {
			this.processBrokerMessage(impl, message);
		}
	}

	/**
	 * TODO implementation
	 * 
	 * @param impl
	 * @param message
	 */
	private void processBrokerMessage(LocsimBaseImpl impl,
			MessageMiddleware message) {

		if (impl.isLocsimDllMessage(message.getGlobalId())) {

			// TODO implementation of dll messages
			// ....
		}

		else if (impl.isLocsimSoftwareMessage(message.getOutputInput())) {

			// send locsim interface ready to start simulation
			if (message.getGlobalId().equalsIgnoreCase(
					"locsim.initialization.ready.ini1")) {
				// init message
			}

			else if (message.getGlobalId().equalsIgnoreCase(
					"locsim.initialization.ready.ini2")) {
				impl.getEndpointRs232().sendMessage("INI2");
			}

			else if (message.getGlobalId().equalsIgnoreCase(
					"locsim.initialization.ready.ini7")) {
				// wait for polling - nothing to do
			}
		}

		else {

			// delegate needed fahrschalter messages
			if (fahrschalter.getMap().containsValue(message.getGlobalId())) {

				// find locsim needed keys
				HashMap<String, String> fahrschalterKeys = fahrschalter
						.getLocsimNeededKeys(message.getGlobalId());

				if (!fahrschalterKeys.isEmpty()) {

					for (Entry<String, String> element : fahrschalterKeys
							.entrySet()) {

						String channelData = element.getKey();
						if (channelData.isEmpty()) {
							log.warn("no locsim mapping with message: "
									+ message);
						}
						String channelType = channelData.substring(0, 1);
						String channel = channelData.substring(1, 3);
						String parameter = "0000";
						String locsimCommand = "X" + channelType + channel
								+ parameter + "Y";

						impl.getEndpointRs232().sendMessage(locsimCommand);
					}
				}

				String channelData = fahrschalter.getKey(message.getGlobalId());
				if (channelData.isEmpty()) {
					log.warn("no locsim mapping with message: " + message);
				}
				String channelType = channelData.substring(0, 1);
				String channel = channelData.substring(1, 3);
				String parameter = getParameterValue(message.getParameter());
				String locsimCommand = "X" + channelType + channel + parameter
						+ "Y";

				impl.getEndpointRs232().sendMessage(locsimCommand);

				// no fahrschalter command
			} else {

				LocsimMapRs232 locsimMap = new LocsimMapRs232();
				String channelData = locsimMap.getKey(message.getGlobalId());

				String parameter = message.getParameter();
				String channelType = channelData.substring(0, 1);
				String channel = channelData.substring(1, 3);

				// conversion Hauptleitung, Bremszylinder pressure
				if (channelData.equals("V00") || channelData.equals("V01")) {
					
					
					
					double x = Double.valueOf(parameter);
					x = (x-180)/100;
					//(x^2)/8
					
					double locsimValue = Math.sqrt(Math.pow(x, 3)); //((Math.pow(x, 3)) / 100);
					locsimValue *= 100;
					if (locsimValue < 0) {
						locsimValue = 0;
					} else if (locsimValue > 255) {
						locsimValue = 255;
					}

					String locsimParameter = Integer.toHexString((int)locsimValue);

					while (locsimParameter.length() < 4) {
						locsimParameter = locsimParameter + "0";
					}

					System.out.println("x: " +x + ", locsimValue: " + locsimValue + ", locsimParameter: " + locsimParameter);
					
					parameter = locsimParameter;

				} else {
					parameter = getParameterValue(message.getParameter());
				}

				if (channelData.isEmpty()) {
					log.warn("no locsim mapping with message: " + message);
				}

				String locsimCommand = "X" + channelType + channel + parameter
						+ "Y";

				impl.getEndpointRs232().sendMessage(locsimCommand);

			}

		}

	}

	boolean init1 = false;

	/**
	 * TODO refactoring
	 * 
	 * @param impl
	 * @param message
	 */
	private void processBrokerMessage(Re420BaseImpl impl,
			MessageMiddleware message) {

		// is software message
		if (message.getOutputInput().equalsIgnoreCase(
				MessageUbw32Base.MESSAGE_CHAR_ONLYSOFTWARE)) {

			if (message.getGlobalId().equalsIgnoreCase(
					"locsim.initialization.ready.ini1")
					&& !init1) {
				impl.getEndpointUbw32().setCacheEnabled(false);
				impl.getEndpointUbw32().startPolling();
				init1 = true;
			}

			else if (message.getGlobalId().equalsIgnoreCase(
					"locsim.initialization.ready.ini2")) {
				// nothing to do
			}

			else if (message.getGlobalId().equalsIgnoreCase(
					"locsim.initialization.ready.ini7")) {
				impl.getEndpointUbw32().pollingCommand();
				impl.getEndpointUbw32().setCacheEnabled(false);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				impl.getEndpointUbw32().setCacheEnabled(true);
			}

			else if (message.getGlobalId().equalsIgnoreCase(
					"locsim.initialization.ready.ini8")) {
				// nothing to do
			}

			// is hardware message
		} else {

			String value = getParameterValue(message.getParameter());
			boolean isInput = message.getOutputInput().equals(
					MessageUbw32Base.MESSAGE_CHAR_INPUT);

			// is digital message
			if (impl.getEndpointUbw32().getMapDigital()
					.isKeyAvailable(message.getGlobalId())) {

				String endpointRegister = impl.getEndpointUbw32().getMapDigital()
						.getMap().get(message.getGlobalId());
				String registerName = String
						.valueOf(endpointRegister.charAt(0));
				String pin = String.valueOf(endpointRegister.charAt(1));

				if (isInput) {
					impl.getEndpointUbw32().getPinInputDigital(registerName, pin);
				} else {
					impl.getEndpointUbw32().setPinOutputDigital(registerName, pin,
							value);
				}

				// is analog message
			} else if (impl.getEndpointUbw32().getMapAnalog()
					.isKeyAvailable(message.getGlobalId())) {

				String endpointRegister = impl.getEndpointUbw32().getMapAnalog()
						.getMap().get(message.getGlobalId());

				if (isInput) {
					impl.getEndpointUbw32().getPinInputAnalog(endpointRegister);
				}

			} else {
				log.warn(impl.getClass() + "> processBrokerMessage skipped:"
						+ message);
			}
		}

		// TODO fabisch broker messages

	}

	/**
	 * TODO implementation
	 * 
	 * @param impl
	 * @param message
	 */
	private void processBrokerMessage(OMLBaseImpl impl,
			MessageMiddleware message) {

	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	private String getParameterValue(String value) {
		String returnValue = "";

		if (value
				.equals(MessageUbw32DigitalRegisterComplete.MESSAGE_PARAMETER_OFF)) {
			returnValue = "0000";
		} else if (value
				.equals(MessageUbw32DigitalRegisterComplete.MESSAGE_PARAMETER_ON)) {
			returnValue = "0001";
		} else {
			returnValue = String.valueOf(Integer.toHexString(Integer
					.valueOf(value)));
			if (returnValue.length() < 4) {
				while (returnValue.length() < 4) {
					returnValue = "0" + returnValue;
				}
			}
		}
		return returnValue.toUpperCase();
	}
}
