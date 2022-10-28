class Circle{
	
	private double radius;
	private double area;
	 
    void setRadius(double r)
	{
		radius=r;
	}
    double getRadius()
	{
		return radius;
	}
    public void getArea()
	{
		area= 3.1416*radius*radius;
		System.out.println("Radius of Circle: "+area);
	}
	
}