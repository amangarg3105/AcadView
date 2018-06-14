package Inheritence;

public class Car extends Vehicle {
	int speed = 20;
	Car() {
		System.out.println("Car's Constructor");
	}
	
	void getSpeed() {
		
	System.out.println("Car's speed" + speed + " " + super.speed);	
	}
	

	 void driving() {
		super.driving();
		System.out.println("Car is Driving");
	}
	

}
