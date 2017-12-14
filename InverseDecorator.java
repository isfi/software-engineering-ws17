public class InverseDecorator extends Decorator {

	public InverseDecorator(UnitConverterInterface decoratedConverter) {
		super(decoratedConverter);

		if (decoratedConverter instanceof TemperatureConverter) {

			throw new IllegalArgumentException("inverting temperature convertion not possible!");
		}

	}

	@Override
	public double convert(double inValue) {
		// make it inverse
		double conversion = decoratedConverter.convert(inValue) / inValue;

		return inValue / conversion;
	};

	@Override
	public String toString() {
		return decoratedConverter.toString();
	};

	@Override
	public void print() {
		decoratedConverter.print();
	};
}