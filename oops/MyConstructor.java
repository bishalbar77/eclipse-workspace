package oops;

class Vehicles{
	int wheels, head;
//	Vehicles(int NoW)    // Parameterised constrcutor
//	{
//		wheels = NoW;
//		head= 2;
//	}
	Vehicles(int wheels)
	{
		// Parameterized constructor
		this.wheels = wheels;
		head =4; 
	}
}

public class MyConstructor {
	MyConstructor()
	{
		System.out.println("Object is now created");
	}
	public static void main(String[] args) 
	{
		MyConstructor ob = new MyConstructor();
		Vehicles car = new Vehicles(4);
		Vehicles car2 = new Vehicles(2);
		System.out.println(car.wheels+"     "+car.head);
		System.out.println(car2.wheels+1+" Wheels");
		
	}

}
