package ch.desm.middleware.app.core.component.cabine.re420;

import java.util.LinkedList;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import ch.desm.middleware.app.core.communication.broker.Broker;
import ch.desm.middleware.app.core.communication.message.MessageBase;
import ch.desm.middleware.app.core.communication.message.MessageCommon;
import ch.desm.middleware.app.core.communication.message.MessageMiddleware;
import ch.desm.middleware.app.core.communication.message.MessageUbw32Base;
import ch.desm.middleware.app.core.communication.message.translator.MessageTranslatorMiddleware;

public class Re420BrokerClient extends Re420BrokerClientBase {

	private static Logger LOGGER = Logger.getLogger(Re420BrokerClient.class);

    Re420Service service;
	private Re420MessageProcessor processor;
	private MessageTranslatorMiddleware translator;


	public Re420BrokerClient(Broker broker, Re420Service service) {
		super(broker, service.getendpointUbw(), service.getendpointFabisch());

        this.service = service;
		this.processor = new Re420MessageProcessor();
		this.translator = new MessageTranslatorMiddleware();

	}

	/**
	 * 
	 */
	protected void onIncomingBrokerMessage(String message) {

		LOGGER.log(Level.TRACE, "broker (" + this.getClass() + ") received message: "
                + message);

		LinkedList<MessageMiddleware> messageCommon = translator
				.toMiddlewareMessageList(message);

		processor.processBrokerMessage(this, messageCommon);
	}

	/**
	 * TODO implementation
	 * 
	 * @param message
	 */
	public void onIncomingEndpointMessage(String message) {

		LOGGER.log(Level.TRACE, "endpoint (" + this.getClass() + ") received message: "
                + message.replaceAll("\n", ""));

		if (!message.isEmpty()) {
			
			if(message.startsWith("#fabisch#")){
				
				LOGGER.log(Level.TRACE, "endpoint (" + this.getClass()
                        + ") received message fabisch: " + message);
				
				//do nothing
			}else{
			
				LOGGER.log(Level.DEBUG, "endpoint (" + this.getClass()
						+ ") received message RS232: " + message);
				
				processIncomingUbw32(message);
			}
			
		}
	}
	
	private void processIncomingUbw32(String message){

		MessageUbw32Base ubw32Message = translator
				.decodeUbw32EndpointMessage(message,
						MessageCommon.MESSAGE_TOPIC_CABINE_RE420);

		if(ubw32Message != null){
			
			String messages = processor.convertToMiddlewareMessage(this, ubw32Message);

            //TODO refactoring
			//processor.processEndpointMessage(this, messages,
			//		MessageBase.MESSAGE_TOPIC_CABINE_RE420);
		}		
	}

	/**
	 * 
	 */
	@Override
	protected void intializeSignedTopic() {
		signForTopic(MessageBase.MESSAGE_TOPIC_SIMULATION_LOCSIM);
		signForTopic(MessageBase.MESSAGE_TOPIC_SIMULATION_LOCSIM_RS232);
		signForTopic(MessageBase.MESSAGE_TOPIC_CABINE_RE420_FABISCH);
        signForTopic(MessageBase.MESSAGE_TOPIC_SIMULATION_ZUSI_FAHRPULT);
		signForTopic(MessageBase.MESSAGE_TOPIC_MANAGEMENT);
	}



}