package oops.abstraction;
//Note :- We cannot create objects of abstract class. We only create objects of its children and children must override methods of an abstract methods. 
        //We can do this using inheritance bt in that case we hav eto create an object of class Car. 
public abstract class Car {
	
	public abstract void acc();                        //These are abstract methods
	
	public abstract void breaking();
	public void honk() {                         // regualr or concrete methods
		System.out.println("YO");
	}
}
