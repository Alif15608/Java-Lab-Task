public class ScientificCalculator extends BasicCalculator implements ScientificCalculation
{
	public double result;
	
	public ScientificCalculator(double v1,double v2)
	{ 
		super(v1,v2);

	}
	public void add(double x, double y)
	{
		result=x+y;
		System.out.println("Show the Result of Add:"+result);
	}
	public void subtract(double x, double y)
	{
		result=x-y;
		System.out.println("Show the Result of Subtract:"+result);
		
	}
	public void multiply(double x, double y)
	{
		result=x*y;
		System.out.println("Show the Result of Multiply:"+result);
	}
	public  void divide(double x, double y)
	{
		result=x/y;
		System.out.println("Show the Result of Divide:"+result);
		
	}
	public  void Thepow(double x)
	{
		result=x*x;
		System.out.println("Show the Result of Power:"+result);
	}
}