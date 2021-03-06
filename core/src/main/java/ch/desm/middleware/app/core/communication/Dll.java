package ch.desm.middleware.app.core.communication;

import java.util.LinkedList;

import ch.desm.middleware.app.core.communication.endpoint.dll.EndpointDllEvent;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObectDllIsolierstoss;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllBalise;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllLoop;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllSignal;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllTrack;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllTrackConnection;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllTrainPosition;
import ch.desm.middleware.app.core.communication.endpoint.dll.objects.EndpointObjectDllWeiche;

/**
 * TODO: implement all stw_set* methods using the according inner classes
 * 
 */
public class Dll {

	//TODO LoadLibrary
	static {
		System.out.println(System.getProperty("java.library.path"));
		System.loadLibrary("DesmMiddlewarePlugin");
	}

	public native String infoName();

	public native String infoVersion();

	public native String infoDescription();

	public native String infoConnectionStatus();

	public native void onStartProgramm(String configPath);

	public native void onStartSimulation();

	public native void onStopSimulation();

	public native void onStopProgramm();

	public native void onLoadStrecke();


	// NOTE: not ideal implementation yet. many instantiations of ArrayLists!
	private native void getEvents0(LinkedList res);

	public LinkedList<EndpointDllEvent> getEvents() throws Exception {
		LinkedList<EndpointDllEvent> result = new LinkedList<EndpointDllEvent>();
		LinkedList<LinkedList> al = new LinkedList();
		getEvents0(al);
		for (int i = 0; i < al.size(); ++i) {
			LinkedList<Integer> alEvt = (LinkedList) al.get(i);
			if (alEvt.size() < 1) {
				throw new Exception("invalid result returned");
			}
			int type;
            type = (int) (alEvt.get(0));
            LinkedList<Integer> params;
            params = new LinkedList<Integer>();
            for (int j = 1; j < alEvt.size(); ++j) {
				params.add((int) alEvt.get(j));
			}
			result.add(new EndpointDllEvent(type, params));
		}
		return result;
	}

	public native void setKilometerDirection(int richtung);

	private native void getKilometerDirection0(LinkedList res);

	public int getKilometerDirection() throws Exception {
		LinkedList<Integer> al = new LinkedList();
		getKilometerDirection0(al);
		if (al.size() != 1) {
			throw new Exception("invalid result returned");
		}
		return (int) al.get(0);
	}

	public native void setWeiche(int weicheId, int gleisId);

	private native void getWeiche0(int weicheId, LinkedList res);

	public EndpointObjectDllWeiche getWeiche(int weicheId) throws Exception {
		LinkedList<Integer> al = new LinkedList();
		getWeiche0(weicheId, al);
		if (al.size() != 1) {
			throw new Exception("invalid result returned");
		}
		return new EndpointObjectDllWeiche(weicheId, (int) al.get(0));
	}

	public native void setBalise(int baliseId, int stellung, String protokoll);

	private native void getBalise0(int baliseId, LinkedList res);

	public EndpointObjectDllBalise getBalise(int baliseId) throws Exception {
		LinkedList<Integer> al = new LinkedList();
		getBalise0(baliseId, al);
		if (al.size() != 2) {
			throw new Exception("invalid result returned");
		}
        //TODO
		//return new EndpointObjectDllBalise(baliseId, (int) al.get(0), (String) al.get(1));
        return new EndpointObjectDllBalise(baliseId, (int) al.get(0), "");
	}

	public native void setIsolierstoss(int isolierstossId, int gleisId,
			double position);

	private native void getIsolierstoss0(int isolierstossId, LinkedList res);

    //TODO review LinkedList<Integer>
	public EndpointObectDllIsolierstoss getIsolierstoss(int isolierstossId) throws Exception {
		LinkedList<Integer> al = new LinkedList();
		getIsolierstoss0(isolierstossId, al);
		if (al.size() != 2) {
			throw new Exception("invalid result returned");
		}
		return new EndpointObectDllIsolierstoss(isolierstossId, (int) al.get(0),
				(double) al.get(1));
	}

	public native void setLoop(int baliseId, int stellung, String protokoll);

	private native void getLoop0(int baliseId, LinkedList res);

    //TODO review
	public EndpointObjectDllLoop getLoop(int baliseId) throws Exception {
		LinkedList<Integer> al = new LinkedList();
		getLoop0(baliseId, al);
		if (al.size() != 2) {
			throw new Exception("invalid result returned");
		}
		//return new EndpointObjectDllLoop(baliseId, (int) al.get(0), (String) al.get(1));
        return new EndpointObjectDllLoop(baliseId, (int) al.get(0), "");
	}

	// TODO: public native void setSignal(int baliseId, int stellung, String
	// protokoll);
	private native void getSignal0(int signalId, LinkedList res);

	public EndpointObjectDllSignal getSignal(int signalId) throws Exception {
		LinkedList<Integer> al = new LinkedList();
		getSignal0(signalId, al);
		if (al.size() != 2) {
			throw new Exception("invalid result returned");
		}
		//return new EndpointObjectDllSignal(signalId, (String) al.get(0), (int) al.get(1));
        return new EndpointObjectDllSignal(signalId, "", (int) al.get(1));
	}

	// TODO: public native void setTrack(int baliseId, int stellung, String
	// protokoll);
	private native void getTrack0(int gleisId, LinkedList res);

    //TODO review
	public EndpointObjectDllTrack getTrack(int gleisId) throws Exception {
		LinkedList<Integer> al = new LinkedList();
		getTrack0(gleisId, al);
		if (al.size() != 4) {
			throw new Exception("invalid result returned");
		}
        //		return new EndpointObjectDllTrack(gleisId, (double) al.get(0), (double) al.get(1),
        //(double) al.get(2), (String) al.get(3));
		return new EndpointObjectDllTrack(gleisId, (double) al.get(0), (double) al.get(1),
				(double) al.get(2), "");
	}

	// TODO: public native void setTrackConnection(int baliseId, int stellung,
	// String protokoll);
	private native void getTrackConnection0(int gleis1Id, int gleis2Id,
			LinkedList res);

    //TODO review
	public EndpointObjectDllTrackConnection getTrackConnection(int gleis1Id, int gleis2Id)
			throws Exception {
		LinkedList<Integer> al = new LinkedList();
		getTrackConnection0(gleis1Id, gleis2Id, al);
		if (al.size() != 6) {
			throw new Exception("invalid result returned");
		}
		// NOTE: index 0 is gleisBasisId
		return new EndpointObjectDllTrackConnection(gleis1Id, gleis2Id, (double) al.get(1),
				(double) al.get(2), "", (int) al.get(4),
				(int) al.get(5));

        /**
         * return new EndpointObjectDllTrackConnection(gleis1Id, gleis2Id, (double) al.get(1),
         (double) al.get(2), (String) al.get(3), (int) al.get(4),
         (int) al.get(5));
         */
	}

	// TODO: public native void setTrainPosition(int weicheId, int gleisId);
	private native void getTrainPosition0(int trainTyp, LinkedList res,
			LinkedList positions, LinkedList gleisList);

	public EndpointObjectDllTrainPosition getTrainPosition(int trainTyp) throws Exception {
		LinkedList<Integer> al = new LinkedList();
		LinkedList alP = new LinkedList();
		LinkedList alG = new LinkedList();
		getTrainPosition0(trainTyp, al, alP, alG);
		if (al.size() != 1) {
			throw new Exception("invalid result returned");
		}
		return new EndpointObjectDllTrainPosition(trainTyp, (int) (al.get(0)), alP, alG);
	}

}
