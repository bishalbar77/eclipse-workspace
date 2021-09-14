package pmec_oops;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter lower bound:");
		int lower = sc.nextInt();  
    	System.out.println("Enter upper bound:");
		int upper = sc.nextInt();
		for(int i=lower;i<=upper;i++)
		{
			int n = i;
			int count=0,a=0,temp,temp2=0,c = 0;
			temp=n;
			temp2=n;
		    while (temp2 != 0) {
		    	temp2 /= 10;
		        ++count;
		      }
		    while(n>0)  
		    {  
			    a=n%10;  
			    n=n/10;  
			    c=c+ (int)Math.pow(a, count);  
		    }  
		    if(temp==c)  
		    	System.out.println(temp+" armstrong number");   
		    else  
		        System.out.println(temp+" not armstrong number");   
		}

		
	}

}
