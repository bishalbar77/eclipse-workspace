package pmec_oops;

public abstract class Parent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassOne Obj1 = new ClassOne();
		ClassTwo Obj2 = new ClassTwo();
		Obj1.message();
		Obj2.message();
	}
}

class ClassOne {
	public void message() {
		System.out.println("First class!");
	}
	
}

class ClassTwo {
	public void message() {
		System.out.println("Second class!");
	}
	
}