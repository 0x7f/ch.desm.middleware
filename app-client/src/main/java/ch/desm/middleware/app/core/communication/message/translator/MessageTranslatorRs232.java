package ch.desm.middleware.app.core.communication.message.translator;


public abstract class MessageTranslatorRs232 extends MessageTranslatorMiddlewareBase {
	
	public abstract String translateToCommonMiddlewareMessage(String payload, String topic);

}
