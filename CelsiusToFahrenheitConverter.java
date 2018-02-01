import java.io.*;

public class CelsiusToFahrenheitConverter extends TemperatureConverter
{
  public CelsiusToFahrenheitConverter() { }

  public double convert(double inCelsius) throws IllegalTempException {
	  if (inCelsius < -273) { throw new IllegalTempException((-273-inCelsius));}
	  else {return inCelsius*32;}
  }

  public String toString(){
    return "Celsius to Fahrenheit Converter";
  }

  public void print(){
    System.out.println(toString());
  }
};