package ch.desm.middleware.communication.endpoint.websocket;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

@ServerEndpoint(value = "/gui")
public class EndpointWebsocket {

	private static final Logger LOGGER = Logger.getLogger(EndpointWebsocket.class
			.getName());

	@OnOpen
	public void onOpen(Session session) {
		LOGGER.log(Level.INFO, "New connection with client: " + session.getId());
	}

	@OnMessage
	public String onMessage(String message, Session session) {
		LOGGER.log(Level.INFO, "New message from Client ["+session.getId()+"]: " + message);
		return "Server received [" + message + "]";
	}

	@OnClose
	public void onClose(Session session) {
		LOGGER.log(Level.INFO, "Close connection for client: "+ session.getId() );
	}

	@OnError
	public void onError(Throwable exception, Session session) {
		LOGGER.log(Level.INFO, "Error for client: " + session.getId() );
	}

}