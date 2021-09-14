package oops.abstraction;

public class Repair {
	public static void repairCar(Car car)
	{
		System.out.println("Car is repaired");
	}
	
	public static void main(String[] args)
	{
		WagonR R = new WagonR();
		Audi A = new Audi();
		repairCar(R);
		repairCar(A);
	}
}
