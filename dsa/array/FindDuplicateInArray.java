package dsa.array;

import java.util.Scanner;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int arr[] = new int[arraySize];
		for(int j = 0; j < arraySize; j++) {
			arr[j] = sc.nextInt();
		}
		System.out.println(findDuplicate(arr));
	}

	public static int findDuplicate(int[] nums) {
        int arrLength = nums.length;
        int duplicate = Integer.MAX_VALUE;
        for(int i = 0; i < arrLength; i++) {
        	for(int j = i+1; j < arrLength; j++) {
            	if(nums[i] == nums[j]) {
            		duplicate = nums[j];
            	}
            }
        }
		return duplicate;
        
    }

}
