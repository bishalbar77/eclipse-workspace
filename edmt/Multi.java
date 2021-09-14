package edmt;
import java.util.Scanner;
public class Multi
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b;
        for(int i=1;i<=10;i++)
        {
            b = n * i;
            System.out.println(n+" x "+i+" = "+b);
        }
    }   
}
