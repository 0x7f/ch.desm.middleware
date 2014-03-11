package ch.desm.middleware.modules.core.event;

import java.util.ArrayList;
import java.util.List;

public class EventHandler {
	
	List<EventListenerInterface> eventListenerList;
	
	public EventHandler(){
		eventListenerList = new ArrayList<EventListenerInterface>();
	}
	
	public synchronized void addEventListener(EventListenerInterface eventListener){
		eventListenerList.add(eventListener);
	}
	
	public synchronized void removeEventListener(EventListenerInterface eventListener){
		eventListenerList.remove(eventListener);
	}

	public synchronized void fireEvent(){
		for(EventListenerInterface eventObject : eventListenerList){
			eventObject.handleEvent(new Event(this));
		}
	}
}