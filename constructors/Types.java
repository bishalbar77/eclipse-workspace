package constructors;

public class Types {
	
	int a;
	static int b;
	// Copy constructor
	Types(Types obj) {
		a = obj.a;
		b = obj.b;
		System.out.println(a);
		System.out.println(b);
	}

	// Parameterized constructor
	Types(int i, double j) {
		a = i;
		b = (int)j;
		System.out.println(a);
		System.out.println(b);
	}	
	
	Types(double j, int i) {
		a = i;
		b = (int)j;
		System.out.println(a);
		System.out.println(b);
	}
	



	// default constructor
	public Types() {
		// TODO Auto-generated constructor stub
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Types para = new Types(25.0,24);
		Types def = new Types(para);
		Types copy = new Types();
		System.out.println("para = " +para);
		System.out.println("Copy = " +copy);
		System.out.println("def = " +def);
	}

}
class Cup {
	int a;
	static int b;
	Cup(int y, int p) {
		a = y;
		b = p;
	}
}
