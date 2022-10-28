public class Account
{
private int accountNumber;
private String accountHolderName;
private double balance;
public Account()
{
}
public Account(int i,String n,double a)
{
accountNumber=i;
accountHolderName=n;
balance=a;
}
void setAccountNumber(int an)
{
accountNumber=an;
}
void setAccountHolderName(String ahn)
{
accountHolderName=ahn;
}
void setBalance(double b)
{
balance=b;
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
public static void main(String args[])
{
Account a1= new Account(20433721,"MD. Ashraful Hossain Alif",20000);
a1.showDetails();
}
}