package pmec_oops;

import java.util.Scanner;

public class Prime {

	public static void main (String[] args)
	   {		
	       int i =0, count=0, num =0;
	       Scanner sc = new Scanner(System.in);
      	 	System.out.println("Enter lower bound of looping");
	       int lowerBound = sc.nextInt();
      	 	System.out.println("Enter upper bound of looping");
	       int upperBound = sc.nextInt();
	       for (i = lowerBound; i <= upperBound; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
	          {
	             if(i%num==0)
	             {
	            	 counter = counter + 1;
	             }
	          }
	          if (counter ==2)
	          {
	        	 count++;
	        	 System.out.println(i+" ");
	          }		
	       }	
	       System.out.println("Total prime numbers from "+lowerBound+" to "+upperBound+" are "+count);
	   }

}
