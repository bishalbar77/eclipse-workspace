package pmec_oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buff {

	public static void main(String args[]) throws NumberFormatException, IOException
	{
		int a, b, c;
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
	}
}
