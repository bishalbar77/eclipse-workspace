package pmec_oops;
import java.util.Scanner;

import equation.*;

public class InheritOtherPackage implements Interface1, Interface2 {

	public static void main(String args[])
	{
		Interface1 obj1 = new InheritOtherPackage();
		PackageClassOne obj3 = new PackageClassOne();
		PackageClassTwo obj4 = new PackageClassTwo();
		PackageClassThree obj5 = new PackageClassThree();
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		obj4.Print();
		obj5.Print();
		obj3.Print();
	}

	public void Print1() {
		System.out.println("Hello! This is interface one.");
		
	}
	public void Print2() {
		// TODO Auto-generated method stub
		
	}
}
