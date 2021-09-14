package pmec_oops;

import java.io.File;
import java.util.Scanner; 
public class KeywordFileInput {

	public static void main(String[] args) throws Exception {
	    File file = new File("C:\\Users\\Bishal\\Desktop\\Notes\\Java\\file.txt"); 
	    Scanner fr = new Scanner(file); 
	    int num1 = fr.nextInt();
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter a number from Keyword: "); 
	    int num2 = sc.nextInt();
	    int sum = num1+num2;
	    System.out.println("Sum of two numbers: "+sum); 
	}

}