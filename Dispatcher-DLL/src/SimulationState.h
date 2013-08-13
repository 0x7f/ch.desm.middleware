#pragma once

#include <string>
#include <vector>

namespace desm {
	
	static const int INVALID_ID = std::numeric_limits<int>::max();

	struct Balise {
		int id;
		int gleisId;
		double position;
		int direction;
	};

	struct Signal {
		int id;
		int gleisId;
		double position;
		int typ;
		float hoehe;
		float distanz;
		std::string name;
		int direction;
	};
	
	struct Gleis {
		int id;
		double von;
		double bis;
		double abstand;
		std::string name;
		std::set<double> isolierstoesse;
		std::map<int, Balise> balise;
	};
	
	//TODO: Sebastian
	struct SimulationState {
	public:
		typedef std::map<int, Gleis> tGleisMap;
	public:
		int kilometerDirection;
		Balise balise;
		Signal signal;
		tGleisMap gleise;
	public:
		void reset() {
			kilometerDirection = 0;
			
			//TODO: Balise, Signale
			gleise.clear();
		}
	public:

		bool isValidGleisId(int gleisId) const {
			return gleise.find(gleisId) != gleise.end();
		}

		//TODO: need review
		bool isValidBaliseId(int gleisId, int baliseId) const {
			tGleisMap::const_iterator it = gleise.find(gleisId);
			if(it == gleise.end()) {
				return false;
			}
			return it->second.balise.find(baliseId) != it->second.balise.end();
		}

		//TODO: isValidSignal

		bool isValidIsolierstoss(int gleisId, double position) {
			tGleisMap::const_iterator it = gleise.find(gleisId);
			if(it == gleise.end()) {
				return false;
			}
			return it->second.isolierstoesse.find(position) != it->second.isolierstoesse.end();
		}
	};

};