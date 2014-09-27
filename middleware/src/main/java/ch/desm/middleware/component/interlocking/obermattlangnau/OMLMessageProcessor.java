package ch.desm.middleware.component.interlocking.obermattlangnau;

import java.util.Map.Entry;

import org.apache.log4j.Logger;

import ch.desm.middleware.communication.message.MessageCommon;
import ch.desm.middleware.communication.message.MessageUbw32Analog;
import ch.desm.middleware.communication.message.MessageUbw32Base;
import ch.desm.middleware.communication.message.MessageUbw32DigitalRegisterComplete;
import ch.desm.middleware.communication.message.MessageUbw32DigitalRegisterSingle;
import ch.desm.middleware.communication.message.processor.MessageProcessor;
import ch.desm.middleware.component.interlocking.obermattlangnau.elements.OMLElementFahrstrassenSchalter;
import ch.desm.middleware.component.interlocking.obermattlangnau.maps.OMLMapMiddleware;

public class OMLMessageProcessor extends MessageProcessor {

	private static Logger log = Logger.getLogger(OMLMessageProcessor.class);

	private OMLElementFahrstrassenSchalter fahrStrassenSchalter;

	public OMLMessageProcessor() {
		fahrStrassenSchalter = new OMLElementFahrstrassenSchalter();
	}

	/**
	 * 
	 * @param impl
	 * @param message
	 * @param mapMiddlewareMessages
	 * @return
	 */
	public String convertToMiddlewareMessage(OML impl,
			MessageUbw32Base message, OMLMapMiddleware mapMiddlewareMessages) {

		String middlewareMessagesInput = "";

		if (message instanceof MessageUbw32DigitalRegisterSingle) {

			for (Entry<String, String> entry : impl.getEndpoint().mapDigital
					.getMap().entrySet()) {

				if (entry.getValue()
						.equals(((MessageUbw32DigitalRegisterSingle) message)
								.getPort())) {

					String key = entry.getKey();
					String parameter = ((MessageUbw32DigitalRegisterSingle) message)
							.isEnabled() == true ? "on" : "off";

					String stream = null;

					stream = mapMiddlewareMessages.getMap().get(key);

					if (stream == null) {
						try {
							throw new Exception(
									"mapping error no global id in middleware message with key: "
											+ entry.getKey() + " and value: "
											+ entry.getValue()
											+ " in message: " + message);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							log.error(e);
						}
					}

					stream = stream.replaceAll(
							MessageCommon.PARAMETER_PLACEHOLDER, parameter);
					middlewareMessagesInput = middlewareMessagesInput
							.concat(stream);

				}
			}
		}

		else if (message instanceof MessageUbw32DigitalRegisterComplete) {

			for (Entry<String, String> entry : impl.getEndpoint().mapDigital
					.getMap().entrySet()) {

				// convert input to common parameter
				boolean isInputEnabled = message.getInputValue(
						entry.getValue().substring(0),
						entry.getValue().substring(1)).contains("1");
				String parameter = isInputEnabled == true ? "on" : "off";
				String key = entry.getKey();

				String stream = null;

				stream = mapMiddlewareMessages.getMap().get(key);

				if (stream == null) {
					try {
						throw new Exception(
								"mapping error found no global id in middleware message with key: "
										+ entry.getKey() + " and value: "
										+ entry.getValue() + " in message: "
										+ message);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						log.error(e);
					}
				}else{
					
					stream = stream.replaceAll(MessageCommon.PARAMETER_PLACEHOLDER,
							parameter);

					middlewareMessagesInput = middlewareMessagesInput
							.concat(stream);
				}
			}

		} else if (message instanceof MessageUbw32Analog) {

			for (Entry<String, String> entry : impl.getEndpoint().mapAnalog
					.getMap().entrySet()) {

				String key = entry.getKey();

				if (!key.isEmpty()) {
					String stream = mapMiddlewareMessages.getMap().get(key);

					if (stream == null) {
						try {
							throw new Exception(
									"mapping error found no global id in middleware message with key: "
											+ entry.getKey() + " and value: "
											+ entry.getValue()
											+ " in message: " + message);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							log.error(e);
						}
					}

					// convert input to common parameter
					String parameter = message.getInputValue(entry.getValue(),
							"");

					// handle Fahrstrassenschalter (FSS)
					String globalIdFSS = fahrStrassenSchalter
							.getglobalId(Integer.valueOf(parameter));

					if (!globalIdFSS.isEmpty()) {
						stream = fahrStrassenSchalter.getStream(parameter);
						stream = stream.replaceAll(
								MessageCommon.PARAMETER_PLACEHOLDER, parameter);
						middlewareMessagesInput = middlewareMessagesInput
								.concat(stream);

					} else {
						stream = stream.replaceAll(
								MessageCommon.PARAMETER_PLACEHOLDER, parameter);
					}

					middlewareMessagesInput = middlewareMessagesInput
							.concat(stream);
				}
			}
		}

		log.trace("processing middleware message: " + middlewareMessagesInput);

		return middlewareMessagesInput;
	}
}