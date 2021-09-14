package arrays;
import java.util.Scanner;
public class Birth2 {

    static int birthdayCakeCandles(int n, int[] a) 
    {
       int max=0;
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==max)
            {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, a);
        System.out.println(result);
    }
}
