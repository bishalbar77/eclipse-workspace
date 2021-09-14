package hackerrank;

import java.util.Scanner;

public class JavaStringTokensSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String delims = "[ !,?._'@]+";
        String[] tokens = s.split(delims);
        scan.close();
        System.out.println(tokens.length);
        for(String i:tokens) {
        	System.out.println(i);
        }
	}

}
