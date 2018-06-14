package Inheritence;


public class Truck extends Car {
int speed =30;
	 void getSpeed() {
		 System.out.println("Truck's Speed" + speed + super.speed  + super.speed);
	 }
	
	 @Override
	 void driving() {
		 super.driving();
		 System.out.println("Truck is driving");
	 }
 }
