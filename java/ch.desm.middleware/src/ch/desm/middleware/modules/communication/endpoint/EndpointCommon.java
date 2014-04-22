package ch.desm.middleware.modules.communication.endpoint;

public abstract class EndpointCommon extends EndpointBase {

	public void onIncomingEndpointMessage(String message) {
		for (EndpointCommonListenerInterface listener : this.listeners) {

			((EndpointCommonListenerInterface) listener)
					.onIncomingEndpointMessage(message);
		}
	}

	/**
	 * test endpoint message handling
	 * @param message
	 */
	public void emulateEndpointMessage(String message) {
		onIncomingEndpointMessage(message);
	}

	@Override
	public void addEndpointListener(EndpointCommonListenerInterface listener)
			throws Exception {

		if (listener instanceof EndpointCommonListenerInterface) {
			this.listeners.add(listener);
		} else {
			throw new Exception(
					"Only endpoints with message handling supported.");
		}

	}
}
