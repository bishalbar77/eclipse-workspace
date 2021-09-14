package leetcode;

import java.util.Scanner;

public class DuplicateZeros {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] =new int[n];
		for(int i=0;i<n;i++)
		{
			array[i] = sc.nextInt();
		}
		duplicateZeros(array);

	}
    public static void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==0)
            {
                for(int j=arr.length-1;j>i;j--)
                {
                    arr[j]=arr[j-1];
                }
                arr[i+1]=0;
                i++;
            }
        }
    }
}