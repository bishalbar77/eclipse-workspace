package arrays;

public class SelectionSorting 
{
	public static void main(String[] args)
	{
		int a[]= {2,-7,-8,6,8,9};
		int n = a.length;
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
			int temp = a[i];  // swapping of minimum value to initial position
			a[i] =a[minindex];
			a[minindex] = temp;
		
		}
		for(int e: a)
		{
			System.out.print(e+"YES");
		}
	}

}
