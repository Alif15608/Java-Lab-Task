public class Burger extends FoodItem
{
      int numberOfPatties;
	  
      public Burger()
	  {
	  }
      public Burger(int numberOfPatties, double price, String name)
	  {
		  super(price,name);
		  this.numberOfPatties=numberOfPatties;
	  }
      void setNumberOfPatties(int numberOfPatties)
	  {
		  this.numberOfPatties=numberOfPatties;
	  }
      int getNumberOfPatties()
	  {
		  return numberOfPatties;
	  }
	  public void showNumberofPatties()
	  {
		  System.out.println("Number of patties: "+numberOfPatties);
	  }
}