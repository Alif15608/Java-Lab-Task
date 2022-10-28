abstract class Bank
{
 Bank()
 {
 System.out.println("Constractor of Abstract class is called");
 }
 void regularMethod()
 {
 System.out.println("Regular method is called");
 }
 abstract int getRateOfInterest();
}