interface Animal{
public void animalSound(); // interface method (does not have a body)
public void sleep(); // interface method (does not have a body)
}

class Cow implements Animal {
public void animalSound() {
System.out.println("The Cow says: hamba");
}
public void sleep() {
System.out.println("sleeps on the floor");
}
}

class MyMainClass {
public static void main(String[] args) {
Cow myCow = new Cow();
myCow.animalSound();
myCow.sleep();
}
}