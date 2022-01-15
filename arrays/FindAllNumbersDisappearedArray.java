package arrays;

import java.util.*;

public class FindAllNumbersDisappearedArray {

	public static void main(String args[]) {
		int nums[] = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
		for(int i: nums)
			System.out.println(i);
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList<>();
		// All the nums[i] valued index will be replaced by its negative except for index values which doesnt exists 
		for(int i = 0; i < nums.length; i++) {
			int absValue = Math.abs(nums[i]) - 1; // As index starts from 0
			nums[absValue] = nums[absValue] < 0 ? nums[absValue] : -nums[absValue];
		}
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > 0) res.add(i+1);
		}
		return res;
    }
}
