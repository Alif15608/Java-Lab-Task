import java.util.Scanner;

class Main{ 
  
    public static void main(String args[]) 
    { 
       
	   
		// Declaring an array of student 
        Student[] arr; 
  
        Scanner myObj = new Scanner(System.in);

		// Allocating memory for 2 objects of type student 
        arr = new Student[2]; 
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("Enter the name of Student#"+i);
			String name = myObj.nextLine();
			arr[i]= new Student(i, name);
        }
		
        
        // Initializing the first element
        arr[0] = new Student(0, "Donald Trump"); 
  
        //Initializing the second element 
         
        arr[1] = new Student(1, "Joe Biden"); 
  
        // Displaying the student data 
        System.out.println("Student data in student arr 0: "); 
        arr[0].display(); 
  
        System.out.println("Student data in student arr 1: "); 
        arr[1].display(); 
		
		System.out.println("Printing Student data using loop: "); 
		
		// Displaying the student data using loop
		for (int i = 0; i < arr.length; i++) {
			arr[i].display();
        }
		
    } 
}