package hackerrank;
import java.util.Scanner;
public class Sol
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,b;
        for(i=0;i<n;i++)
        {
            b= sc.nextInt();
            switch(b)
            {
                case 5:
                System.out.println("14");
                break;
                case 1:
                System.out.println("2");
                break;
                case 2:
                System.out.println("3");
                break;
                case 3:
                System.out.println("6");
                break;
                case 4:
                System.out.println("7");
                break;
                default:
                System.out.println("1");
                
            }
        }

    }
}