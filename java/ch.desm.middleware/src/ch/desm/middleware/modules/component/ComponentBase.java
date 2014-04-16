package ch.desm.middleware.modules.component;

import ch.desm.middleware.modules.communication.broker.Broker;
import ch.desm.middleware.modules.communication.broker.BrokerClient;
import ch.desm.middleware.modules.communication.endpoint.EndpointBase;
import ch.desm.middleware.modules.communication.endpoint.EndpointCommonListenerInterface;

/**
 * 
 * @author Sebastian
 * 
 */
public abstract class ComponentBase extends BrokerClient
	implements EndpointCommonListenerInterface {

	abstract protected void registerEndpointListener(EndpointBase listener);
	abstract public void emulateBrokerMessage(String message);	
	private static double id = 0;

	private void initialize(){
		id++;
	}
	
	public static enum EnumComponentCategorie {
		SIMULATION, INTERLOCKING, CABINE, CORBA
	}

	public ComponentBase(Broker broker) {
		super(broker);
		this.initialize();
	}
	
	public double getId() {
		return id;
	}
}