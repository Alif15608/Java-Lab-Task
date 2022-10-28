class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;
	
	public Bicycle(int cad, int spd, int gr) {
        this.cadence = cad;
        this.speed = spd;
        this.gear = gr;
    }

    void setCadence(int newValue) {
         cadence = newValue;
    }
	
	int getCadence()
	{
		return cadence;
	}

    void setGear(int newValue) {
         gear = newValue;
    }
	int getGear(){
         return gear;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }
}










