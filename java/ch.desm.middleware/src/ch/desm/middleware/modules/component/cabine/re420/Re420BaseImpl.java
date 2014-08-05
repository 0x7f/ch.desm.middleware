package ch.desm.middleware.modules.component.cabine.re420;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import ch.desm.middleware.modules.communication.broker.Broker;
import ch.desm.middleware.modules.communication.endpoint.serial.ubw32.EndpointUbw32ListenerInterface;
import ch.desm.middleware.modules.communication.message.MessageBase;
import ch.desm.middleware.modules.communication.message.MessageCommon;
import ch.desm.middleware.modules.communication.message.MessageFabischAnalog;
import ch.desm.middleware.modules.communication.message.MessageMiddleware;
import ch.desm.middleware.modules.communication.message.MessageUbw32Base;
import ch.desm.middleware.modules.communication.message.router.MessageRouter;
import ch.desm.middleware.modules.communication.message.translator.MessageTranslatorMiddleware;
import ch.desm.middleware.modules.communication.message.translator.MessageTranslatorRs232;
import ch.desm.middleware.modules.component.cabine.re420.maps.Re420MapMiddleware;

public class Re420BaseImpl extends Re420Base implements
		EndpointUbw32ListenerInterface {

	private static Logger log = Logger.getLogger(Re420BaseImpl.class);

	public Re420MapMiddleware mapMiddlewareMessages;
	private Re420MessageProcessor converter;
	private MessageTranslatorMiddleware translator;
	private MessageRouter router;

	public Re420BaseImpl(Broker broker, Re420EndpointUbw32 endpoint,
			Re420EndpointFabisch endpointFabisch) {
		super(broker, endpoint, endpointFabisch);

		this.mapMiddlewareMessages = new Re420MapMiddleware();
		this.converter = new Re420MessageProcessor();
		this.translator = new MessageTranslatorMiddleware();
		this.router = new MessageRouter();
	}

	/**
	 * 
	 */
	protected void onIncomingBrokerMessage(String message) {

		log.trace("broker (" + this.getClass() + ") received message: "
				+ message);

		ArrayList<MessageMiddleware> messageCommon = translator
				.translateToCommonMiddlewareMessageList(message);

		router.processBrokerMessage(this, messageCommon);
	}

	/**
	 * TODO implementation
	 * 
	 * @param message
	 */
	public void onIncomingEndpointMessage(String message) {

		log.trace("endpoint (" + this.getClass() + ") received message: "
				+ message.replaceAll("\n", ""));

//		if (!message.isEmpty()) {
//			if (isUbw32Message(message)) {
//				log.trace("endpoint (" + this.getClass()
//						+ ") received message DLL: " + message);
//				processIncomingDataRs232(message);
//
//			} else {
//				log.trace("endpoint (" + this.getClass()
//						+ ") received message RS232: " + message);
//				processIncomingDataFabisch(message);
//			}
//		}

		// add seperator
		message = message.substring(message.indexOf("#"), message.length());

		// convert from endpoint to middleware message
		// String messages = converter.convertToMiddlewareMessage(this, message,
		// mapMiddlewareMessages);

		// decode fabi message

		// convert to common middleware message
		// message = translator
		// .translateToCommonMiddlewareMessageList(message,
		// MessageBase.MESSAGE_TOPIC_CABINE_RE420_FABISCH);

		// router.processEndpointMessage(this, message,
		// MessageBase.MESSAGE_TOPIC_SIMULATION_LOCSIM_RS232);
		//
		// //process endpoint message, send to broker
		// router.processEndpointMessage(this, messages,
		// MessageBase.MESSAGE_TOPIC_CABINE_RE420);

		MessageUbw32Base ubw32Message = translator.decodeUbw32EndpointMessage(
				message, MessageCommon.MESSAGE_TOPIC_CABINE_RE420);

		if (ubw32Message != null) {

			String messages = converter.convertToMiddlewareMessage(this,
					ubw32Message, mapMiddlewareMessages);

			router.processEndpointMessage(this, messages,
					MessageBase.MESSAGE_TOPIC_CABINE_RE420);

		}

	}

	/**
	 * 
	 */
	@Override
	public boolean hasTopicSigned(String topic) {
		return signedTopic.contains(topic);
	}

	/**
	 * 
	 */
	@Override
	protected void intializeSignedTopic() {
		signedTopic.add(MessageBase.MESSAGE_TOPIC_SIMULATION_LOCSIM);
		signedTopic.add(MessageBase.MESSAGE_TOPIC_SIMULATION_LOCSIM_RS232);
	}

}
