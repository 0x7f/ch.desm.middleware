package ch.desm.middleware.modules.core.event;

import java.util.EventObject;


public class Event extends EventObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2026849935605792165L;
	
	public Event(Object source){
		super(source);
	}
}