package ch.desm.middleware.webapp.websocket;

import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


@ServerEndpoint(value = "/gui/{component}", encoders = EndpointWebsocketMessageEncoder.class, decoders = EndpointWebsocketMessageDecoder.class)
public class EndpointWebsocketServer {
	
	private static final Logger LOGGER = Logger
			.getLogger(EndpointWebsocketServer.class);

	/* Queue for all open WebSocket sessions */
	private static Queue<Session> sessions = new ConcurrentLinkedQueue<>();

	
	@OnMessage
	public String onMessage(String message, Session session) {
		LOGGER.log(Level.INFO, "New message from Client [" + session.getId()
				+ "]: " + message);

		try {
			for (Session s : session.getOpenSessions()) {
				
				// send message all connected clients
				s.getBasicRemote().sendObject(message);
			}
		} catch (IOException | EncodeException e) {
			LOGGER.log(Level.ERROR, "onMessage failed", e);
			sessions.remove(session);
		}
		
    		return "Server received [" + message + "]";
	}

	@OnOpen
	public void open(final Session session,
			@PathParam("component") final String component) {
		LOGGER.log(Level.INFO, "New connection with client: " + session.getId());

		session.getUserProperties().put("component", component);
		if (!sessions.contains(session)) {
			sessions.add(session);
		}
	}

	@OnClose
	public void onClose(Session session) {
		try {
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LOGGER.log(Level.INFO, "Close connection for client: " + session.getId());
	}

	@OnError
	public void onError(Throwable exception, Session session) {
		LOGGER.log(Level.INFO, "Error for client: " + session.getId());
	}

	public static void sendMessage(String message) {
		try {
			/* Send messsage to all open WebSocket sessions */
			for (Session session : sessions) {
				session.getBasicRemote().sendText(message);
				LOGGER.log(Level.INFO, "Sent message: " + message +" to Websocket client" + session.getId()+")" );
			}
		} catch (IOException e) {
			LOGGER.log(Level.ERROR, e);
		}
	}


}
