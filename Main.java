package ecomHomeWork081221;

public class Main {

	public static void main(String[] args) {
		Vehicles c=new ElecticCar(4, "Lantis", 200);
		System.out.println(c);
		c.toRefuel();
		
		
		Vehicles c1=new Car(4, "Subaru", 150);
		System.out.println(c1);
		c1.toRefuel();
		
		Vehicles c2=new Bike(2, "sport", 30);
		System.out.println(c2);
		c2.toRefuel();

	}

}
