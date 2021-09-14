package leetcode;

import java.util.Scanner;

public class EvenNumberofDigits {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] =new int[n];
		for(int i=0;i<n;i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println(findNumbers(array));

	}
    public static int findNumbers(int[] nums) 
    {
    	int count=0;
    	for(int i: nums)
    	{
    		int length = String.valueOf(i).length();
    		if(length%2==0)
    			count++;
    	}
		return count;    
    }
}
