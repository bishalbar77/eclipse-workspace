package hackerrank;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String n = str.substring(0, 2);
		int i=Integer.parseInt(n);
		if(i > 11) {
			if(str.charAt(8) == 'A')
				System.out.println("00"+str.substring(2, 8));
			else {
				System.out.println(str.substring(0, 8));
			}
		} else {
			if(str.charAt(8) == 'A')
				System.out.println(str.substring(0, 8));
			else {
				System.out.println((i+12)+str.substring(2, 8));
			}
		}

	}

}
