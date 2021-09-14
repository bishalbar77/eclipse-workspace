package edmt;
import java.util.Scanner;

public class Covert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s =0;
		int c[] = new int[8];
		for(int i =7;i>=0;i--)
		{
			c[i] = sc.nextInt();
			s = s + c[i]*(int)Math.pow(2, i);
			
		}
		char b = (char)s;
		System.out.print(b);
	}

}
