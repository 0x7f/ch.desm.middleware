#pragma once

#include <vector>
#include <Windows.h>

// TODO: convert fatal and api misuse error codes to exceptions?

namespace desm {

	class MwDll {
	public:
		MwDll(LPCWSTR dllName);
		~MwDll();
	public:
		std::string infoVersion();
		std::string infoName();
		std::string infoDescription();
		
		void onStartProgramm(const std::string& configPath);
		void onStopProgramm();

		//ON command
		void onStartSimulation();
		void onStopSimulation();
		void onLoadStrecke();
		
		//SET command
		bool setTrack(int gleisId, double von, double bis, double abstand, const std::string& name);
		bool setTrackConnection(int trackConnectionId, int gleisId, int gleis1, int gleis2, double von, double bis, const std::string& name, int weiche1Id, int weiche2Id);
		bool setSignal(int signalId, int gleisId, double position, int typ, double hoehe, double distanz, const std::string& name, int stellung);
		bool setBalise(int baliseId, int gleisId, double position, int stellung);
		bool setLoop(int baliseId, int gleisId, double positionVon, double positionBis);
		bool setIsolierstoss(int isolierstossId, int gleisId, double position);
		bool setKilometerDirection(int richtung);
		bool setTrainPosition(int train, int direction, const std::vector<double>& positionList, const std::vector<int>& gleisList);
		
		//GET command - BEFORE USE, DO SET
		bool getKilometerDirection(int& richtung);
		bool getEvents(std::vector<int>& typeList, std::vector<int>& idList);
		bool getSignal(int signalId, int& stellung);
		bool getBalise(int baliseId, int& stellung, std::string& protokoll);
		bool getWeiche(int weicheId, int& gleisId);
		bool getLoop(int& baliseId, int& gleisId, double& positionVon, double& positionBis);

		// UNDOCUMENTED - MIDDLEWARE FUNCTIONS (HIGH LEVEL)
		bool getTrainPosition(int& trainTyp, int& direction, std::vector<double>& positionList, std::vector<int>& gleisList);
		bool getIsolierstoss(int isolierstossId, int& gleisId, double& position);
		bool getTrackConnection(int trackConnectionId, int gleisId, int& gleis1, int& gleis2, double& von, double& bis, std::string& name, int& weiche1Id, int& weiche2Id);
		bool getTrack(int gleisId, double& von, double& bis, double& abstand, std::string& name);
		bool setWeiche(int weicheId, int gleisId);

	private:
		struct Impl;
		Impl* m_pImpl;
	};
}
