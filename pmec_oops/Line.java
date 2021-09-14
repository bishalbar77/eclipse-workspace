package pmec_oops;

import java.util.Scanner;

public class Line {
	public static void main(String[] args) {
	    Scanner  sc    = new Scanner(System.in);

	    System.out.printf("how many lines you want to enter: ");        
	    String[] input = new String[sc.nextInt()];
	    sc.nextLine();
	    for (int i = 0; i < input.length; i++) {
	        input[i] = sc.nextLine();
	    }

	    System.out.printf("\nYour input:\n");
	    for (String s : input) {
	        System.out.println(s);
	    }
	}

}
