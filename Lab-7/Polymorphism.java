class Myclass
{
	void mul(int a,int b)
	{
		System.out.println("You have sent two perameters:"+a+" and "+b);
	}
	void mul(int a,int b,int c)
	{
	    System.out.println("You have sent three perameters:"+a+" , "+b+" and "+c);
	}
	public void show(char ch,int numb)
	{
		System.out.println("You have sent firstly letter: "+ch+" , and secondly number: "+numb);
	}
	public void show(int numb,char ch)
	{
		System.out.println("You have sent firslty number: "+numb+" , and secondly letter: "+ch);
	}
}
public class Polymorphism
{
	public static void main(String args[])
	{
	Myclass m=new Myclass();
	m.mul(6,10);
	m.mul(10,6,5);
	m.show('G',62);
	m.show(67,'B');
	}
}