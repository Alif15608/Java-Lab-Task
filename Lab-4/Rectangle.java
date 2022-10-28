class Rectangle
{
private double length;
private double width;
private double area;
public Rectangle( ){}
public Rectangle(double l, double w)
{
length=l;
width=w;
}
void setLength(double a)
{
length=a;
}
void setWidth(double b)
{
width=b;
}
double getLength( )
{
return length;
}
double getWidth( )
{
return width;
}
double getArea( )
{
area=length*width;
return area;
}
public void show()
{
	System.out.println("Area of Rectangle: "+area);
}
}
