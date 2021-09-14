package arrays;
import java.util.Scanner;
/* then Alice is awarded  point.
If , then Bob is awarded  point.
If , then neither person receives a point.
Comparison points is the total points a person earned.*/
public class AliceBob
{
    public static void main(String[] args)
    {
        int Alice =0 , Bob=0;
        Scanner sc = new Scanner(System.in);
        int a[]=new int[3];
        int b[]=new int[3];
        for (int i=0;i<3;i++)
        {
            a[i] = sc.nextInt();
        }
        for (int i=0;i<3;i++)
        {
            b[i] = sc.nextInt();
            		}
        for (int i=0;i<3;i++)
        {
            if(a[i] < b[i])
            {
                Bob+=1;
            }
            if(a[i] > b[i])
            {
                Alice+=1;
            }
            else;

        }
        System.out.print(Alice+" "+Bob);
    }
}