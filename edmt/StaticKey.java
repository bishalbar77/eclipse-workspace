package edmt;


import oops.A;


public class StaticKey {	// its an main class

	static class Person {            // its an inner type
		int age;
		String name;
		final static String breed = "Homo Sapiens";         //static cannot be declared in a inner type function hence we use final
	}

	public static void main(String[] args) {
		
		Person ob = new Person();
		ob.name = "Hello world";
		System.out.println(Math.PI);
		System.out.println(Math.abs(-456));
		System.out.println(ob.name);
		A p = new A();
	}

}
