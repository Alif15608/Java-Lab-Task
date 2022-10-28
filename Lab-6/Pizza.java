public class Pizza extends FoodItem
{
	String size;
	
    public Pizza()
	{
	}
    public Pizza(String size, double price, String name)
	{
		super(price,name);
		this.size=size;
	}
    public void setSize(String size)
	{
		this.size=size;
	}
    public String getSize()
	{
		return size;
	}
	public void showSize()
	{
		System.out.println("Item size: "+size+ " inch");
	}

}