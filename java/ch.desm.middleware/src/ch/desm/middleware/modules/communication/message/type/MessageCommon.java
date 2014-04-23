package ch.desm.middleware.modules.communication.message.type;


public class MessageCommon extends MessageBase {
	
	public final static String PARAMETER_PLACEHOLDER = "\\?";
	
	protected String globalId;
	
	/**
	 * the signal is coming from
	 * extern components: only from intern system (1) or
	 * from extern components and intern system (0)
	 */
	protected String externIntern;
	protected String element;
	protected String function;
	protected String parameter;
	protected String instance;

	public MessageCommon(MessageUbw32 message) {
		super(message.getPayload(), message.getTopic());
	}
	
	public MessageCommon(String topic, String globalId, String externIntern,
			String element, String function, String instance, String parameter,
			String payload) {
		super(payload, topic);
		this.globalId = globalId;
		this.externIntern = externIntern;
		this.element = element;
		this.function = function;
		this.instance = instance;
		this.parameter = parameter;
	}

	public String getGlobalId() {
		return this.globalId;
	}

	public String getExternIntern() {
		return this.externIntern;
	}

	public String getElement() {
		return this.element;
	}

	public String getFunction() {
		return this.function;
	}

	public String getParameter() {
		return this.parameter;
	}

	public String getInstance() {
		return this.instance;
	}

	public String toString() {
		String s = super.toString();
		s += ", ";
		s += "globalId: " + globalId;
		s += ", ";
		s += "externIntern: " + externIntern;
		s += ", ";
		s += "element: " + element;
		s += ", ";
		s += "function: " + function;
		s += ", ";
		s += "parameter: " + parameter;
		s += ", ";
		s += "instance: " + instance;

		return s;
	}
}
