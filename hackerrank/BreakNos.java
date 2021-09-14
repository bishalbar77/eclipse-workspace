package hackerrank;
import java.io.*;
import java.util.*;

public class BreakNos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int j=0;j<n;j++)
        {
            String str = sc.nextLine();
            int ln =str.length();
            for(int i=0;i<ln;i+=2)
            {
            System.out.print(str.charAt(i));
            }
            System.out.print(" ");
            for(int i=1;i<ln;i+=2)
            {
            System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
}
