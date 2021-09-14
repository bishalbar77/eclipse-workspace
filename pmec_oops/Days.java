package pmec_oops;


public class Days {
	  public static void main(String args[])
	  {
	float p,r,t,si;
	System.out.println("Enter the principle:");
	p=Float.parseFloat(args[0]);
	System.out.println("Enter the Rate: ");
	r=Float.parseFloat(args[1]);
	System.out.println("Enter the Time period: ");
	t=Float.parseFloat(args[2]);
	si=(p*r*t)/100;
	System.out.println("Simple interest is: "+si);
	  }
	}
