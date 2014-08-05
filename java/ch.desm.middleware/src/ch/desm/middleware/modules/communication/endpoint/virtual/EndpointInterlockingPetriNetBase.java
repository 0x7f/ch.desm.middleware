package ch.desm.middleware.modules.communication.endpoint.virtual;

import org.apache.log4j.Logger;

public class EndpointInterlockingPetriNetBase {

	protected String firingElement;
	
	protected static Logger log = Logger.getLogger(EndpointInterlockingPetriNetBase.class);
	
	protected boolean canFire(String s) {
		firingElement = s;
		return true;
	}
	
	public String getFiredElement(){
		return firingElement;
	}
	
	public void fire(String s) {
		System.out.println(s);
	}
	
	
}
