package ecomHomeWork081221;

public class ElecticCar extends Car {

	public ElecticCar(int wheels, String model, int maxSpeed) {
		super(wheels, model, maxSpeed);
		
	} 
	public void toRefuel() {
		System.out.println(" the  fuel of this car is electricity ");
	}
}
