class ConverterCommand implements Command {
	private UnitConverterInterface UnitConverter;
	private double inValue;

	public ConverterCommand(UnitConverterInterface UnitConverter, double inValue) {
		this.UnitConverter = UnitConverter;
		this.inValue = inValue;
	}

	@Override
	public void execute() {
		System.out
				.println(UnitConverter.toString() + ", converted " + inValue + " to " + UnitConverter.convert(inValue));
	}

}