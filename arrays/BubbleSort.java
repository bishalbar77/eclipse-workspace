package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {2,4,-4,65,8};
		int n = a.length;
		for(int i =0; i<n-1;i++)  // for n-1 times loop
		{
			boolean sorted = true;
			for(int j=0;j<n-1-i;j++) // for swapping inside array one value
			{
				
				if(a[j+1] < a[j])
				{
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					sorted = false;
				}
				
			} 
		if(sorted) break;  // if array is sorted before the total repetitions then it would exist before
		}	
		for (int e: a)
		{
			System.out.print(e+ " ");
		}
		

	}

}
