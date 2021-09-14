package edmt;
import java.util.Scanner;
public class ABc
{
    public static void main(String[] args)
    {
        double p=0, q=0,z=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i = 0; i<n;i++)
        {
            a[i]= sc.nextInt();
            if(a[i]< 0)
            {
                p++;
            }
            else if(a[i]>0)
            {
                q++;
            }
            else{
                z++;
            }
        
        }
        double b = p/n;
        double v = q/n;
        double g = z/n;
        System.out.println(v);
        System.out.println(b);
        System.out.println(g);

    }
}