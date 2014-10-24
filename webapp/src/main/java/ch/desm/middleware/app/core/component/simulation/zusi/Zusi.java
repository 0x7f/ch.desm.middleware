package ch.desm.middleware.app.core.component.simulation.zusi;

import org.apache.log4j.Logger;

import ch.desm.middleware.app.core.communication.broker.Broker;
import ch.desm.middleware.app.core.communication.endpoint.tcp.EndpointTcpClientListenerInterface;
import ch.desm.middleware.app.core.communication.message.MessageBase;


public class Zusi extends ZusiBase implements EndpointTcpClientListenerInterface{

	private static Logger LOGGER = Logger.getLogger(Zusi.class);
	
	public Zusi(Broker broker, ZusiEndpointTcp endpoint) {
		super(broker, endpoint);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onIncomingEndpointMessage(String message) {

		LOGGER.info("zusi (" + this.getClass() + ") received endpoint message: " + message);
		
	}

	@Override
	protected void onIncomingBrokerMessage(String message) {
		
		LOGGER.info("zusi (" + this.getClass() + ") received broker message: " + message);
		
	}

	@Override
	protected void intializeSignedTopic() {
        signForTopic(MessageBase.MESSAGE_TOPIC_CABINE_RE420);
        signForTopic(MessageBase.MESSAGE_TOPIC_CABINE_RE420_FABISCH);
        signForTopic(MessageBase.MESSAGE_TOPIC_PETRINET_OBERMATT_LANGNAU);
	}

}
