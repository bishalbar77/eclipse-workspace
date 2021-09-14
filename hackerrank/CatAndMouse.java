package hackerrank;
import java.util.Scanner;

public class CatAndMouse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[3];
        int A=0,B=0;
        for(int i=0;i<n;i++)
        {
            for(int j =0; j<3;j++)
            {
                a[j]=sc.nextInt();
            }
            A = Math.abs(a[2] - a[1]);
            B = Math.abs(a[2] - a[0]);
            if(A>B)
            {
                System.out.println("Cat A");
            }
            else if(B>A)
            {
                System.out.println("Cat B");
            }
            else
            {
                System.out.println("Mouse C");
            }
        }
    }
}