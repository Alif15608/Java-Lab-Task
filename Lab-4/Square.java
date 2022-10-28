class Square{
	
	private double side;
	private double area;
	 
     void setSide(double s)
	{
		side=s;
	}
     double getSide()
	{
		return side;
	}
    public void getArea()
	{
		area= side*side;
		System.out.println("Area of Square: "+area);
	}
	
}