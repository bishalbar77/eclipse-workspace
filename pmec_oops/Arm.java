package pmec_oops;

import java.util.Scanner;

public class Arm {

	public static void main(String args[])
	{
	Scanner k=new Scanner(System.in);
	int a,b,i,ln,r,s,n;

	System.out.println("ENTER THE LOWER AND UPPER LIMIT");
	a=k.nextInt();
	b=k.nextInt();


	for(i=a;i<=b;i++)
	{
	  for(n=i,ln=0;n>0;n=n/10,ln++);

	  for(n=i,s=0;n>0;n=n/10)
	  {
	    r=n%10;
	    s=s+ (int)Math.pow(r,ln);
	  }
	   if(s==i)
	   {  
	      System.out.println(i);
	    }
	}
	}
}
