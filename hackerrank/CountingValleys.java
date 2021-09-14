package hackerrank;

import java.util.Scanner;

public class CountingValleys {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String moment;
		int stepCount = 0, hillCount=0, temp=0;
		sc.nextLine();
		moment = sc.nextLine();
		for(int i=0;i<n;i++)
		{
				if(moment.charAt(i)=='D')
				{
					stepCount++;
				}
				else
				{
					stepCount--;
				}
				if(stepCount > 0 && temp==0)
				{
					hillCount++;
					temp=stepCount;
				}
				else
				{
					temp=stepCount;
				}
		}
		System.out.println(hillCount);
	}

}
