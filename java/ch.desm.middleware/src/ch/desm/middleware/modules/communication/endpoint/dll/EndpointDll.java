package ch.desm.middleware.modules.communication.endpoint.dll;

import org.apache.log4j.Logger;

import ch.desm.Dll;
import ch.desm.middleware.modules.communication.endpoint.EndpointCommon;
import ch.desm.middleware.modules.communication.endpoint.dll.objects.EndpointObjectDllSignal;
import ch.desm.middleware.modules.communication.endpoint.dll.objects.EndpointObjectDllTrainPosition;
import ch.desm.middleware.modules.communication.endpoint.dll.objects.EndpointObjectDllWeiche;
import ch.desm.middleware.modules.component.simulation.locsim.messages.LocsimMessageTranslatorDll;

public abstract class EndpointDll extends EndpointCommon implements
		EndpointDllListenerInterface {

	private static Logger log = Logger.getLogger(EndpointDll.class);
	
	public static final int POLLING_WAIT_TIME = 2048;
	private Dll dll;
	private EndpointDllPolling eventPollingDaemonDll;

	public EndpointDll(String configPath) {
		
		dll = new Dll();
		dll.onStartProgramm(configPath);
		this.eventPollingDaemonDll = new EndpointDllPolling(
				"EndpointDesmDllPolling", POLLING_WAIT_TIME, dll, this);
		
		eventPollingDaemonDll.start();
	}

	public Dll getDll() {
		return dll;
	}

	public void receiveEndpointObject(Object obj){
		
		log.trace("receive in endpoint " + this.getClass() + " an object " + obj.getClass());
		
		String message = "";
		
		if(obj instanceof EndpointObjectDllSignal){
			message = new LocsimMessageTranslatorDll().translateToMiddlewareMessage((EndpointObjectDllSignal)obj);
		
		}else if(obj instanceof EndpointObjectDllTrainPosition){
			message = new LocsimMessageTranslatorDll().translateToMiddlewareMessage((EndpointObjectDllTrainPosition)obj);
		
		}else if(obj instanceof EndpointObjectDllWeiche){
			message = new LocsimMessageTranslatorDll().translateToMiddlewareMessage((EndpointObjectDllWeiche)obj);
		}else{
			
			log.error("Translation does not support yet endpoint object: " + obj.getClass());
		}
		
		if(!message.isEmpty()){
			this.onIncomingEndpointMessage(message);
		}
	}

}
