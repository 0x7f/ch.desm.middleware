package ch.desm.middleware.modules.component.interlocking;

import ch.desm.middleware.modules.communication.broker.Broker;
import ch.desm.middleware.modules.communication.endpoint.EndpointBase;
import ch.desm.middleware.modules.communication.endpoint.EndpointCommon;
import ch.desm.middleware.modules.component.ComponentBase;

abstract class OMLBase extends ComponentBase {

	protected OMLEndpointUbw32 endpoint;
	
	public OMLBase(Broker broker, EndpointCommon endpoint) {
		super(broker);
		this.endpoint = (OMLEndpointUbw32)endpoint;
		
		this.registerEndpointListener(endpoint);
	}
	
	public OMLEndpointUbw32 getEndpoint(){
		return this.endpoint;
	}
	
	@Override
	protected void registerEndpointListener(
			EndpointBase listener) {
		try {
			endpoint.addEndpointListener(this);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	/**
	 * test endpoint message handling
	 * @param message
	 */
	public void emulateBrokerMessage(String message) {
		onIncomingBrokerMessage(message);
	}
}
