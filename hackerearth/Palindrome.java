package hackerearth;
import java.util.Scanner;
public class Palindrome {
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        String ActualString = sc.nextLine();
        sc.close();
        int n = ActualString.length();
        String ReverseString = "";
        for(int i =0; i<n ;i++)
            {
            ReverseString+=ActualString.charAt(i);
            }
        System.out.println(ReverseString);
        System.out.println(ActualString);
        if(ReverseString.equals("bub"))
            System.out.print("YES");
        else
        	System.out.print("NO");
        
       
	}
}
               