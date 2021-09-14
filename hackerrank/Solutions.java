package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solutions {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt() + i;
        double m = scan.nextDouble() + d;
        scan.nextLine();                //It consumes the next line
        String b = scan.nextLine();     //It takes the new string
        String k = s.concat(b);
        System.out.println(n);
        System.out.println(m);
        System.out.println(b);
        System.out.print(k);
        



        scan.close();
    }
}