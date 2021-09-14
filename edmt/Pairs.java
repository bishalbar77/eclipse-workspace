package edmt;
import java.util.Scanner;
//Divisible Sum Pairs


public class Pairs{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int sum = 0, div=0;
        for (int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if (a[i]>a[j])
                {
                    sum = a[i] + a[j];
                    if( sum % m==0)
                    {
                        div++;
                    }
                }
            }

        }
        System.out.print(div);
    }
}
