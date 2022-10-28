class Start{
public static void main(String[] args)
{
		Rectangle r1 = new Rectangle(10, 20);
		r1.getArea();
		r1.show();
		r1.setLength(6);
		r1.setWidth(5);
		r1.getArea();
		r1.show();
		
		Triangle t1 = new Triangle(7, 8);
		t1.getArea();
		t1.show();
		t1.setHeight(5);
		t1.setBase(6);
		t1.getArea();
		t1.show();
		
		Circle c1 = new Circle();
		c1.setRadius(4);
		c1.getArea();
		
		Square s1= new Square();
		s1.setSide(9);
		s1.getArea();
 }
}