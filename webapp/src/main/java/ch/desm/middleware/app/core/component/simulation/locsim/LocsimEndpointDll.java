package ch.desm.middleware.app.core.component.simulation.locsim;

import ch.desm.middleware.app.core.communication.endpoint.EndpointBase;
import ch.desm.middleware.app.core.communication.endpoint.dll.EndpointDll;

public class LocsimEndpointDll extends EndpointDll {

	public LocsimEndpointDll(String configPath) {
		super(configPath);

	}

    @Override
    protected void registerEndpointListener(EndpointBase listener) {
        //TODO implementation
    }
}
