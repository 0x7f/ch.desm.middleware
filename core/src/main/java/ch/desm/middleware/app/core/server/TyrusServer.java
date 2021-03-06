package ch.desm.middleware.app.core.server;

import ch.desm.middleware.app.common.DaemonThreadBase;
import ch.desm.middleware.app.core.communication.endpoint.websocket.EndpointWebsocketServerEcho;
import ch.desm.middleware.app.core.communication.endpoint.websocket.EndpointWebsocketServerGui;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.glassfish.tyrus.server.Server;

/**
 * Created by Sebastian on 21.10.2014.
 */
public class TyrusServer extends DaemonThreadBase {

    private static Logger LOGGER = Logger.getLogger(TyrusServer.class);
    private boolean isRunning = false;
    private String ip;
    private int port;
    private String contextPath;

    public TyrusServer(String ip, int port, String contextPath){
        this.ip = ip;
        this.port = port;
        this.contextPath = contextPath;
    }

    public void run(){
        LOGGER.log(Level.INFO, "Tyrus Websocket Server is starting ...");
        Server server = new Server(ip, port, contextPath, null, EndpointWebsocketServerGui.class);

        try {
            server.start();
            doHangout(2000);
            isRunning = true;
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, "Tyrus Websocket Server start failed:" + e);
            isRunning = false;
        }
    }

    public boolean isRunning(){
        return isRunning;
    }
}
