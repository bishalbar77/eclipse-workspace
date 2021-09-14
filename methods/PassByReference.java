package methods;

public class PassByReference {

	public static void main(String[] args) {
		
		Dog c = new Dog();
		Dog d = new Dog();
		c.legs =4;
		d.legs =5;
		
		swap(c,d);
		System.out.println("Actual value = "+c.legs+" "+d.legs);
		/*--------------------------
		//By value
		int c, d;
		c =4;
		d=5;
		swap(c,d);
		System.out.println("Actual value = "+c+" "+d);
		*/
	}
	static void swap(int c, int d)
	{
		int temp = c;
		c =d;
		d= temp;
		System.out.println("In function value = "+c+" "+d);
	}
	static void swap(Dog c, Dog d)
	{
		Dog temp = c;
		c= d;
		d = temp;
		System.out.println("In function value = "+c.legs+" "+d.legs);
	}
	
}
class Dog
{
	int legs;
}
