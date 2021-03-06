package ch.desm.middleware.app.core.communication.endpoint.websocket;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;


@ServerEndpoint(value = "/gui", encoders = EndpointWebsocketMessageEncoder.class, decoders = EndpointWebsocketMessageDecoder.class)
public class EndpointWebsocketServerGui {
	
	private static final Logger LOGGER = Logger.getLogger(EndpointWebsocketServerGui.class);

	/* Queue for all open WebSocket sessions */
	private static Queue<Session> sessions = new ConcurrentLinkedQueue<Session>();

    @OnOpen
    public void onOpen(Session session){
        sessions.add(session);
        LOGGER.log(Level.INFO, "Client Connected to WebsocketServer with session: " + session);
    }

    @OnMessage
    public void onMessage(String message, Session session){
        if(message != null && !message.isEmpty()){
            try{
                HashSet<Session> sessionList = new HashSet<Session>(sessions);
                for (Session element : sessionList) {
                    if(!element.equals(session)){
                        element.getBasicRemote().sendText(message);
                        LOGGER.log(Level.TRACE, "Websocket sent message: " + message +" to Websocket client" + element.getId()+")" );
                    }
                }
            }catch (IOException e) {
                LOGGER.log(Level.ERROR, e);
            }
        }else{
            LOGGER.log(Level.WARN, "message is empty: " + message);
        }
    }

    @OnClose
    public void onClose(CloseReason reason){
        LOGGER.log(Level.TRACE, "Websocket Closed: " + reason);

        HashSet<Session> sessionList = new HashSet<Session>(sessions);

        for (Session session : sessionList) {
            if(!session.isOpen()){
                sessions.remove(session);
                LOGGER.log(Level.TRACE, "WebsocketServer removed session: " + session.getId());
            }
        }
    }

    @OnError
    public void onWebSocketError(Throwable cause){
        LOGGER.log(Level.ERROR, cause);
    }

    /*
    *   TODO Implementation
    *   stay alive: server send ping and all clients send a pong
    */
    public void sendPing(){

    }

}
