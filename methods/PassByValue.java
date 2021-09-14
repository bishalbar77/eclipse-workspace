package methods;

public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c =14, d =46;
		swap(c,d);
		System.out.println("Actual value = "+c+" "+d);
		
	}
	static void swap(int c, int d)
	{
		int temp = c;
		c =d;
		d= temp;
		System.out.println("In function value = "+c+" "+d);
	}
	
}
