public class MountainBike extends Bicycle {
        
    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public void ShowHeight() {
       System.out.println("Mountain Bike Seat Height: "+ seatHeight);
    }
	
	public static void main(String[] args) {
       MountainBike myBike = new MountainBike(70,50,10,3);
	   myBike.printStates();
	   myBike.speedUp(10);
	   myBike.applyBrakes(5);
	   myBike.printStates();
       myBike.ShowHeight();
	   
    }
}