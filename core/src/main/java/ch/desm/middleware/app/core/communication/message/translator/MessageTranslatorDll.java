package ch.desm.middleware.app.core.communication.message.translator;

import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllSignal;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllTrainPosition;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllWeiche;

public abstract class MessageTranslatorDll extends MessageTranslatorMiddlewareBase {
	
	/**
	 * 
	 * @param obj
	 */
	public abstract String translateToMiddlewareMessage(EndpointObjectDllSignal obj);

	/**
	 *  
	 * @param obj
	 */
	public abstract String translateToMiddlewareMessage(EndpointObjectDllWeiche obj);
	
	/**
	 *  
	 * @param obj
	 */
	public abstract String translateToMiddlewareMessage(EndpointObjectDllTrainPosition obj);

}
