public class DollarToPoundConverter extends CurrencyConverter{
	public DollarToPoundConverter() {}

	public double convert(double inDollar) {
    	if (checkInput(inDollar)){
        return inDollar*0.74;
      } else{
        return 1;
      }
  	}

  	public String toString(){
    	return "Dollar to Pound Converter";
  	}

  	public void print(){
    	System.out.println(toString());
  	}
}