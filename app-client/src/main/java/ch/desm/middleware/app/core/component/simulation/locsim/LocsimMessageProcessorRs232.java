package ch.desm.middleware.app.core.component.simulation.locsim;

import ch.desm.middleware.app.core.communication.message.MessageCommon;
import ch.desm.middleware.app.core.communication.message.translator.MessageTranslatorRs232;
import ch.desm.middleware.app.core.component.simulation.locsim.maps.LocsimMapMiddleware;
import ch.desm.middleware.app.core.component.simulation.locsim.maps.LocsimMapMiddlewareParameter;
import ch.desm.middleware.app.core.component.simulation.locsim.maps.LocsimMapRs232;
import ch.desm.middleware.app.core.component.simulation.locsim.messages.LocsimMessageRs232;

public class LocsimMessageProcessorRs232 extends MessageTranslatorRs232 {

	private LocsimMapRs232 mapRs232;
	private LocsimMapMiddleware middlewareMessages;
	private LocsimMapMiddlewareParameter mapParameter;
	
	public LocsimMessageProcessorRs232(){
		mapRs232 = new LocsimMapRs232();
		middlewareMessages = new LocsimMapMiddleware();
		mapParameter = new LocsimMapMiddlewareParameter();
	}
	
	@Override
	public String translateToCommonMiddlewareMessage(String payload, String topic){
		
		LocsimMessageRs232 locsimMessage = new LocsimMessageRs232(payload, topic);
		String middlewareKey = mapRs232.getValue(locsimMessage.getSignalType(), locsimMessage.getChannel());
		String commonMessage = middlewareMessages.getValue(middlewareKey);
		
		String dataValue = locsimMessage.getData();
		commonMessage = replaceMiddlewareMessageParameter(MessageCommon.PARAMETER_PLACEHOLDER, mapParameter.getValue(dataValue), commonMessage);

		return commonMessage;
	}
}
