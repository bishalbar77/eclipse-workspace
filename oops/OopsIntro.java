package oops;

class Cat
{
	boolean hasFur;
	String color, breed;
	int legs, eyes;
	
	public void walk() {
		System.out.println("Cat is wallking");
		
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void description() {
		System.out.println("my cat has "+legs+" legs and "+eyes+" eyes");
	}
}

public class OopsIntro 
{

	public static void main(String[] args) 
	{
		Cat cat1 = new Cat();
		cat1.walk();
		Cat cat2 = new Cat();
		cat2.eat();
		cat1.eyes=2;
		cat1.legs=4;
		cat1.description();
	}

}
