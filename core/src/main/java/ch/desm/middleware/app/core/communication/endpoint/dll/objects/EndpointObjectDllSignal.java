package ch.desm.middleware.app.core.communication.endpoint.dll.objects;

public class EndpointObjectDllSignal {
	public int signalId;
	public String name;
	public int stellung;

	public EndpointObjectDllSignal(int signalId, String name, int stellung) {
		this.signalId = signalId;
		this.name = name;
		this.stellung = stellung;
	}

	@Override
	public String toString() {
		String s = "";
		s += "signalId: " + signalId;
		s += ", ";
		s += "name: " + name;
		s += ", ";
		s += "stellung: " + stellung;

		return s;
	}
}
