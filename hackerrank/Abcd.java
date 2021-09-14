package hackerrank;
import java.util.Scanner;
public class Abcd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = n/2;
        int q, r=0;
        if(m>t)
        {
            r = n-m;
            q = r/2;
        }
        else
        {
            q = m/2;
        }
        if(r==1 && n%2==0)
        {
            System.out.print("1");
        }
        else
        {
        System.out.print(q);
        }
    }
}