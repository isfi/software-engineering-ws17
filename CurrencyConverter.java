public abstract class CurrencyConverter extends UnitConverter {

	public String toString() {
		return null;
	}

	public boolean checkInput(double input) {
		if (new Double(input).longValue() <= 0 && input != 0) {
			System.err.println("Input is negative");
			return false;
		}

		return true;
	}
};