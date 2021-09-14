package oops.inheritance;
//Parent class for teacher
public class Person {
	
	protected String name;   //only visible to children no one else
	public void walk()
	{
		System.out.println("Person "+name+" is walhing");
		
	}
	public void eat()
	{
		System.out.println("Person "+name+" is eating");
	}
	public static void laugh()
	{
		System.out.println("Laughing Person");
	}
}
