public class Inheritance {

	public static void main(String[] args) {

		Person p1 = new Person(); 
		p1.name = "ABC";
		p1.height = "6ft";
		p1.weight = "70kg";

		System.out.println("Person: ");
		System.out.println("name: " + p1.name + " height: " + p1.height + " weight: " + p1.weight);
			
		Teacher t1 = new Teacher();
		t1.name = "Def";
		t1.height = "5.10ft";
		t1.weight = "75kg";
		t1.id = "2020-2020-1";
		t1.designation = "Teacher";

		System.out.println("Teacher: ");
		System.out.println("name: " + t1.name + " height: " + t1.height + " weight: " + t1.weight + " id: " + t1.id + " designation: " + t1.designation);

		Student s1 = new Student();
		s1.name = "Ghi";
		s1.height = "5.5ft";
		s1.weight = "75kg";
		s1.id = 1;
		s1.cgpa = 4.00;

		System.out.println("Student: ");
		System.out.println("name: " + s1.name + " height: " + s1.height + " weight: " + s1.weight + " id: " + s1.id + " cgpa: " + s1.cgpa);
	}
}

class Person {
	String name;
	String height;
	String weight;
}

class Teacher extends Person {
	String id;
	String designation;
}

class Student extends Person {
	int id;
	double cgpa;
}