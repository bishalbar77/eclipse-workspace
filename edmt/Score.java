package edmt;
import java.util.Scanner;
public class Score
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i =0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        int max = a[0];
        int mic =0, mac=0;
        for(int i =0; i<n;i++)
        {
            if(a[i] > max)
            {
                max = a[i];
                mac++;
            }
            else if (a[i] < min)
            {
                min = a[i];
                mic++;
            }
            else{}


        }
        System.out.print(mac+" ");
        System.out.print(mic);
    }
}