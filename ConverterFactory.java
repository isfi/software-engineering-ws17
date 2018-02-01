import java.util.LinkedHashMap;
import java.util.Map;

public class ConverterFactory{

	private static final ConverterFactory INSTANCE = new ConverterFactory();

	private Map<String, Class> m;

	private void createMap(){
		m = new LinkedHashMap<String, Class>();
		m.put("DollarToEuro", DollarToEuroConverter.class);
		m.put("EuroToDollar", EuroToDollarConverter.class);
		m.put("DollarToPound", DollarToPoundConverter.class);
		m.put("CelsiusToFahrenheit", CelsiusToFahrenheitConverter.class);
		m.put("FahrenheitToCelsius", FahrenheitToCelsiusConverter.class);
		m.put("KilometerToMile", KilometerToMileConverter.class);
		m.put("MileToKilometer", MileToKilometerConverter.class);
	}

	private ConverterFactory(){
		createMap();
	}

	public static ConverterFactory getInstance(){
		return INSTANCE;
	}

	public UnitConverter create(String conversion){
		Class c = m.get(conversion);
		try{
			return (UnitConverter) c.newInstance();
		} catch(InstantiationException e) {
			System.out.println("converter type not found!");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NullPointerException e){
			System.out.println("converter type not found!");
			e.printStackTrace();
		}
		return null;
		

	}
}