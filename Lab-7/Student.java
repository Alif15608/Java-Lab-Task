class College
{
	public void situation()
	{
		System.out.println("College is closed");
	}
}
class University extends College
{
	public void situation()
	{
		System.out.println("University is closed too");
	}
}
public class Student
{
	public static void main(String args[])
	{
	College a=new College();
	College b=new University();
	a.situation();
	b.situation();
	}
}