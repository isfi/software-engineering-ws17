public abstract class Decorator implements UnitConverterInterface {
	protected UnitConverterInterface decoratedConverter;

	public Decorator(UnitConverterInterface decoratedConverter) {
		this.decoratedConverter = decoratedConverter;
	}

	//@Override
	public double convert(double inValue) {
		return decoratedConverter.convert(inValue);
	};

	@Override
	public String toString() {
		return decoratedConverter.toString();
	};

	@Override
	public void print() {
		decoratedConverter.print();
	}

}