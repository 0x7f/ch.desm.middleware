package ch.desm.middleware.app.core.communication.message;


public abstract class MessageUbw32Base extends MessageBase {

	public static final String MESSAGE_CHAR_INPUT = "i";
	public static final String MESSAGE_CHAR_ONLYSOFTWARE = "os";
		
	public MessageUbw32Base(String payload, String topic){
		super(payload, topic);
	}
	
	public abstract String getInputValue(String register, String pin);
	
}
