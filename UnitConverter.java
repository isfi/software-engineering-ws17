public abstract class UnitConverter implements UnitConverterInterface
{
  public UnitConverter() { }
  @Override
  public abstract double convert(double inValue);
  public abstract String toString();
  public abstract void print();
};
