package arrays;
import java.util.Scanner;
public class ArraySum

{
    public static void main(String[] args)
    {
        int marks = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n;i++)
        {
            a[i]=sc.nextInt();
            marks += a[i]; 
        }
        System.out.print(marks);
    }
}