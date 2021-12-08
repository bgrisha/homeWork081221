package ecomHomeWork081221;

public class Vehicles {
	int wheels;
	String model;
	int maxSpeed;

	public Vehicles(int wheels, String model, int maxSpeed) {

		this.wheels = wheels;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

	public String toString() {
		return "wheel " + wheels + " ,model " + this.model + " ,Maxspeed is= " + maxSpeed;
	}

	public void toRefuel() {
		System.out.println(" the  fuel of this car is fuel ");
	}
}
