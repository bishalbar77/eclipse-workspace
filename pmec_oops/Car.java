package pmec_oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {

	public static void main(String args[]) throws NumberFormatException, IOException
	{
		String color, name, number;
		double mileage, price;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Car company name is ");
		name = br.readLine();
		System.out.println("Car colour is ");
		color = br.readLine();
		System.out.println("Car mileage is ");
		mileage = Double.parseDouble(br.readLine());
		System.out.println("Car price is ");
		price = Double.parseDouble(br.readLine());
		System.out.println("Car number is ");
		number = br.readLine();
		System.out.println("Car company name is "+name);
		System.out.println("Car colour is "+color);
		System.out.println("Car mileage is "+mileage);
		System.out.println("Car price is "+price);
		System.out.println("Car number is "+number);
	}
}

