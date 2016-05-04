package ch.desm.middleware.app.module.ersa;

import ch.desm.middleware.app.core.communication.broker.Broker;
import ch.desm.middleware.app.core.communication.broker.BrokerClient;
import ch.desm.middleware.app.core.communication.message.MessageBase;
import ch.desm.middleware.app.core.communication.message.MessageMiddleware;

import java.util.LinkedList;

public class ErsaBrokerClient extends BrokerClient {

    private final ErsaService service;
    private final ErsaMessageProcessor messageProcessor;

    public ErsaBrokerClient(Broker broker, ErsaService service, ErsaMessageProcessor messageProcessor) {
        super(broker);
        this.service = service;
        this.messageProcessor = messageProcessor;
    }

    @Override
    protected void intializeSignedTopic() {
        signForTopic(MessageBase.MESSAGE_TOPIC_MANAGEMENT);
        signForTopic(MessageBase.MESSAGE_TOPIC_ERSA_ETCS_TIU);
        signForTopic(MessageBase.MESSAGE_TOPIC_ERSA_ETCS_ODO);
        signForTopic(MessageBase.MESSAGE_TOPIC_ERSA_ETCS_SCE);
    }

    @Override
    protected void onIncomingBrokerMessage(String message) {
        LinkedList<MessageMiddleware> messages = service.getTranslator().toMiddlewareMessageList(message);
        messageProcessor.processBrokerMessage(service, messages);
    }
}
