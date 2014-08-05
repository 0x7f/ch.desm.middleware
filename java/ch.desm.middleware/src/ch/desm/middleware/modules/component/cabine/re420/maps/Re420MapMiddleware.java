package ch.desm.middleware.modules.component.cabine.re420.maps;

import java.util.Map;

import ch.desm.middleware.modules.component.ComponentMapBase;

public class Re420MapMiddleware extends ComponentMapBase {

	@Override
	public Map<String, String> getMap() {
		return map;
	}
	
	@Override
	protected void initialize(){

		map.put("locsim.initialization.ready.ini1", "locsim.initialization.ready.ini1;os;0;message;initialisiation;ini1;?;locsim-rs232;#");
		map.put("locsim.initialization.ready.ini7", "locsim.initialization.ready.ini7;os;0;message;initialisiation;ini7;?;locsim-rs232;#");
		map.put("locsim.initialization.ready.ini2", "locsim.initialization.ready.ini2;os;0;message;initialisiation;ini2;?;locsim-rs232;#");
		
		map.put("s126", "s126;i;0;schalter;steuerstrom;0;?;kabinere420;#");
		map.put("s129", "s129;i;0;schalter;stromabnehmer;0;?;kabinere420;#");
		map.put("s132", "s132;i;0;schalter;haupt;0;?;kabinere420;#");
		map.put("s235", "s235;i;0;schalter;sifa;pedal;?;kabinere420;#");
		map.put("s140a", "s140a;i;0;schalter;wende;vorwärts;?;kabinere420;#");
		map.put("s140b", "s140b;i;0;schalter;wende;rückwärts;?;kabinere420;#");

		map.put("ao269", "ao269;i;0;drucksensor;druck;hauptleitung;?;kabinere420;#");
		map.put("ao173", "ao173;i;0;drucksensor;druck;bremszylinder;?;kabinere420;#");
		
		
	}
}
