package ch.desm.middleware.modules.communication.endpoint.virtual;

import org.apache.log4j.Logger;

import ch.desm.middleware.modules.communication.endpoint.EndpointCommon;

public class EndpointInterlockingLogic extends EndpointCommon {

	protected static Logger log = Logger.getLogger(EndpointInterlockingLogic.class);
	
//	private EndpointInterlockingPetriNet net;
	private EndpointInterlockingLogicPolling polling;
	
	public EndpointInterlockingLogic(){
//		net = new EndpointInterlockingPetriNet();
//		polling = new EndpointInterlockingLogicPolling("EndpointInterlockingLogicPolling", net);
	}
	
	/*
	 *
	 * @see ch.desm.middleware.modules.communication.endpoint.EndpointCommon#pollingCommand()
	 */
	public void pollingCommand(){
		

	}
}
