package oops.inheritance;
// child class of person
public class Teacher extends Person {
	
	public void teach()
	{
		System.out.println("Teacher is teaching");
	}
	public void eat()          //method overiding
	{	
		super.eat();
		System.out.println("Teacher "+name+" is eating");   
	}
	public static void laugh()
	{
		System.out.println("Laughing  Teacher");
	}
}
