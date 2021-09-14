package edmt;
import java.util.Scanner;
//Grading Student hackerrank
public class Cba
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m;
        for(int i =0, k=0;i<n;i++,k=0)
        {
            m = sc.nextInt();
            int mod = m % 5;
            k = m/5;
            if(mod==0 || m<38)
            {
                System.out.println(m);
                continue;
            }
            k++;
            int h = 5*k;
            int r = h - m;
            if(r<3)
            {
                System.out.println(h);
            }
            else
            {
                System.out.println(m);
            }


        }
    }
}
