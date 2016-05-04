package ch.desm.middleware.app.module.ersa;

import ch.desm.middleware.app.core.communication.message.MessageBase;
import ch.desm.middleware.app.core.communication.message.MessageMiddleware;
import ch.desm.middleware.app.core.component.ComponentMessageProcessorBase;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.LinkedList;

public class ErsaMessageProcessor extends ComponentMessageProcessorBase<ErsaService> {

    private static Logger LOGGER = Logger.getLogger(ErsaMessageProcessor.class);

    public void processBrokerMessage(ErsaService service, LinkedList<MessageMiddleware> messages) {
        for(MessageMiddleware message : messages){
            processBrokerMessage(service, message);
        }
    }

    public void processBrokerMessage(ErsaService service, MessageMiddleware message) {
        switch(message.getTopic()){
            case(MessageBase.MESSAGE_TOPIC_MANAGEMENT):{
                processBrokerMessageManagament(service.getEndpoint(), message);
                break;
            }
            default:{
                try {
                    throw new Exception("unsupported topic, broker message delegation skipped: " + message.toString());
                } catch (Exception e) {
                    LOGGER.log(Level.WARN, e);
                }
            };
        }
    }

    private void processBrokerMessageManagament(ErsaEndpointTcpClient endpoint, MessageMiddleware element){
        switch (element.getParameter()) {
            case ("init"): {
                endpoint.init();
                break;
            }
            case ("start"): {
                endpoint.start();
                break;
            }
            case ("stop"): {
                endpoint.stop();
                break;
            }
        }
    }

}
