class TestBank
{
 public static void main(String args[])
 {
 Bank c;
 DBBL b=new DBBL();
 int var = b.getRateOfInterest();
 System.out.println("Rate Of Interest is: "+var+"%"); 
 b.regularMethod();
 b.regularMethodOfDBBL();
 c=new Prime();
 System.out.println("Rate Of Interest is: "+c.getRateOfInterest()+"%"); 
 }
}