package ch.desm.middleware.app.core.component.management;

import java.util.LinkedList;

import ch.desm.middleware.app.core.component.ComponentBrokerClientBase;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import ch.desm.middleware.app.core.communication.broker.Broker;
import ch.desm.middleware.app.core.communication.message.MessageBase;
import ch.desm.middleware.app.core.communication.message.MessageMiddleware;

import javax.websocket.EncodeException;

public class ManagementBrokerClient extends ComponentBrokerClientBase {

	private static Logger LOGGER = Logger.getLogger(ManagementBrokerClient.class);

    private ManagementService service;

	public ManagementBrokerClient(Broker broker, ManagementService service) {
		super(broker);
        this.service = service;
	}

	@Override
	protected void onIncomingBrokerMessage(String message) {
		LOGGER.log(Level.TRACE, "receive broker message: " + message);
		
		//translation
		LinkedList<MessageMiddleware> messageList = service.getTranslator().toMiddlewareMessageList(message);
		
		//send all messages
		for(MessageMiddleware element: messageList){
            try {
                String messageWebsocket = service.getEncoder().encode(service.getConverter().toCharacterStream(element));
                ManagementEndpointWebsocketClient.sendMessage(messageWebsocket);
            } catch (EncodeException e) {
                LOGGER.log(Level.ERROR, e);
            }

		}
	}

	@Override
	protected void intializeSignedTopic() {
		signForTopic(MessageBase.MESSAGE_TOPIC_CABINE_RE420);
		signForTopic(MessageBase.MESSAGE_TOPIC_CABINE_RE420_FABISCH);
		signForTopic(MessageBase.MESSAGE_TOPIC_INTERLOCKING_OBERMATT_LANGNAU);
		signForTopic(MessageBase.MESSAGE_TOPIC_PETRINET_OBERMATT_LANGNAU);
		signForTopic(MessageBase.MESSAGE_TOPIC_SIMULATION_LOCSIM);
		signForTopic(MessageBase.MESSAGE_TOPIC_SIMULATION_LOCSIM_DLL);
		signForTopic(MessageBase.MESSAGE_TOPIC_SIMULATION_LOCSIM_RS232);
	}

}
