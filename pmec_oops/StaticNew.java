package pmec_oops;

class StaticNew 
{
	static
	{
		System.out.println("Before exit 0");
		System.exit(0);
		System.out.println("After exit 0");
	}
	public static void main(String args[]) 
	{
		System.out.println("Inside main");
	}
}