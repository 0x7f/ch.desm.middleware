package ch.desm.middleware.app.core.communication.message;



public class MessageUbw32DigitalRegisterSingle extends MessageUbw32Base  {
	
	private String register;
	private String pin;
	private String parameter;
	
	public MessageUbw32DigitalRegisterSingle(String payload, String topic){
		super(payload, topic);
		
		String parts[] = payload.split(",");
		register = parts[1];
		pin = parts[2].replace("PI", "");
		parameter = parts[3];
		
	}
	
	public String getPort(){
		return register+pin;
	}
	
	public String getRegister(){
		return register;
	}
	
	public String getPin(){
		return pin;
	}
	
	public boolean isEnabled(){
		return parameter.contains("1");
	}

	public String getInputValue(String register, String pin) {
		if(register.equals(this.register) && pin.equals(this.pin)){
			return parameter;
		}
		return "";
	}
	
	@Override
	public String toString(){
		String s = super.toString();
		s += " register: " + register;
		s += ", ";
		s += " pin: " + pin;
		s += ", ";
		s += " isEnabled: " + parameter;
		s += ", ";
		return s;
	}
}
