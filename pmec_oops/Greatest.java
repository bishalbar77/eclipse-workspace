package pmec_oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Greatest {

	public static void main(String args[]) throws NumberFormatException, IOException
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		int s=0;
        s = sc.nextInt();
		switch(s)
		{
			case 1:
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				if(a>b && a>c)
					System.out.println("Through scanner class, greatest number is a = "+a);
				else if(b>c)
					System.out.println("Through scanner class, greatest number b= "+b);
				else
					System.out.println("Through scanner class, greatest number is c= "+c);
				break;
				
			case 2:
				a = Integer.parseInt(args[0]);
				b = Integer.parseInt(args[0]);
				c = Integer.parseInt(args[0]);
				if(a>b && a>c)
					System.out.println("Through command line, greatest number is a = "+a);
				else if(b>c)
					System.out.println("Through command line, greatest number is b= "+b);
				else
					System.out.println("Through command line, greatest number is c= "+c);
				break;
				
			case 3:
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				a = Integer.parseInt(br.readLine());
				b = Integer.parseInt(br.readLine());
				c = Integer.parseInt(br.readLine());
				if(a>b && a>c)
					System.out.println("Through BufferedReader, greatest number is a = "+a);
				else if(b>c)
					System.out.println("Through BufferedReader, greatest number is b= "+b);
				else
					System.out.println("Through BufferedReader, greatest number is c= "+c);
				break;
				
			default:
				System.out.println("Sorry no possible calculation found!");
		}	
	}
}
