package ch.desm.middleware.app.core.component.cabine.re420.maps;

import java.util.Map;

import org.apache.log4j.Logger;

import ch.desm.middleware.app.common.ComponentMapBase;
import ch.desm.middleware.app.core.component.simulation.locsim.Locsim;

public class Re420MapBinding extends ComponentMapBase  {

	private static Logger LOGGER = Logger.getLogger(Locsim.class);
	
	@Override
	public Map<String, String> getMap() {
		return this.map;
	}
	
	public boolean isKeyAvailable(String id){
		return map.containsKey(id);
	}
	
	public boolean isValueAvailable(String id){
		return map.containsValue(id);
	}
	
	/**
	 * binding is needed to set a function directly in the component
	 */
	@Override
	protected void init() {
		
		map.put("s182.3", "l182.3"); //Türfreigabe links
		map.put("s182.4", "l182.4"); //Türfreigabe rechts
		map.put("s182", "l185"); //Türverriegelung
	}

}
