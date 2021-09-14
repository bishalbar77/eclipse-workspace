package hackerrank;
import java.util.Scanner;
//Bon Appetit
public class Abc
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int temp = 0, sum=0, share=0;
        for(int i = 0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum += a[i]; 
        }
        sum -= a[m];
        share = sum/2;
    int e = sc.nextInt();
    int q = e - share;
    if(q==0)
    {
        System.out.println("Bon Appetit");
    }
    else
        System.out.println(q);
    }
}