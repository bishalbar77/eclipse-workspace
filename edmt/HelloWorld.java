package edmt;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args)
	
	{
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		a = sc.nextDouble();
		
		System.out.println("Enter b");
		b = sc.nextDouble();
		
		sc.close();
		c = Math.pow(a,b) % 5;
		System.out.println(c);
		
	}

}
