package ch.desm.middleware.app.core.communication.endpoint.dll;

import java.util.LinkedList;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import ch.desm.middleware.app.core.communication.Dll;
import ch.desm.middleware.app.core.communication.endpoint.EndpointThreadBase;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObectDllIsolierstoss;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllBalise;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllBase;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllLoop;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllSignal;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllTrack;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllTrackConnection;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllTrainPosition;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllWeiche;

public class EndpointDllThread extends EndpointThreadBase {
	
	private static Logger LOGGER = Logger.getLogger(EndpointDllThread.class);

	private Dll dll;
	private EndpointDll endpoint;

	public EndpointDllThread(String name, Dll dll, EndpointDll endpoint) {
		super(name);
		this.dll = dll;
		this.endpoint = endpoint;
	}

	@Override
	public void run() {
		try {

			while (!isInterrupted()) {
				LOGGER.log(Level.TRACE, "Polling Thread active: " + this.getName());
				pollingDllEvents();
				doHangout();
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			LOGGER.log(Level.ERROR, e);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.log(Level.ERROR, e);
		}
	}

	private void pollingDllEvents() throws Exception {
		LinkedList<EndpointDllEvent> events = null;

		events = dll.getEvents();

		for (EndpointDllEvent event : events) {

			LinkedList<Integer> params = event.params;

			switch (event.type) {
			case EndpointObjectDllBase.ENUM_CMD_ISOLIERSTOSS:
				int isolierstossId = params.get(0);
				EndpointObectDllIsolierstoss isolierstoss = dll
						.getIsolierstoss(isolierstossId);

				endpoint.receiveEndpointObject(isolierstoss);
				break;
			case EndpointObjectDllBase.ENUM_CMD_WEICHE:
				int weicheId = params.get(0);
				EndpointObjectDllWeiche weiche = dll.getWeiche(weicheId);

				endpoint.receiveEndpointObject(weiche);
				break;
			case EndpointObjectDllBase.ENUM_CMD_TRAINPOSITION:
				int trainTyp = params.get(0);
				EndpointObjectDllTrainPosition trainPosition = dll
						.getTrainPosition(trainTyp);

				endpoint.receiveEndpointObject(trainPosition);
				break;
			case EndpointObjectDllBase.ENUM_CMD_SIGNAL:
				int signalId = params.get(0);
				EndpointObjectDllSignal signal = dll.getSignal(signalId);

				endpoint.receiveEndpointObject(signal);
				break;
			case EndpointObjectDllBase.ENUM_CMD_KILOMETER_DIRECTION:
				int kilometerDirection = dll.getKilometerDirection();

				endpoint.receiveEndpointObject(kilometerDirection);
				break;
			case EndpointObjectDllBase.ENUM_CMD_BALISE:
				int baliseIdBalise = params.get(0);
				EndpointObjectDllBalise balise = dll.getBalise(baliseIdBalise);

				endpoint.receiveEndpointObject(balise);
				break;
			case EndpointObjectDllBase.ENUM_CMD_LOOP:
				int baliseIDLoop = params.get(0);
				EndpointObjectDllLoop loop = dll.getLoop(baliseIDLoop);

				endpoint.receiveEndpointObject(loop);
				break;
			case EndpointObjectDllBase.ENUM_CMD_TRACK:
				int gleisId = params.get(0);
				EndpointObjectDllTrack track = dll.getTrack(gleisId);

				endpoint.receiveEndpointObject(track);
				break;
			case EndpointObjectDllBase.ENUM_CMD_TRACK_CONNECTION:
				int gleis1Id = params.get(0);
				int gleis2Id = params.get(1);
				EndpointObjectDllTrackConnection trackConnection = dll
						.getTrackConnection(gleis1Id, gleis2Id);

				endpoint.receiveEndpointObject(trackConnection);
				break;
			}
		}
	}
}
