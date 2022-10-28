public class BasicCalculator
	{
		public double value1;
		public double value2;
		public double add;
		public double subtract;
		public double multiply;
		public double divide;

		public BasicCalculator( ){}

		public BasicCalculator(double v1, double v2)
		{
		this.value1=v1;
		this.value2=v2;
		}
		public void setValue1(double v1)
		{
			this.value1=v1;
		}
		public void setValue2(double v2)
		{
			this.value2=v2;
		}

		public double getValue1( )
		{
			return value1;
		}
		public double getValue2( )
		{
			return value2;
		}
		public double showAdd( )
		{
			add=value1+value2;
			System.out.println("Show the Result of Add:"+add);
		}
		public double showSubtract( )
		{
			subtract=value2-value1;
			System.out.println("Show the Result of Subtract:"+subtract);
		}
		public double showMultiply( )
		{
			multiply=value1*value2;
			System.out.println("Show the Result of Multiply:"+multiply);
		}
		public double showDivide( )
		{
			divide=value2/value1;
			System.out.println("Show the Result of Divide:"+divide);
		}
	}