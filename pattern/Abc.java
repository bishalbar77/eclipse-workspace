package pattern;
import java.util.Scanner;
public class Abc
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        int n= Sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n-2;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("#");
            }System.out.println();
        }
    }
}
