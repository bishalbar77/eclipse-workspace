package regex;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Regex {

	private static final String regex = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,20})";
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	   	 int n = sc.nextInt();
	   	 for(int i=0;i<n;i++) {
	   		if(sc.hasNextLine()) {
	   			String text = sc.nextLine();
	   		}
	   		Pattern pt = Pattern.compile(regex);
	   	    Matcher mt = pt.matcher("fd");
	   	    boolean result = mt.matches();
	   	    if(result) {
	   	        System.out.println("YES");
	   	    } else {
	   	        System.out.println("NO");
	   	    }
	   	 }
	}

}
