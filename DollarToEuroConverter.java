public class DollarToEuroConverter extends CurrencyConverter
{
  public DollarToEuroConverter() {}

  @Override
  public double convert(double inDollars) {
    if (checkInput(inDollars)){
      return inDollars*0.85;
    } else{
      return 1;
    }
  }

  public String toString(){
    return "Dollar to Euro Converter";
  }

  public void print(){
    System.out.println(toString());
  }

  
};
