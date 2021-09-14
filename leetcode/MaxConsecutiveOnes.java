package leetcode;

import java.util.Scanner;

public class MaxConsecutiveOnes {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] =new int[n];
		for(int i=0;i<n;i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println(findMaxConsecutiveOnes(array));

	}
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxHere = 0, max = 0;
        for (int n : nums)
            max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
        return max; 
    } 
}
