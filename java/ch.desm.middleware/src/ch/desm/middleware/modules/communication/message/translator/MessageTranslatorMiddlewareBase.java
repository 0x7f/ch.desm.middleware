package ch.desm.middleware.modules.communication.message.translator;

import java.util.ArrayList;

import ch.desm.middleware.modules.communication.message.type.MessageBase;
import ch.desm.middleware.modules.communication.message.type.MessageMiddleware;

abstract class MessageTranslatorMiddlewareBase {

	private static final String ELEMENT_CUT = ";";
	private static final String MESSAGE_CUT = "#";

	/**
	 * positions
	 */
	private static final int ID = 0;
	private static final int OUTPUT_INPUT = 1;
	private static final int EXTERN_INTERN = 2;
	private static final int ELEMENT = 3;
	private static final int FUNCTION = 4;
	private static final int INSTANCE = 5;
	private static final int PARAMETER = 6;
	private static final int TOPIC = 7;

	protected ArrayList<MessageMiddleware> decodeMiddlewareMessages(String message) {
		String[] messageArray = message.split(MESSAGE_CUT);
		ArrayList<MessageMiddleware> messageList = new ArrayList<MessageMiddleware>();

		for (int i = 0; i < messageArray.length; i++) {
			messageList.add(decodeMiddlewareMessage(messageArray[i]));
		}
		return messageList;
	}

	/**
	 * decodes a message to fit the message object
	 * 
	 * TODO refactor EnumMessageTopic topic, move it to standard message stream
	 * 
	 * @param message
	 * @return {@link MessageBase}
	 */
	private MessageMiddleware decodeMiddlewareMessage(String message) {
		MessageMiddleware messageCommon = null;
		try {
			if (message == null || message.isEmpty()) {
				throw new Exception("there is no message to translate");
			} else {
				String[] parts = message.split(ELEMENT_CUT);
				messageCommon = new MessageMiddleware(parts[TOPIC], parts[ID], parts[EXTERN_INTERN],
						parts[ELEMENT], parts[FUNCTION], parts[INSTANCE],
						parts[PARAMETER], message, parts[OUTPUT_INPUT]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return messageCommon;
	}

	/**
	 * TODO implementation decode to the common middleware message
	 * 
	 * @param
	 * @param
	 */
	protected String encodeMiddlewareMessage(MessageMiddleware message) {

		String endpointMessage = "";
		endpointMessage += message.getGlobalId();
		endpointMessage += ELEMENT_CUT;
		endpointMessage += message.getGlobalId();
		endpointMessage += ELEMENT_CUT;
		endpointMessage += message.getExternIntern();
		endpointMessage += ELEMENT_CUT;
		endpointMessage += message.getElement();
		endpointMessage += ELEMENT_CUT;
		endpointMessage += message.getFunction();
		endpointMessage += ELEMENT_CUT;
		endpointMessage += message.getInstance();
		endpointMessage += ELEMENT_CUT;
		endpointMessage += message.getParameter();
		endpointMessage += MESSAGE_CUT;

		return endpointMessage;
	}
}
