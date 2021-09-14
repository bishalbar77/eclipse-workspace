package arrays;
import java.util.Scanner;
public class Birthday
{
	public static void main(String[] args)
    {
        int b=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[]= new long[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLong();
        }
        for(int i=0;i<=n-1;i++)
		{
			int minindex = i;
			for(int j=i;j<=n-1;j++) // It finds the minimum value in the array
			{
				if (a[j] < a[minindex])
				{
					minindex = j;          // stores the position of minimum value
				}
			}
			long temp = a[i];  // swapping of minimum value to initial position
			a[i] =a[minindex];
			a[minindex] = temp;
		
		}
        for(int i=n-1;i>0;i--)
        {
            if(a[i] == a[i-1])
            {
                b++;

            }
            else
            break;
        }
        System.out.print(b);

    }
}