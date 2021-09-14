package oops;
class Cycle{
	int wheel, handle;
	String color;
	Cycle(String color){
		wheel = 4;
		handle =1;
		this.color = color;
	}
	Cycle(){
		wheel = 4;
		handle =1;
		
	}
}
public class OverLoad {
	
	public static void main(String args[])
	{
		Cycle cy = new Cycle("Red");
		Cycle cyc = new Cycle();
		System.out.println(cy.wheel+" "+cy.handle+" "+cy.color);
		System.out.println(cyc.wheel+" "+cyc.handle);
		
		
	}

}
