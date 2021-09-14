package edmt;
import java.util.Scanner;
public class Kangaroo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();      //021
        int v1 = sc.nextInt();      //6
        int x2 = sc.nextInt();      //47
        int v2 = sc.nextInt();      //3
        int e =0,f=0;
        if(x1>x2)
        {
            if(v1<v2)
            {
                for(e = x1, f = x2 ;e>=f;e+=v1,f+=v2)
                {
                    if(e==f)
                    {
                    System.out.print("YES");
                    break;
                    }
                }
                if(e<f)
                {
                    System.out.print("NO");
                }
            }
            else
            {
            System.out.print("NO");
            }
        }
        else if(x1<x2)
        {
            if(v1>v2)
            {
                for(e = x1, f = x2 ;e<=f;e+=v1,f+=v2)
                {
                    if(e==f)
                    {
                        System.out.print("YES");
                        break;
                    }
                }
                if(e>f)
                {
                    System.out.print("NO");
                }
            }
            else
            {
            System.out.print("NO");
            }
        }
        else
        {
            System.out.print("YES");
        }
    }
    
}
