public  class BasicCalculator
{
	public double value1;
	public double value2;
public  BasicCalculator(double v1, double v2)
	{
		
		this.value1=v1;
		this.value2=v2;
	}
	public void setValue1(double v1)
	{
		this.value1=v1;
		
	}
	double getValue1()
	{
		return value1;
	}
	void setValue2(double v2)
	{
		this.value2=v2;
	}
	double getValue2()
	{
		return value2;
	}
}