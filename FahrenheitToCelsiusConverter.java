import java.io.*;

public class FahrenheitToCelsiusConverter extends TemperatureConverter{
	public FahrenheitToCelsiusConverter() {}
	public double convert(double inFahrenheit) throws IllegalTempException {
		if (inFahrenheit < -460) { throw new IllegalTempException((-460-inFahrenheit));}
		else {	return (inFahrenheit-32)*5/9;}
  	}

  	public String toString(){
    	return "Fahrenheit to Celsius Converter";
  	}

  	public void print(){
    	System.out.println(toString());
  	}
}