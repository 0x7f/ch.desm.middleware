package ch.desm.middleware.app.core.component.simulation.locsim.elements;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import ch.desm.middleware.app.core.component.ComponentMapBase;

public class LocsimElementFahrschalter extends ComponentMapBase {

	@Override
	public Map<String, String> getMap() {
		return this.map;
	}

	@Override
	protected void init() {

		map.put("U08","fahrschalter.bremsen.plus"); //Fahrschalter bremsen
		map.put("U07","fahrschalter.bremsen.punkt"); //Fahrschalter bremsen
		map.put("U06","fahrschalter.bremsen.minus"); //Fahrschalter bremsen
		map.put("U05","fahrschalter.neutral"); //Fahrschalter 0
		map.put("U04","fahrschalter.fahren.minus"); //Fahrschalter fahren
		map.put("U03","fahrschalter.fahren.punkt"); //Fahrschalter fahren
		map.put("U02","fahrschalter.fahren.m"); //Fahrschalter fahren
		map.put("U01","fahrschalter.fahren.plus"); //Fahrschalter fahren
		map.put("U00","fahrschalter.fahren.plusplus"); //Fahrschalter fahren
	}
	
	public HashMap<String, String> getLocsimNeededKeys(String key){
		return getRemovedKeyList(key);
	}
	
	private HashMap<String, String> getRemovedKeyList(String key){
		
		HashMap<String, String> list = new HashMap<String, String>();
		
		for(Entry<String, String> element : map.entrySet()){
			if(!element.equals(key)){
				list.put(element.getKey(), element.getValue());
			}
		}
		
	return list;
	}

}
