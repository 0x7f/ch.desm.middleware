package ch.desm.middleware.app.core.component.interlocking.obermattlangnau;

import org.apache.log4j.Logger;

import ch.desm.middleware.app.core.communication.broker.Broker;
import ch.desm.middleware.app.core.component.ComponentBase;

abstract class OMLBase extends ComponentBase {

	private static Logger LOGGER = Logger.getLogger(OMLBase.class);

	protected OMLEndpointUbw32 endpoint;

	public OMLBase(Broker broker, OMLEndpointUbw32 endpoint) {
		super(broker);
		this.endpoint = endpoint;

		this.registerEndpointListener(endpoint);
	}

	public OMLEndpointUbw32 getEndpoint() {
		return this.endpoint;
	}

}
