class Customer
{
	private int nid;
	private String name;
	
	Account accounts[];
	
	Customer()
	{
		
	}
	
	Customer(int nid,String name,int size)
	{
		this.nid = nid;
		this.name = name;
		accounts  = new Account [size];
	}

	public void setNid(int nid)
	{
		this.nid = nid;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getNid()
	{
		return nid;
	}
	
	public String getName()
	{
		return name;
	}
		
	public void addAccount(Account a)
	{
		accounts[0] = a;
		accounts[1] = a;
	}
	
	public void removeAccount(Account a)
	{					
	}

	public void showAllAccount()
	{
		for(int i=0;i<accounts.length;i=i+accounts.length)
		{
			if(accounts[i]!= null)
			{
				System.out.println("Account Number : "+accounts[i].getAccountNo());
				
				System.out.println("Account Balance : "+accounts[i].getBalance());
			}
		}
	}
}
			

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
