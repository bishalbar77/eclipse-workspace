package oops.abstraction;

public class Audi extends Car{
	public void acc()
	{
		System.out.println("Audi is accelerating");
	}

	@Override            //Its an annotation not compulsory...only helps compiler to understand
	public void breaking() {
		// TODO Auto-generated method stub
		System.out.println("Audi is Breaking");
	}
	
}
