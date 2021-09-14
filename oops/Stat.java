package oops;

public class Stat {
	static {
		System.out.println("Block 1 executed");
	}
	static {
		System.out.println("Block 2 executed");
	}
	public static void main(String args[])
	{
		System.out.println("Main function running");
	}
	static {
		System.out.println("Block 3 executed");
	}

}
