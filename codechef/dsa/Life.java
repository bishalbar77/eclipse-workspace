package codechef.dsa;

import java.util.*;

import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Life
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int temp;
		while(sc.hasNextInt())  
        {  
			temp = sc.nextInt();
			if(temp!=42)
				System.out.println(temp);
			else
				break;
        }
	}
}