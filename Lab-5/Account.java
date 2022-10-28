class Account
{
	private int accountNumber;
    private String accountHolderName;
    private double balance;
	
	public Account()
{
}
public Account(int accountNumber, String accountHolderName, double balance)
{
this.accountNumber=accountNumber;
this.accountHolderName=accountHolderName;
this.balance=balance;
}
void setAccountNumber(int accountNumber)
{
this.accountNumber=accountNumber;
}
void setAccountHolderName(String accountHolderName)
{
this.accountHolderName=accountHolderName;
}
void setBalance(double b)
{
this.balance=balance;
}
int getAccountNumber()
{
return accountNumber;
}
String getAccountHolderName()
{
return accountHolderName;
}
double getBalance()
{
return balance;
}
void showDetails()
{
System.out.println("Account Number:"+getAccountNumber());
System.out.println("Account Holder Name:"+getAccountHolderName());
System.out.println("Balance:"+getBalance());
}
void deposit(double amount)
{
	this.balance=balance+amount;
}
void withdraw(double amount)
{
	if(amount<=balance)
	{
	this.balance=balance-amount;
	}
	else{
		System.out.println("You Have Insufficient Balance");
	}
}		
}