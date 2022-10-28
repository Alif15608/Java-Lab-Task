public class Start
{
	public static void main(String[] args)
	{
		Pizza p1=new Pizza("10",750.00,"Naga Cheese Pizza");
		p1.showDetails();
		p1.showSize();
		Pizza p2=new Pizza();
		p2.setPrice(600.00);
		p2.setName("American Pizza");
		p2.getPrice();
		p2.getName();
		p2.setSize("8");
		p2.getSize();
		p2.showDetails();
		p2.showSize();
		
		Burger b1=new Burger(5,160.00,"Chicken Burger");
		b1.showDetails();
		b1.showNumberofPatties();
		Burger b2=new Burger();
		b2.setPrice(200.00);
		b2.setName("Beef Burger");
		b2.getPrice();
		b2.getName();
		b2.setNumberOfPatties(10);
		b2.getNumberOfPatties();
		b2.showDetails();
		b2.showNumberofPatties();
		
	}
}