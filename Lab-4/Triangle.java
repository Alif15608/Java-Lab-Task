 class Triangle{
	
     private double height;
     private double base;
	 private double area;
	  
	  public Triangle()
	  {
	  }
      public Triangle(double h,double b)
	  {
		  height=h;
		  base=b;
	  }
      void setHeight(double c)
	  {
		  height=c;
	  }
      void setBase(double d)
	  {
		  base=d;
	  }
      double getHeight()
	  {
		  return height;
	  }
       double getBase()
	  {
		  return base;
	  }
      double getArea()
	  {
		  area=0.5*height*base;
		  return area;
		  }
	public void show()
	{
		  System.out.println("Area of Triangle: "+area);
	  }

}