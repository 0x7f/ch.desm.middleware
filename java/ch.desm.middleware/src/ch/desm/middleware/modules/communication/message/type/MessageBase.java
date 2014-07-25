package ch.desm.middleware.modules.communication.message.type;


public abstract class MessageBase{
	
	public static final String MESSAGE_TOPIC_SIMULATION_LOCSIM = "Locsim";
	public static final String MESSAGE_TOPIC_SIMULATION_LOCSIM_RS232_CONFIG = "Locsim-Rs232-configuration";
	public static final String MESSAGE_TOPIC_SIMULATION_LOCSIM_DLL = "Locsim-DLL";
	public static final String MESSAGE_TOPIC_SIMULATION_LOCSIM_RS232 = "Locsim-Rs232";
	public static final String MESSAGE_TOPIC_CABINE_RE420 = "KabineRe420";
	public static final String MESSAGE_TOPIC_INTERLOCKING_OBERMATT_LANGNAU= "StellwerkObermattLangnau";
	public static final String MESSAGE_TOPIC_TEST = "Test";
	
	private String topic;
    private String messageId;
	private String payload;
	
    /**
     * 
     */
    private MessageBase() {
    	this.messageId = String.valueOf(System.currentTimeMillis());
    }
        
    /**
     * 
     * @param idParameterType depends on message context, e.g. signal id
     * @param messageType 
     * 
     */
    public MessageBase(String payload, String topic) {
    	this();
    	this.payload = payload;
    	this.topic = topic;

    }

    @Override
    public String toString(){
    	String s = "";
		s += "topic: " + topic;
		s += ", ";
    	s+= "messageId: "+messageId;
//    	s+= ", ";
//    	s+= "payload: "+payload;
    	
    	return s;
    }
    
    public String getMessageId() {
        return this.messageId;
    }
    
    public String getPayload(){
    	return this.payload;
    }
    
    public String getTopic(){
    	return this.topic;
    }
}
