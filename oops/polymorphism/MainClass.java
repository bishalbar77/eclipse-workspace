package oops.polymorphism;
//Note:-   variable can never be overridden 
//         however u can hide them
//For e.g:-Line  16 & 17
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Dog d = new Dog();
		
		Pet p =d;                 // pet becomes dog
		Animal a =d;              //upcasting
//		
		d.walk();
		p.walk();					//runtime polymorphism
		System.out.println(d.name);
		System.out.println(p.name);
		
		/*----------------------------------*/
		greeting();                 //compile time polymorphism as well as method overloading
		greeting("Bishal");        
	}
	public static void greeting()
	{
		System.out.println("Hi, there");
	}
	public static void greeting(String name)
	{
		System.out.println(name+", How r u?");
	}
}
