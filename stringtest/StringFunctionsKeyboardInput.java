package stringtest;

import java.util.Scanner;

public class StringFunctionsKeyboardInput {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name : ");
		String name; 
		name = sc.nextLine();
		int n= 50;
		String s = Integer.toString(n);
		System.out.println(s);// Initialization by literals  recommended              Only Pool
		String AnoName = new String("Bishal");    //Initialization by new object                          Heap+pool
		String bar ="Bishal";
		String name2 ="";
		name = name + " Kumar";    
		System.out.println("Enter (,) separated brands : "); 
		String Bike;
		Bike = sc.nextLine();
		String arrBike[] = Bike.split(",");
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(4));
		System.out.println(name.length());
		System.out.println(name.substring(2,3));
		System.out.println(name.contains("shal"));
		System.out.println(name.concat(" Rana"));
		System.out.println(name.replace("Bi","Va"));
		System.out.println(name.toLowerCase());      // indexof is viseversa 
		for(String  i:arrBike)
		System.out.println(i);
	}
}
