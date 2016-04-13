package ch.desm.middleware.app.module.obermatt;

import ch.desm.middleware.app.core.component.ComponentBrokerClientBase;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import ch.desm.middleware.app.core.communication.broker.Broker;
import ch.desm.middleware.app.core.communication.message.MessageBase;

public class OmBrokerClient extends ComponentBrokerClientBase {

	private static Logger LOGGER = Logger.getLogger(OmBrokerClient.class);

    private OmGenericClientThreadMessage thread;
    private OmService service;

	public OmBrokerClient(Broker broker, OmService service) {
		super(broker);
        this.service = service;
        this.thread = new OmGenericClientThreadMessage(service);
        this.thread.start();
	}

    /**
     *
     */
    @Override
    protected void initializeTopicSubscriptions() {
        subscribeToTopic(MessageBase.MESSAGE_TOPIC_SIMULATION_LOCSIM_DLL);
        subscribeToTopic(MessageBase.MESSAGE_TOPIC_PETRINET_OBERMATT);
        subscribeToTopic(MessageBase.MESSAGE_TOPIC_MANAGEMENT);
    }

    @Override
	protected void onIncomingBrokerMessage(String message) {
		LOGGER.log(Level.TRACE, "broker (" + this.getClass() + ") received message: " + message);
		thread.addMessages(service.getTranslator().toMiddlewareMessageList(message));
	}
}
