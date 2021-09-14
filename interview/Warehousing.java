package interview;

import java.util.Scanner;

public class Warehousing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				arr = removeTheElement(arr,i+1);
				i--;
			}
		}
		for(int i : arr)
			System.out.print(i+" ");
	}
	
		public static int[] removeTheElement(int[] arr, int index) 
		{ 
			if (arr == null || index < 0 || index >= arr.length) 
			{ 
				return arr; 
			} 
			int[] anotherArray = new int[arr.length - 1]; 
			for (int i = 0, k = 0; i < arr.length; i++)
			{ 
				if (i == index) 
				{ 
					continue; 
				} 
			anotherArray[k++] = arr[i]; 
			} 
			return anotherArray; 
		}

}
