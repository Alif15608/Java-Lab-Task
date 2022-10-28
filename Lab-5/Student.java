class Student { 
  
    public int id; 
    public String name; 
  
    Student(int id, String name) 
    { 
        this.id = id; 
        this.name = name; 
    } 
  
    public void display() 
    { 
        System.out.println("Student id is: " + id + " "
                           + "and Student name is: "
                           + name); 
        System.out.println(); 
    } 
}