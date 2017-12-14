import java.util.*;

class Main {
	public static void main(String[] args) {
		LinkedList<Command> CommandQueue = new LinkedList<Command>();
		// String conversion = args[0];
		// String value = args[args.length-1];

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			Command command = null;
			String s1 = sc.nextLine();
			String[] arguments = s1.split("\\s+");

			if (arguments.length == 2) {
				command = executeWithFactory(arguments[0], arguments[1]);
			}
			
			if(arguments.length == 3 && arguments[1].equals("inverse")) {
				command = InverseexecuteWithFactory(arguments[0], arguments[2]);
			}

			if (command != null)
				CommandQueue.add(command);
		}

		// Execute the Commands
		Broker broker = new Broker();

		for (int i = 0; i < CommandQueue.size(); i++) {
			broker.execute(CommandQueue.get(i));
		}

	}

	public static String execute(String conversion, String value) {
		UnitConverterInterface myConverter = null;
		boolean checkIn;
		switch (conversion) {
		case "DollarToEuro":
			myConverter = new DollarToEuroConverter();
			System.out.println(myConverter.toString());
			break;
		case "EuroToDollar":
			myConverter = new EuroToDollarConverter();
			break;
		case "CelsiusToFahrenheit":
			myConverter = new CelsiusToFahrenheitConverter();
			break;
		case "FahrenheitToCelsius":
			myConverter = new FahrenheitToCelsiusConverter();
			break;
		case "KilometerToMile":
			myConverter = new KilometerToMileConverter();
			break;
		case "MileToKilometer":
			myConverter = new MileToKilometerConverter();
			break;
		default:
			return "wrong conversion";
		}

		if (myConverter != null) {
			double result = myConverter.convert(Double.parseDouble(value));
			return myConverter.toString() + ": " + value + " to " + result;
		}
		return "Something went wrong";
	}

	public static Command executeWithFactory(String conversion, String value) {
		double inValue = Double.parseDouble(value);
		ConverterFactory cf = ConverterFactory.getInstance();
		UnitConverter uc = cf.create(conversion);
		if (uc != null) {
			Command command = new ConverterCommand(uc, inValue);
			return command;
			/*
			 * double result = new InverseDecorator (uc).convert(Double.parseDouble(value));
			 * return uc.toString() + ": " + value + " to " + result;
			 */
		}
		return null;
	}
	
	public static Command InverseexecuteWithFactory(String conversion, String value) {
		double inValue = Double.parseDouble(value);
		ConverterFactory cf = ConverterFactory.getInstance();
		UnitConverter uc = cf.create(conversion);
		if (uc != null) {
			UnitConverterInterface Inverse = new InverseDecorator(uc);
			Command command = new ConverterCommand( Inverse, inValue);
			return command;
	
		}
		return null;
	}
	
	
}
