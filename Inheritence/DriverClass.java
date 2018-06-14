package Inheritence;

import java.util.ArrayList;

public class DriverClass {

int arr;

void change(int item) {
//	this.arr = item * item;
}
	
	public void drive() {
		System.out.println("Priting with 0");
	}
	
	public void drive(int n) {
		System.out.println("Priting with" +n);
	}
	
	public void drive(int n, int j ) {
		
		for(int i = 0; i < n; i++) {
			
			if(i == j) {
				System.out.println("Equal");
			}
		}
	}
	
	
	public static void main(String[] args) {
		
/*	Car c = new Car();
		c.getSpeed();
		c.driving();
		System.out.println(c.speed);*/
		/*System.out.println(Vehicle.speed);
		Vehicle v = new Car();
		v.driving();*/
	/*	v.getSpeed();*/
	/*	Vehicle v = new Vehicle();
		Vehicle.counter++;
		Vehicle v2 = new Vehicle();
		Vehicle.counter++;
		System.out.println(Vehicle.counter);*/
		/*DriverClass  d = new DriverClass();
		d.drive(10,4);
		
		
		d.drive(5);
		d.drive();
		*/
		/*System.out.println();
		
	
		Car c =new Car();
		Car c1 = new Car();
		Car c2 = new Car();
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(c);
		cars.add(c1);
		cars.add(c2);
		for(int i = 0; i < 3; i++ ) {
			
		}
		for(Car item : cars) {
			System.out.println(item.seats);
		}
		c.getSpeed();
		c.driving();*/
		DriverClass c = new DriverClass();
		c.arr = 4;
		c.change(4);
		System.out.println(c.arr);
	}

}
