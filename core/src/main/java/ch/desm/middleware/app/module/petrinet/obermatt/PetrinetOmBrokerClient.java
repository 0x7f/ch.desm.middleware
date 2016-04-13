package ch.desm.middleware.app.module.petrinet.obermatt;

import ch.desm.middleware.app.core.component.ComponentBrokerClientBase;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import ch.desm.middleware.app.core.communication.broker.Broker;
import ch.desm.middleware.app.core.communication.message.MessageBase;

/**
 * Created by max on 06/08/14.
 */
public class PetrinetOmBrokerClient extends ComponentBrokerClientBase {
    private static Logger LOGGER = Logger.getLogger(PetrinetOmBrokerClient.class);

    private PetrinetOmBrokerClientThreadMessage thread;
    private PetrinetOmService service;

    public PetrinetOmBrokerClient(Broker broker, PetrinetOmService service) {
        super(broker);
        this.service = service;

        this.thread = new PetrinetOmBrokerClientThreadMessage(service);
        this.thread.start();
    }

    @Override
    protected void onIncomingBrokerMessage(String message) {
        LOGGER.log(Level.TRACE, "broker (" + this.getClass() + ") received message: " + message);
        thread.addMessages(service.getTranslator().toMiddlewareMessageList(message));
    }

    @Override
    protected void initializeTopicSubscriptions() {
        subscribeToTopic(MessageBase.MESSAGE_TOPIC_SIMULATION_LOCSIM_DLL);
        subscribeToTopic(MessageBase.MESSAGE_TOPIC_INTERLOCKING_OBERMATT);
        subscribeToTopic(MessageBase.MESSAGE_TOPIC_SIMULATION_ZUSI_AUSBILDUNG);
        subscribeToTopic(MessageBase.MESSAGE_TOPIC_MANAGEMENT);
    }
}
