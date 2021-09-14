package methods;

public class Intro {

	public static void main(String[] args) {
		double fName =12.45, sName =45.2;
		double result =maxOf(fName,sName);
		System.out.println(result);
		sayHi();
	}
	static int maxOf(int a, int b)
	{
		return a > b ? a:b;
		
	}
	static double maxOf(double a, double b)
	{
		return a > b ? a:b;
		
	}
	static void sayHi()
	{
		System.out.println("Hello bro how r u");
		System.out.println("Good mrg");
	}
}
