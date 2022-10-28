class BicycleDemo {
    public static void main(String[] args) {

        Bicycle bike1 = new Bicycle(50,10,3);
        Bicycle bike2 = new Bicycle(10,20,2);
		int value;
		
		System.out.println(" Bike1 properties: ");
		bike1.speedUp(10);
		bike1.applyBrakes(5);
        bike1.printStates();
		bike1.setCadence(30);
		value = bike1.getGear();
		bike1.printStates();
		System.out.println("The Value of Gear from Demo class: "+ value);
		
		
		
		System.out.println(" Bike2 properties: ");
		bike2.speedUp(5);
		bike2.applyBrakes(8);
        bike2.printStates();

    }
}
