import java.util.LinkedHashMap;
import java.util.Map;

public class ChainDecorator extends Decorator {
	
	private UnitConverter SecondInput;

	public ChainDecorator(UnitConverterInterface decoratedConverter) {
		super(decoratedConverter);
		createMap();

		

	}
	
	
	public void link(UnitConverter SecondInput) throws IllegalArgumentException {
		
		if (decoratedConverter.getClass() == SecondInput.getClass()) {

			throw new IllegalArgumentException("converters not compatible");
		}
		
		this.SecondInput = SecondInput;
	}
	
	private Map<String, Double> m;

	private void createMap(){
		m = new LinkedHashMap<String, Double>();
		m.put("DollarToEuro",0.85);
		m.put("EuroToDollar", 1.18);
		m.put("DollarToPound", 0.74);
		m.put("CelsiusToFahrenheit", 32.0);
		m.put("FahrenheitToCelsius", 0.625);
		m.put("KilometerToMile", 0.62);
		m.put("MileToKilometer", 1.6);
	}

	@Override
	public double convert(double inValue) throws Exception {
		double secondconversion = m.get(SecondInput);
		// get string to know what you convert
		//hashmap for hashing converters
		//multiplying with constants
		//somehow also check compatibility

		return decoratedConverter.convert(inValue)*secondconversion;
	};

	@Override
	public String toString() {
		return decoratedConverter.toString() + "This is a test";
	};

	@Override
	public void print() {
		decoratedConverter.print();
	};
}