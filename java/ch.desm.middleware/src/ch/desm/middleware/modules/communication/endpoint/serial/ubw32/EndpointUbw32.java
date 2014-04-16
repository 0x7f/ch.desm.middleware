package ch.desm.middleware.modules.communication.endpoint.serial.ubw32;

import jssc.SerialPortEvent;
import jssc.SerialPortException;
import ch.desm.middleware.modules.communication.endpoint.serial.EndpointRs232;

/**
 * 
 * @author Sebastian
 * 
 *         You end a command by sending a <CR> or <LF> or some combination of
 *         the two. This is how all commands must be terminated to be considered
 *         valid.
 * 
 *         The total number of bytes of each command, counting from the very
 *         first byte of the command name up to and including the <CR> at the
 *         end of the command must be 64 bytes or less. If it is longer than 64
 *         bytes, the command will be ignored, and other bad things may or may
 *         not happen.
 * 
 *         You can string together as many commands as you want into one string,
 *         and then send that string all at once to the UBW32. As long as each
 *         individual command is not more than 64 bytes, this will work well. By
 *         putting many commands together (each with their own terminating <CR>)
 *         and sending it all to the UBW32 at once, you make the most efficient
 *         use of the USB bandwidth.
 * 
 *         After successful reception of a command, the UBW32 will always send
 *         back an OK packet, which will consist of "OK<CR><LF>". For just
 *         testing things out with a terminal emulator, this is very useful
 *         because it tells you that the UBW32 understood your command. However,
 *         it does add extra communications overhead that may not be appreciated
 *         in a higher speed application. You can use the CU command to turn off
 *         the sending of "OK" packets. Errors will still be sent, but not any
 *         "OK" packets.
 * 
 *         All command names ("C", "BC", etc.) are case sensitive. In other
 *         words, "BC" is a different command from "bc".
 * 
 *         All port names ("A", "B", "C") are case insensitive. You can use "B"
 *         or "b" for port names.
 */
public abstract class EndpointUbw32 extends EndpointRs232 {

	public static final String RETURN_INPUT_STATE = "I";
	public static final String RETURN_PIN_INPUT = "PI";
	public static final String RETURN_INPUT_ANALOG = "IA";
	public static final String MESSAGE_TERMINATOR = "\n";
	
	protected String configurationDigital;
	private String pinbitMaskInputAnalog;
	private EndpointUbw32Polling polling;
	boolean ignoreUbw32ControlMessages;

	/**
	 * 
	 * @param enumSerialPort
	 */
	public EndpointUbw32(EnumSerialPorts enumSerialPort,
			String configurationDigital,
			String pinbitMaskInputAnalog) {
		super(enumSerialPort);
		this.ignoreUbw32ControlMessages = false;
		this.pinbitMaskInputAnalog = pinbitMaskInputAnalog;
		this.configurationDigital = configurationDigital;
		this.polling = new EndpointUbw32Polling(this);
		this.initialize();
	}
	
	public String getPinBitMaskInputAnalog(){
		return this.pinbitMaskInputAnalog;
	}

	/**
	 * do work to initialze the controller on constructor call
	 */
	private void initialize() {
		this.sendCommandConfigureUbw32(); // disable OK return packet
		this.sendCommandVersion();
		
		this.sendCommandConfigure(configurationDigital);
		this.sendCommandConfigureAnalogInputs(pinbitMaskInputAnalog);

		this.polling.start();
	}

	@Override
	/**
	 * this listener receives a command from UBW32
	 * 
	 * @param SerialPortEvent event
	 */
	public synchronized void serialEvent(SerialPortEvent event) {
		String inputState = super.getSerialPortMessage(event);

		if (!inputState.isEmpty()) {
			if (!ignoreUbw32ControlMessages) {

				if (inputState.contains("!")) {

					System.out.println("receive ubw32 error message on port:"
							+ serialPort.getPortName() + " with message:"
							+ inputState);

				} else if ((inputState.contains("OK"))) {
					System.out.println("receive ubw32 return message:"
							+ serialPort.getPortName() + " with message:"
							+ inputState);
				}

				else{
					super.onIncomingEndpointMessage(inputState);
				}
			} else {
				System.out.println("ignored ubw32 control message:\""
						+ inputState + "\"");
			}
		}
	}

	@Override
	/**
	 * TODO refactoring sleep
	 */
	protected void sendCommand(String command) {
		try {
			
			Thread.sleep(1000);
			command += EndpointUbw32.MESSAGE_TERMINATOR;
			super.sendCommand(command);

		} catch (SerialPortException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			polling.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * The "T1" command stands for "Run Test 1". It set all pins to be digital
	 * outputs, and set them all high. It will then pull each one down, in turn,
	 * for the length of time specified. It will start with A15, and progress
	 * clockwise around the UBW to D8, then cycle back around to A15. It will
	 * repeat this the number of times specified. The purpose of this command is
	 * to test all 78 I/Os, and show that they are all connected properly to the
	 * CPU, and that there are no opens or shorts. If you put an LED through a
	 * resistor to +3.3V on each I/O pin, you'll end up with a nice Knight Rider
	 * effect. Format: "T1,<duration>,<iterations><CR>" <Duration>: This is an
	 * unsigned 16 bit integer, and represents the time, in milliseconds, that
	 * each I/O will be pulled low <Iterations>: This is an unsigned 16 bit
	 * integer, and represents the number of times to repeat the pattern
	 * Example: "T1,200,4" - This would run the pattern four times, with each
	 * pin going low for 200ms. Return Packet: "OK"
	 * 
	 * @param
	 */
	public void sendCommandT1(String duration, String iterations) {
		String command = "T1";
		command += ",";
		command += duration;
		command += ",";
		command += iterations;

		sendCommand(command);
	}

	/**
	 * The "O" command stands for 'Output state' and will take the values you
	 * give it and write them to the port A, B and C data registers. This allows
	 * you to set the state of all pins that are outputs. Format:
	 * "O,<PortA>,<PortB>,<PortC>,<PortD>,<PortE>,<PortF>,<PortG><CR>" where
	 * <PortX> is a value between 0 and 65,535 that indicates the value of the
	 * port pins for that register. Example: "O,0,0,131,0,0,0,0" Return Packet:
	 * "OK"
	 * 
	 * @param command
	 */
	public void sendCommandOutputState(String configuration) {
		String command = "O";
		command += ",";
		command += configuration;

		this.sendCommand(command);
	}

	/**
	 * The "C" command stands for 'Configure' and allows you to set the state of
	 * the port direction registers for ports A, B and C, as well as enable
	 * analog inputs. This allows you to turn each pin into an input or an
	 * output on a pin by pin basis, or enable one or more of the pins to be
	 * analog inputs. Format:
	 * "C,<DirA>,<DirB>,<DirC>,<DirD>,<DirE>,<DirF>,<DirG><CR>" where <DirX> is
	 * a value between 0 and 65,535 that indicates the direction bits for that
	 * port. A 1 is an input, a 0 is an output. Example: "C,0,0,0,0,65535,0,0" -
	 * This would set all ports as outputs except port E which would be all
	 * input Return Packet: "OK"
	 * 
	 * @param command
	 */
	public void sendCommandConfigure(String configuration) {
		String command = "C";
		command += ",";
		command += configuration;

		this.sendCommand(command);
	}

	/**
	 * The "I" Command stands for 'Input state' and when you send the UBW32 an
	 * "I" command, it will respond with an "I" packet back that will hold the
	 * value of each bit in each of the seven ports A, B, C, D, E, F and G. It
	 * reads the state of the pin, no matter if the pin is an input or an
	 * output. Format: "I<CR>" Example: "I" Return Packet:
	 * "I,<StatusA>,<StatusB>,<StatusC>,<StatusD>,<StatusE>,<StatusF>,<StatusG><CR>"
	 * where <StatusX> is a number from 0 to 65,535 that indicates the current
	 * value of the pins on that port. Note that <StatusX> will always be 5
	 * characters long, which means that leading zeros will be added so that the
	 * return packet is always the same length regardless of the data values.
	 * Example Return Packet: "I,50943,64479,24606,65535,01015,12607,62403"
	 * 
	 * @param command
	 */
	public void sendCommandInputState() {
		String command = "I";

		this.sendCommand(command);
	}

	/**
	 * The "V" Command stands for 'Version' and when you send the UBW an "V"
	 * command, it will respond with a text string that looks something like
	 * this: "UBW32 Version 1.0" Format: "V<CR>" Return Packet: (example)
	 * "UBW32 Version 1.1"
	 * 
	 * @param command
	 */
	public void sendCommandVersion() {
		String command = "V";

		sendCommand(command);
	}

	/**
	 * The "R" Command stands for 'Reset to default state' and when you send the
	 * UBW32 an "R" command it will initialize all pins to digital inputs.
	 * Format: "R<CR>" Return Packet: "OK"
	 * 
	 * @param command
	 */
	public void sendCommandReset() {
		String command = "R";

		sendCommand(command);
	}

	/**
	 * The "PD" command stands for "Pin Direction". It allows you to set the
	 * direction on just one pin at a time. (Input or Output) Format:
	 * "PD,<Port>,<Pin>,<Direction><CR>" <Port>: This is the character A, B, C,
	 * D, E, F or G depending upon which port you want to change. <Pin>: This is
	 * a number between and including 0 to 31. It indicates which pin in the
	 * port you want to change the direction on. <Direction>: This is either "0"
	 * or "1", for Output (0) or Input (1). Example: "PD,B,2,1" - This would
	 * change Port B, pin 2 to an input. Return Packet: "OK"
	 * 
	 * @param port
	 * @param pin
	 * @param direction
	 */
	public void sendCommandPinDirection(String port, String pin,
			String direction) {
		String command = "PD";
		command += ",";
		command += port;
		command += ",";
		command += pin;
		command += ",";
		command += direction;

		sendCommand(command);
	}

	/**
	 * The "PI" command stands for "Pin Input". It allows you to read the state
	 * of just one pin at a time. (High or Low) Format: "PI,<Port>,<Pin><CR>"
	 * <Port>: This is the character A, B, C, D, E, F or G depending upon which
	 * port you want to change. <Pin>: This is a number between and including 0
	 * to 31. It indicates which pin in the port you want to change the
	 * direction on. Example: "PI,C,6" - This would read the state of Port C pin
	 * 6. Return Packet: "PI,<Value>" <Value>: This is either a High (1) or a
	 * Low (0) depending upon the voltage on the pin at the time it was read.
	 * Example Return Packet: "PI,1" (Means that the pin was high.)
	 */
	public void sendCommandPinInput(String port, String pin) {
		String command = "PI";
		command += ",";
		command += port;
		command += ",";
		command += pin;

		this.sendCommand(command);
	}

	/**
	 * The "PO" command stands for "Pin Output". It allows you to set the output
	 * value (if it is currently set to be an output) on just one pin at a time.
	 * (High or Low) Format: "PO,<Port>,<Pin>,<Value><CR>" <Port>: This is the
	 * character A, B, C, D, E, F or G depending upon which port you want to
	 * set. <Pin>: This is a number between and including 0 to 31. It indicates
	 * which pin in the port for which you want to set the state. <Value>: This
	 * is either "0" or "1", for Low (0) or High (1). Example: "PD,A,3,0" - This
	 * would make Port A pin 3 low. Return Packet: "OK"
	 */
	public void sendCommandPinOutput(String port, String pin, String value) {
		String command = "PO";
		command += ",";
		command += port;
		command += ",";
		command += pin;
		command += ",";
		command += value;

		this.sendCommand(command);
	}

	/**
	 * Sets a PWM value for any of the 5 PWM hardware channels Format:
	 * "PM,<Channel>,<DutyCycle><CR>" <Channel> is required and is 1 through 5,
	 * which correspond to the output compare (OC0 through OC4 = RD0 through
	 * RD4) pins. <DutyCycle> is required and is 0 through 65535. If <DutyCycle>
	 * is 0, then the hardware PWM is shut off. The PWM frequency is 1220Hz
	 * (80MHz/0x10000) Example: "PM,3,512" Return Packet: "OK"
	 */
	public void sendCommandPwm(String channel, String dutyCycle) {
		String command = "PM";
		command += ",";
		command += channel;
		command += ",";
		command += dutyCycle;

		this.sendCommand(command);
	}

	/**
	 * TODO implementation
	 * 
	 * SP command (Software PWM output) Sets a PWM value for any of 18 PWM
	 * channels Format:
	 * "SP,<Channel1>,<DutyCycle1>,<Channel2>,<DutyCycle2>,...,<Channel18>,<DutyCycle18><CR>"
	 * <Channel1> is required <DutyCycle1> is required and is 0 through 4096 But
	 * <Channel2> through <Channel18> are optional. Note that you must have
	 * pairs of values - you can't skip a channel number and have more PWM
	 * values than channels, for example. Setting a PWM value of a channel to 0
	 * turns the PWM of that channel off, and allows normal digitial I/O on that
	 * pin. PWM value of 4095 will be %100 on time.
	 * 
	 * Example: "SP,4,2899,7,1955,2,0<CR>" - Would set channel 4 to 2899,
	 * channel 7 to 1955 and channel 5 to 0. Return Packet: "OK"
	 */
	public void sendCommandSoftwarePwmOutputValue(String channel,
			String dutyCycle) {
		String command = "SP";
		command += ",";
		command += channel;
		command += ",";
		command += dutyCycle;

		this.sendCommand(command);
	}

	/**
	 * 
	 * TODO implementation
	 * 
	 * The "PC" Command : Configure software PWM paramters PC command (configure
	 * software PWM parameters) is used in conjunction with the SP command (see
	 * above). The SC command should be used to set up each of the various
	 * paramters for the SP command, before starting up any of the software PMW
	 * channels with the SP command. Format:
	 * "PC,<SubCommand>,<Value1>,<Value2>,<Value3><CR>" <SubCommand> is
	 * required, and what <Value> means (and how many of the 3 are actually
	 * needed) depends upon the <Command> value. SubCommand = 0, Value1 = Roll
	 * Over Value, 32 bit unsigned int, units = ISR ticks Use this commnd to set
	 * the number of ISR ticks between rising edges of all PWM channels. This
	 * effectively sets the PWM frequency, and the effective resolution (i.e.
	 * maximum value for DutyCycle on each PWM channel) SubCommand = 1, Value1 =
	 * ISR Rate, 32 bit unsigned int (Currently unimplemented in 1.6.3) This sub
	 * commands sets the time between ISR ticks. The units are 80MHz clocks.
	 * Don't make this too fast, or your processor will lock up. SubCommand = 2,
	 * Value1 = PWM Channel, Value2 = Port (use 'A' through 'G'), Value3 = pin
	 * (0 through 15) This sub command uses all 3 values. It assigns a physical
	 * pin to a software PWM channel number. Send one of these for each pin you
	 * want to set up. SubCommand = 3, Value1 = anything, print out current SP
	 * command paramters Ths sub command just prints out the current paramters
	 * for the SP command SubCommand = 4, Value1 = MaxUsedChannel, 8-bit
	 * unsigned value from 0 to 64 Use this sub command first (before SubCommand
	 * 2) to set the maximum number of channels that the software PWM system can
	 * handle. The smaller it is, the faster you can go. SubCommand = 5, Value1
	 * = SoftwarePWMState (0 = Off/1 = On) - use to turn off software PWM Use
	 * this sub command after you're done with a channel to turn it off.
	 * Example: "PC,4,3<CR>" "PC,2,1,D,1<CR>" "PC,1,1000<CR>" - Sets ISR tick
	 * rate at 80,000,000/1,000 or 80KHz "PC,0,4096<CR>" - Sets PWM resolution
	 * to 12 bits, and PWM frequency to 80Khz/4096 = 19.5Hz Return Packet: "OK"
	 */
	public void sendCommandConfigureSoftwarePwmParamters(String subCommand,
			String value1, String value2, String value3) {

	}

	/**
	 * The "CA" Command : Configure Analog inputs CA command configures and
	 * turns on the analog inputs - use before the IA command (see below).
	 * Format: "CA,<PinBitmask><CR>" <PinBitmask> is required, represents the
	 * bits of the analog inputs that you want to 'turn on' to be analog inputs.
	 * Valid values are 0 to 65,535. Each bit corresponds to an ANx (analog
	 * input pin). See the UBW32 scheamatic to see what pins each analog input
	 * is on. Example: "CA,11<CR>" would set AN0, AN1 and AN3 to be analog
	 * inputs. Return Packet: "OK"
	 */
	public void sendCommandConfigureAnalogInputs(String pinBitmask) {
		String command = "CA";
		command += ",";
		command += pinBitmask;

		this.sendCommand(command);
	}

	/**
	 * IA command reads analog inputs and prints out their values. You must use
	 * the "CA" command first to turn on the analog inputs you want to use. The
	 * command will loop through all bits that are high in <PinBitmask> and
	 * print out those analog input's values, then wait for <Delay>
	 * microseconds, then do the whole thing <Count> times. Note that all values
	 * are simply printed out in a long stream (with commas between each value),
	 * after all values are read. For this command to work properly, the
	 * <PinBitmask> used in the IA command must not have any bits set that were
	 * not set in the last CA command's <PinBitmask>. In other words, if you
	 * tell the IA command to read analog inputs which you have not yet
	 * configured as analog inputs using the CA command, you will not get the
	 * results you expect. The analog to digital converter on the PIC32 is 10
	 * bits, so you will get values from around 0 (for 0.0V input) to 1023 (for
	 * 3.3V input). Format: "IA,<PinBitmask>,<DelayUS>,<Count><CR>" <PinBitmask>
	 * is required, and represents the a bitmask of the bits you want to read.
	 * For example, if you wanted to read AN1 and AN3, you would use 9 for this
	 * paramter. <DelayUS> is required, and is in microseconds. This is the
	 * delay between <Count> reads of <PinBitmask> analog inputs. <Count> is
	 * required, and is the number of times you want to read the inputs, with
	 * <Delay> microseconds between each set of readings. Example:
	 * "IA,11,1000,5<CR>" would read AN0, AN1 and AN3 and print their values,
	 * then delay for 1000us, then read and print their values again, etc. five
	 * times in a row. Return Packet:
	 * "IA,16,873,651,17,32,19,14,15,14,17,15,14,15,15,13<CR>OK<CR>", which
	 * represents the values of
	 * AN0,AN1,AN3,AN0,AN1,AN3,AN0,AN1,AN3,AN0,AN1,AN3,AN0,AN1,AN3.
	 */
	public void sendCommandInputAnalog(String pinBitmask) {
		String delayUs = "0";
		String count = "1";

		String command = "IA";
		command += ",";
		command += pinBitmask;
		command += ",";
		command += delayUs;
		command += ",";
		command += count;

		this.sendCommand(command);
	}

	public void sendCommandConfigureUbw32() {
		String parameter = "1";
		String value = "0";

		String command = "CU";
		command += ",";
		command += parameter;
		command += ",";
		command += value;

		this.sendCommand(command);
	}
}
