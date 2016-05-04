package ch.desm.middleware.app.module.ersa;

import ch.desm.middleware.app.core.communication.endpoint.tcp.EndpointTcpClient;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.IOException;

public class ErsaEndpointTcpClient extends EndpointTcpClient {

    private static Logger LOGGER = Logger.getLogger(ErsaEndpointTcpClient.class);

    private Thread dataThread;

    public ErsaEndpointTcpClient(String ip, int port, String name) {
        super(ip, port, name);
    }

    @Override
    public void connect(){

        LOGGER.log(Level.INFO, "connecting to Server ...");
        try {
            socket.connect(socketAddress);
            dataThread = new Thread(new ErsaTestThread(this));
            dataThread.start();
        } catch (IOException e) {
            LOGGER.log(Level.ERROR, e);
        }

        LOGGER.log(Level.INFO, "connected to Server with address:" + socket.getInetAddress() + ", remote port: " + socket.getPort()+ ", locale port: " + socket.getLocalPort());
    }

    @Override
    public void disconnect(String reason){
        try {
            stop();
            socket.close();
            LOGGER.log(Level.INFO, "socket closed: " + socket.toString() + ", reason: " + reason);
        } catch (IOException e) {
            LOGGER.log(Level.ERROR, e);
        }
    }

    /**
     *
     */
    @Override
    public void reset(){

    }

    @Override
    protected void registerEndpointListener() {
        try {
            addEndpointListener(this);
        } catch (Exception e) {
            LOGGER.error(e);
        }
    }

    @Override
    public void onIncomingEndpointMessage(String message) {
        System.out.println(message);
    }
}
