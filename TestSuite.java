import TinyTestJ.Test;
import static TinyTestJ.Assert.*;
import java.io.*;

public class TestSuite  {
  /*ConverterFactory*/
  //Create DollarToEuroConverter
  @Test public static void ConFTest1() throws Exception{
    ConverterFactory cf = ConverterFactory.getInstance();
    UnitConverter uc = cf.create("DollarToEuro");
    double result = uc.convert(27);
    assertEquals(22.95, result, 0.001);
  }
  //Create EuroToDollarConverter
  @Test public static void ConFTest2() throws Exception{
    ConverterFactory cf = ConverterFactory.getInstance();
    UnitConverter uc = cf.create("EuroToDollar");
    double result = uc.convert(138);
    assertEquals(162.84, result, 0.001);
  }
  //Create CelsiusToFahrenheitConverter
  @Test public static void ConFTest3() throws Exception{
    ConverterFactory cf = ConverterFactory.getInstance();
    UnitConverter uc = cf.create("CelsiusToFahrenheit");
    double result = uc.convert(-7);
    assertEquals(-224, result, 0.001);
  }
  //Create FahrenheitToCelsiusConverter
  @Test public static void ConFTest4() throws Exception{
    ConverterFactory cf = ConverterFactory.getInstance();
    UnitConverter uc = cf.create("FahrenheitToCelsius");
    double result = uc.convert(157);
    assertEquals(69.44444444444444, result, 0.001);
  }
  //Create KilometerToMile
  @Test public static void ConFTest5() throws Exception{
    ConverterFactory cf = ConverterFactory.getInstance();
    UnitConverter uc = cf.create("KilometerToMile");
    double result = uc.convert(10458);
    assertEquals(6483.96, result, 0.001);
  }
  //Create MileToKilometer
  @Test public static void ConFTest6() throws Exception{
    ConverterFactory cf = ConverterFactory.getInstance();
    UnitConverter uc = cf.create("MileToKilometer");
    double result = uc.convert(10458);
    assertEquals(16732.8, result, 0.001);
  }

  /*DollarToEuro*/
  //Positive Input
  @Test public static void DETest1()throws Exception {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(10000);
    assertEquals(8500,result,0.001);
  }
  //Negative Input
  @Test public static void DETest2() throws Exception{
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(-1);
    assertEquals(1,result,0.001);
  }
  //Extremly Large Input
  @Test public static void DETest3()throws Exception {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(Double.MAX_VALUE);
    assertEquals(1.5280391646329683E308, result, 0.001);
  }
  //Extremly Small Input
  @Test public static void DETest4() throws Exception{
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(Double.MIN_VALUE);
    assertEquals(1, result, 0.001);
  }

  /*EuroToDollar*/
  //Positive Input
  @Test public static void EDTest1()throws Exception {
    UnitConverter test = new EuroToDollarConverter();
    double result = test.convert(10000);
    assertEquals(11800, result, 0.001);
  }
  //Negative Input
  @Test public static void EDTest2()throws Exception{
    UnitConverter test = new EuroToDollarConverter();
    double result = test.convert(-1);
    assertEquals(1, result, 0.001);
  }
  //Extremly Large Input
  @Test public static void EDTest3()throws Exception{
    UnitConverter test = new EuroToDollarConverter();
    double result = test.convert(Double.MAX_VALUE);
    assertEquals(Double.POSITIVE_INFINITY, result, 0.001);
  }
  //Extremly Small Input
  @Test public static void EDTest4()throws Exception{
    UnitConverter test = new EuroToDollarConverter();
    double result = test.convert(Double.MIN_VALUE);
    assertEquals(1, result, 0.001);
  }

  /*CelsiusToFahrenheit*/
  //Positive Input
  @Test public static void CFTest1() throws Exception{
    UnitConverter test = new CelsiusToFahrenheitConverter();
    double result = test.convert(10000);
    assertEquals(320000, result, 0.001);
  }
  //Negative Input
  @Test public static void CFTest2()throws Exception{
    UnitConverter test = new CelsiusToFahrenheitConverter();
    double result = test.convert(-1);
    assertEquals(-32, result, 0.001);
  }
  //Extremly Large Input
  @Test public static void CFTest3()throws Exception{
    UnitConverter test = new CelsiusToFahrenheitConverter();
    double result = test.convert(Double.MAX_VALUE);
    assertEquals(Double.POSITIVE_INFINITY, result, 0.001);
  }
  //Extremly Small Input
  @Test public static void CFTest4()throws Exception{
    UnitConverter test = new CelsiusToFahrenheitConverter();
    double result = test.convert(Double.MIN_VALUE);
    assertEquals(1.58E-322, result, 0.001);
  }

  /*FahrenheitToCelsius*/
  //Positive Input
  @Test public static void FCTest1() throws Exception{
    UnitConverter test = new FahrenheitToCelsiusConverter();
    double result = test.convert(10000);
    assertEquals(5537.777777777777, result, 0.001);
  }
  //Negative Input
  @Test public static void FCTest2()throws Exception{
    UnitConverter test = new FahrenheitToCelsiusConverter();
    double result = test.convert(-1);
    assertEquals(-18.333333333333332, result, 0.001);
  }
  //Extremly Large Input
  @Test public static void FCTest3()throws Exception{
    UnitConverter test = new FahrenheitToCelsiusConverter();
    double result = test.convert(Double.MAX_VALUE);
    assertEquals(Double.POSITIVE_INFINITY, result, 0.001);
  }
  //Extremly Small Input
  @Test public static void FCTest4()throws Exception{
    UnitConverter test = new FahrenheitToCelsiusConverter();
    double result = test.convert(Double.MIN_VALUE);
    assertEquals(-17.77777777777778, result, 0.001);
  }

  /*KilometerToMile*/
  //Positive Input
  @Test public static void KMTest1()throws Exception {
    UnitConverter test = new KilometerToMileConverter();
    double result = test.convert(10000);
    assertEquals(6200, result, 0.001);
  }
  //Negative Input
  @Test public static void KMTest2()throws Exception{
    UnitConverter test = new KilometerToMileConverter();
    double result = test.convert(-1);
    assertEquals(-0.62, result, 0.001);
  }
  //Extremly Large Input
  @Test public static void KMTest3()throws Exception{
    UnitConverter test = new KilometerToMileConverter();
    double result = test.convert(Double.MAX_VALUE);
    assertEquals(1.1145697436146357E308, result, 0.001);
  }
  //Extremly Small Input
  @Test public static void KMTest4()throws Exception{
    UnitConverter test = new KilometerToMileConverter();
    double result = test.convert(Double.MIN_VALUE);
    assertEquals(4.9E-324, result, 0.001);
  }

  /*MileToKilometer*/
  //Positive Input
  @Test public static void MKTest1() throws Exception{
    UnitConverter test = new MileToKilometerConverter();
    double result = test.convert(10000);
    assertEquals(16000, result, 0.001);
  }
  //Negative Input
  @Test public static void MKTest2()throws Exception{
    UnitConverter test = new MileToKilometerConverter();
    double result = test.convert(-1);
    assertEquals(-1.6, result, 0.001);
  }
  //Extremly Large Input
  @Test public static void MKTest3()throws Exception{
    UnitConverter test = new MileToKilometerConverter();
    double result = test.convert(Double.MAX_VALUE);
    assertEquals(Double.POSITIVE_INFINITY, result, 0.001);
  }
  //Extremly Small Input
  @Test public static void MKTest4()throws Exception{
    UnitConverter test = new MileToKilometerConverter();
    double result = test.convert(Double.MIN_VALUE);
    assertEquals(1.0E-323, result, 0.001);
  }
}
