package ch.desm.middleware.modules.component.simulation.locsim.maps;

import java.util.Map;

import ch.desm.middleware.modules.component.ComponentMapBase;


public class LocsimMapMiddleware extends ComponentMapBase {
	
	@Override
	public Map<String, String> getMap() {
		return map;
	}
	
	@Override
	protected void initialize(){
		
		map.put("locsim.initialization.ready.ini1", "locsim.initialization.ready.ini1;os;0;message;initialisiation;ini1;?;locsim-rs232;#");
		map.put("locsim.initialization.ready.ini7", "locsim.initialization.ready.ini7;os;0;message;initialisiation;ini7;?;locsim-rs232;#");
		map.put("locsim.initialization.ready.ini2", "locsim.initialization.ready.ini2;os;0;message;initialisiation;ini2;?;locsim-rs232;#");
		
		
		map.put("S126", "s126;i;0;schalter;steuerstrom;0;?;kabinere420;#");
		map.put("S129", "s129;i;0;schalter;stromabnehmer;0;?;kabinere420;#");
		map.put("S132", "s132;i;0;schalter;haupt;0;?;kabinere420;#");
		map.put("s235", "s235;i;0;schalter;sifa;pedal;?;kabinere420;#");
		
		map.put("s140a", "s140a;i;0;schalter;wende;vorwärts;?;kabinere420;#");
		map.put("s140b", "s140b;i;0;schalter;wende;rückwärts;?;kabinere420;#");

		map.put("fahrschalter.bremsen.plus", "fahrschalter.bremsen.plus;i;0;fahrschalter;bremse;plus;?;kabinere420;#");
		map.put("fahrschalter.bremsen.punkt", "fahrschalter.bremsen.punkt;i;0;fahrschalter;bremse;punkt;?;kabinere420;#");
		map.put("fahrschalter.bremsen.minus", "fahrschalter.bremsen.minus;i;0;fahrschalter;bremse;minus;?;kabinere420;#");
		map.put("fahrschalter.neutral", "fahrschalter.neutral;i;0;fahrschalter;neutral;;?;kabinere420;#");
		map.put("fahrschalter.fahren.minus", "fahrschalter.fahren.minus;i;0;fahrschalter;fahren;minus;?;kabinere420;#");
		map.put("fahrschalter.fahren.punkt", "fahrschalter.fahren.punkt;i;0;fahrschalter;fahren;punkt;?;kabinere420;#");
		map.put("fahrschalter.fahren.m", "fahrschalter.fahren.m;i;0;fahrschalter;fahren;m;?;kabinere420;#");
		map.put("fahrschalter.fahren.plus", "fahrschalter.fahren.plus;i;0;fahrschalter;fahren;plus;?;kabinere420;#");
		map.put("fahrschalter.fahren.plusplus", "fahrschalter.fahren.plusplus;i;0;fahrschalter;fahren;plusplus;?;kabinere420;#");


	}
}
