package arrays;
import java.util.Scanner;
public class Abc
{
    public static void main(String[] args)

    {
        long Total =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum[]= new long[n];
        for(int i=0;i<n;i++)
        {
            sum[i]= sc.nextLong();
        }
        for(int i=0;i<n;i++)
        {
            Total += sum[i];
        }
        System.out.print(Total);
    }
}
