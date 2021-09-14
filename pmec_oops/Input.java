package pmec_oops;

import java.io.*;

public class Input {

	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your roll number");
		int k = Integer.parseInt(br.readLine());
		System.out.println("Enter your name");
		String m = br.readLine();
		System.out.println("Enter your marks");
		float j = Float.parseFloat(br.readLine());
		System.out.println("Name of Student:-"+m);
		System.out.println("Roll number of Student:-"+k);
		System.out.println("Mark of Student:-"+j);
	}
}
