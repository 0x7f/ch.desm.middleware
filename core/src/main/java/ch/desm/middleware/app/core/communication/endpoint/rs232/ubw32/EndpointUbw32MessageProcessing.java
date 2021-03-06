package ch.desm.middleware.app.core.communication.endpoint.rs232.ubw32;

import ch.desm.middleware.app.common.ComponentServiceBase;
import ch.desm.middleware.app.core.communication.message.MessageCommon;
import ch.desm.middleware.app.core.communication.message.MessageUbw32Analog;
import ch.desm.middleware.app.core.communication.message.MessageUbw32DigitalRegisterComplete;
import ch.desm.middleware.app.core.communication.message.MessageUbw32DigitalRegisterSingle;
import ch.desm.middleware.app.core.component.cabine.re420.Re420EndpointUbw32;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * Created by Sebastian on 22.11.2014.
 */
public class EndpointUbw32MessageProcessing {

    private static Logger LOGGER = Logger.getLogger(EndpointUbw32MessageProcessing.class);

    public String getUbwSingleRegisterValues(ComponentServiceBase service, Re420EndpointUbw32 endpoint, MessageUbw32DigitalRegisterSingle message) {
        String messageInput = "";
        for (Map.Entry<String, String> entry : endpoint.getMapDigital()
                .getMap().entrySet()) {

            if (entry.getValue()
                    .equals(((MessageUbw32DigitalRegisterSingle) message)
                            .getPort())) {

                String key = entry.getKey();
                boolean isEnabled = ((MessageUbw32DigitalRegisterSingle) message).isEnabled();
                String parameter = isEnabled == true ? "on" : "off";
                if (isEnabled) LOGGER.log(Level.INFO, "key: " + key);
                String stream = null;
                stream = service.getComponentMapMiddleware().getMap().get(key);

                if (stream == null) {
                    try {
                        throw new Exception(
                                "mapping error no global id in middleware message with key: "
                                        + entry.getKey() + " and value: "
                                        + entry.getValue()
                                        + " in message: " + message);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        LOGGER.log(Level.ERROR, e);
                    }
                }
                stream = stream.replace(MessageCommon.MESSAGE_PARAMETER_DELIMITER, parameter);
                messageInput = messageInput.concat(stream);
            }
        }
        return messageInput;
    }


    public String getUbwAllRegisterValues(ComponentServiceBase service, Re420EndpointUbw32 endpoint, MessageUbw32DigitalRegisterComplete message){

        String messageInput = "";

        for (Map.Entry<String, String> entry : endpoint.getMapDigital()
                .getMap().entrySet()) {

            // convert input to common parameter
            boolean isEnabled = message.getInputValue(entry.getValue().substring(0), entry.getValue().substring(1)).contains("1");
            String parameter = isEnabled == true ? "on" : "off";
            String key = entry.getKey();

            if (endpoint.getState().hasChanged(key, parameter)) {

                //find the middleware message of the changed key
                String stream = service.getComponentMapMiddleware().getValue(key);

                if (stream == null || (stream != null && stream.isEmpty())) {
                    try {
                        throw new Exception(
                                "mapping error no global id in middleware message with key: "
                                        + entry.getKey() + " and value: "
                                        + entry.getValue()
                                        + " in message: " + message);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        LOGGER.log(Level.WARN, e);
                    }
                }

                stream = stream.replace(MessageCommon.MESSAGE_PARAMETER_DELIMITER, parameter);
                messageInput = messageInput.concat(stream);
            }
        }
        return messageInput;
    }

    public String getUbwAnalogRegisterValues(ComponentServiceBase service, Re420EndpointUbw32 endpoint, MessageUbw32Analog message){

        String messageInput = "";

        for (Map.Entry<String, String> entry : endpoint.getMapAnalog()
                .getMap().entrySet()) {

            String key = entry.getKey();

            if (!key.isEmpty()) {
                String stream = service.getComponentMapMiddleware().getMap().get(key);

                if (stream == null) {
                    try {
                        throw new Exception(
                                "mapping error found no global id in middleware message with key: "
                                        + entry.getKey() + " and value: "
                                        + entry.getValue()
                                        + " in message: " + message);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        LOGGER.log(Level.ERROR, e);
                    }
                }

                // convert input to common parameter
                String parameter = message.getInputValue(entry.getValue(),"");
                stream = stream.replace(MessageCommon.MESSAGE_PARAMETER_DELIMITER, parameter);
                messageInput = messageInput.concat(stream);
            }
        }

        return messageInput;
    }




}
