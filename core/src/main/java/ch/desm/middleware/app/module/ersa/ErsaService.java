package ch.desm.middleware.app.module.ersa;

import ch.desm.middleware.app.core.communication.message.translator.MessageTranslatorMiddleware;
import ch.desm.middleware.app.core.component.ComponentServiceBase;
import ch.desm.middleware.app.core.communication.broker.Broker;

public class ErsaService extends ComponentServiceBase {

    private final ErsaBrokerClient brokerClient;
    private final ErsaEndpointTcpClient tiuEndpoint;
    private final ErsaMessageProcessor messageProcessor = new ErsaMessageProcessor();
    private final MessageTranslatorMiddleware translator = new MessageTranslatorMiddleware();

    public ErsaService(Broker broker, String host, int port){
        this.brokerClient = new ErsaBrokerClient(broker, this, messageProcessor);
        this.tiuEndpoint = new ErsaEndpointTcpClient(host, port, "TIU");
    }

    public ErsaEndpointTcpClient getEndpoint(){
        return tiuEndpoint;
    }

    @Override
    public ErsaMessageProcessor getMessageProcessor(){
        return messageProcessor;
    }

    public ErsaBrokerClient getBrokerClient(){
        return brokerClient;
    }

    public MessageTranslatorMiddleware getTranslator(){
        return translator;
    }
}
