public class Student
{
private int id;
private String name;
private Double cgpa;
    public Student() 
	{
       
    }

    public Student(int i, String n, double a) 
	{
        id = i;
        name = n;
        cgpa = a;
    }

    void setId(int x) 
	{
        id = x;
    }

    void setName(String m) 
	{
        name = m;
    }

    void setCGP(double p) 
	{
        cgpa = p;
    }

    int getId() 
	{
        return id;
    }

    String getName() 
	{
        return name;
    }

    Double getCGPA() 
	{
        return cgpa;
    }

    void DisplayInfo() 
	{
        System.out.println("Student Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("CGPA: " + getCGPA());
    }

    public static void main(String[] args) {
       

         Student s1=new Student(20433721,"MD. Ashraful Hossain Alif",3.92);
         s1.DisplayInfo();
    }
}

