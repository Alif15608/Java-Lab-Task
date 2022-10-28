class Start
{ 
public static void main(String args[]){ 
Account[] arr;
arr=new Account[5];
arr[0]=new Account(101,"Alif",500);
arr[1]=new Account(102,"Rafi",500);
arr[2]=new Account(103,"Peyal",500);
arr[3]=new Account(104,"Bindu",500);
arr[4]=new Account(105,"Arafat",500);
for (int i = 0; i < arr.length; i++) 
        {
			
			arr[i].showDetails();
        }
		arr[1].deposit(500);
		arr[4].withdraw(1000);
for (int i = 0; i < arr.length; i++) 
        {
			arr[i].showDetails();
        }
		arr[2]=null;
for (int i = 0; i < arr.length; i++) 
        {
        	if(arr[i]!=null)
        	{
        		arr[i].showDetails();

        	}		
        }		
}
}