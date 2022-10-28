import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Calculator
{
	double x;
	private double y;
	public double result;

	public Calculator() {}

	public Calculator(double a,double b)
	{
		this.x=a;
		this.y=b;
		try
        {
            FileInputStream in = new FileInputStream("input.txt");
            System.out.println("This is not printed");
        } 
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
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
		
		try{
			result=x/y;
		}
		catch(ArithmeticException e)
		{
			System.out.println("In the catch block due to Exception="+e);
		}
		System.out.println("Show the Result of Divide:"+result);

	 }
}