class Start8
{
	public static void main(String args[])
	{
		SavingsAccount ob1 = new SavingsAccount("sa111",1000.0,5);

		FixedAccount ob4 = new FixedAccount("fa111",1500.0,4);
		
		Customer ob6 = new Customer(20433721,"Alif",5);
		
		ob6.addAccount(ob1);
		
		System.out.println("Customer's Name is: "+ob6.getName());
		System.out.println("Customer's Nid number is: "+ob6.getNid());
		
		ob6.showAllAccount();
		ob1.showSavingsAccount();

		ob6.addAccount(ob4);
		
		System.out.println("Customer's Name is: "+ob6.getName());
		System.out.println("Customer's Nid number is: "+ob6.getNid());
		
		ob6.showAllAccount();
		ob4.showFixedAccount();
	}
}
