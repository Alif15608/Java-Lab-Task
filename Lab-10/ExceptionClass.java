public class ExceptionClass
{
	public static void main (String[] agrs)
	{
		try{
			int d=0;
			int n=20;
			int fraction=n/d;
			int g[]={1};
			g[20]=100;
			}
		catch(ArithmeticException e)
		{
			System.out.println("In the catch block due to Exception="+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("In the catch block due to Exception="+e);
		}
		catch(Exception e)
		{
			System.out.println("In the catch block due to Exception="+e);
		}
		finally{
			System.out.println("Inside the finally block");
		}
		System.out.println("End of Main");
	}
}