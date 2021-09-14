package interview;

import java.util.Scanner;

public class CandidateCode {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String virusName = sc.nextLine();
		int n = sc.nextInt();
		int virusNameLength = virusName.length();
		sc.nextLine();
		for(int i=0;i<n;i++) 
		{
			String str2 = sc.nextLine();
			int str2Length = str2.length();
			boolean result = isSubSequence(str2, virusName, str2Length, virusNameLength);
			if (result)
				System.out.println("POSITIVE");
			else
				System.out.println("NEGATIVE");
		}
	}
	static boolean isSubSequence(String str1, String str2, int m, int n)
	{
		if (m == 0)
			return true;
		if (n == 0)
			return false;
		if(str1.charAt(m - 1) == str2.charAt(n - 1))
		{
			return isSubSequence(str1, str2, m - 1, n - 1);
		}
		return isSubSequence(str1, str2, m, n - 1);
	}
}
