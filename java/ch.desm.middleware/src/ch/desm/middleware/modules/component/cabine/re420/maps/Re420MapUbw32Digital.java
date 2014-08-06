package ch.desm.middleware.modules.component.cabine.re420.maps;

import java.util.Map;

import ch.desm.middleware.modules.component.ComponentMapBase;

public class Re420MapUbw32Digital extends ComponentMapBase {

	public static final String PINBITMASK_CONFIGURATION_DIGITAL = "17943,65339,16,49152,768,12596,960";
	
	public Re420MapUbw32Digital() {
		super();
	}

	public boolean isKeyAvailable(String id) {
		return map.containsKey(id);
	}

	public boolean isValueAvailable(String id) {
		return map.containsValue(id);
	}

	@Override
	public Map<String, String> getMap() {
		return map;
	}

	protected void initialize() {

		map.put("s126", "C4"); //Steuerstrom
		map.put("s129", "G8"); //Stromabnehmer
		map.put("s132", "G9"); //Hauptschalter
		map.put("s235", "E8"); //Totmannpedal

		map.put("s140a", "E9"); //Wendeschalter 140a vorwärts
		map.put("s140b", "B3"); //Wendeschalter 140b rückwärts

		map.put("s150a", "A9"); //Fahrschalter 150a
		map.put("s150b", "B9"); //Fahrschalter 150b
		map.put("s150d", "B10"); //Fahrschalter 150d
		map.put("s150e", "F13"); //Fahrschalter 150e
		map.put("s150f", "F12"); //Fahrschalter 150f
		map.put("s150g", "B14"); //Fahrschalter 150g
		map.put("s150l", "B15"); //Fahrschalter 150l
		
		//output
		map.put("s182.3", "B5"); //Türfreigabe links
		map.put("s182.4", "A10"); //Türfreigabe rechts
		map.put("s182", "B4"); //Türverriegelung
	}

}
