package ch.desm.middleware.app.module.ersa;

import ch.desm.middleware.app.common.utility.UtilityHex;
import ch.desm.middleware.app.core.communication.endpoint.tcp.EndpointTcpClient;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.IOException;

public class ErsaTestThread implements Runnable {

    private static Logger LOGGER = Logger.getLogger(ErsaTestThread.class);

    private final EndpointTcpClient endpoint;

    public ErsaTestThread(EndpointTcpClient endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public void run() {
        LOGGER.log(Level.INFO, "Thread active");

        final ErsaCodec codec = new ErsaCodec();
        final ErsaMessageTiuData[] messages = new ErsaMessageTiuData[]{
                new ErsaMessageTiuData(false, false, false),
                new ErsaMessageTiuData(true,  false, false),
                new ErsaMessageTiuData(false, true,  false),
                new ErsaMessageTiuData(false, false, true),
                new ErsaMessageTiuData(true,  true,  true),
        };

        try {
            Thread.sleep(1000);
            for (int i = 0; i < 2; ++i) {
                for (int j = 0; j < messages.length; j++) {
                    endpoint.send(codec.encode(messages[j]));
                    Thread.sleep(250);
                }
            }
        } catch (InterruptedException e) {
            LOGGER.error(e);
        } catch (IOException e) {
            LOGGER.error(e);
            e.printStackTrace();
        }
    }
}
