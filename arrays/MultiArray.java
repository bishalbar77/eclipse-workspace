package arrays;
import java.util.Scanner;
public class MultiArray 
{

	public static void main(String[] args)
    {
        int d1=0, d2=0, dd;
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int c = n;
        int a[][]= new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
            a[i][j]=Sc.nextInt();
            }
        }
        for(int i=0; i<n;i++)
        {
            d1 += a[i][i];
        }
        for(int i=0; i<n;i++)
        {
            d2 += a[i][--c];
        }
        dd=d1-d2;
        System.out.print(Math.abs(dd));

    }
	

}
