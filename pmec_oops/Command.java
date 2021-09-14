package pmec_oops;

public class Command {

	public static void main(String args[])
	{
		int a, b, c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		if(a>b && a>c)
			System.out.println("Through command line, greatest number is a = "+a);
		else if(b>c)
			System.out.println("Through command line, greatest number is b= "+b);
		else
			System.out.println("Through command line, greatest number is c= "+c);
	}
}
