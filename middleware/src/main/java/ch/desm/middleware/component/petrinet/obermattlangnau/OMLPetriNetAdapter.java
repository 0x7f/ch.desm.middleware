package ch.desm.middleware.component.petrinet.obermattlangnau;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * wrapper class around the petri net class provided by the pnlm export that is
 * caring about the event communication between enpoint and petri net.
 */
public class OMLPetriNetAdapter extends OMLPetriNetExport {

	private static Logger log = Logger.getLogger(OMLPetriNetAdapter.class);

	public List<String> firedTransitions = new ArrayList<String>();

	public boolean canFire(String s) {

		log.info("can fire: " + s);

		return super.canFire(s);
	}

	public void fire(String s) {

		firedTransitions.add(s);

		log.info("petrinet has fired transition buffer: "
				+ firedTransitions.toString());
	}

	public void setSensor(String name) {
		setSensor(name, 1);
	}

	public void setSensor(String name, int value) {
		try {
			log.info("setting sensor: " + name + " to: " + value);

			Class<?> petriNetClass = super.getClass();
			Field field = petriNetClass.getField(name);
			field.setInt(this, value);
		} catch (NoSuchFieldException e) {

			log.warn("unknown petrinet sensor " + name);

		} catch (IllegalAccessException e) {

			log.error("unable to set sensor", e);
		}
	}

	public void initMarker() {
		
		Class<?> superClass = this.getClass().getSuperclass();
		Field[] fields = superClass.getDeclaredFields();

		for (Field classField : fields) {
			Class<?> c = classField.getType();
			if(c.equals(int.class)){
				try {
					
					Integer value = Integer.valueOf(String.valueOf(classField.getInt(this)));
					
					// send marker to broker clients
					// which are initialized with 1
					if(value == 1){
						String name = classField.getName();
						fire(name);
					}					
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}