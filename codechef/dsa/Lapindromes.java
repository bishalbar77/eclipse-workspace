package codechef.dsa;

import java.util.Scanner;

public class Lapindromes {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int count = 0;
		if(sc.hasNextInt())
		{
			count = sc.nextInt();
		}
		if(sc.hasNextLine())
		{
			sc.nextLine();
		}// Remove for codechef compiler
		for(int i=0;i<count;i++)
		{
			if(sc.hasNextLine())
			{
				String word = sc.nextLine();
				int length = word.length();
				if(length%2==0)
				{
					int halfString = length/2;
					String firstHalf = word.substring(0, halfString);
					String secondHalf = word.substring(halfString);
					System.out.println(check(firstHalf, secondHalf, halfString, length, word));
				}
				else
				{
					int halfString = length/2;
					String firstHalf = word.substring(0, halfString);
					String secondHalf = word.substring(halfString+1);
					System.out.println(check(firstHalf, secondHalf, halfString+1, length, word));
				}
			}
		}
	}
	
	static String check(String firstHalf, String secondHalf, int halfString, int length, String word)
	{
		String newSecondHalf = "";
		for(int i=length-1;i>halfString-1;i--)
		{
			newSecondHalf = newSecondHalf + word.charAt(i); 
		}
		if((firstHalf).contentEquals(secondHalf))
			return "YES";
		else if((firstHalf).contentEquals(newSecondHalf))
			return "YES";
		else
			return "NO";
	}
}
