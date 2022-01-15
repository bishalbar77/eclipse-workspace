package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		System.out.println(containsNearbyDuplicate(nums, 3));
	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(numbers.containsKey(nums[i])) {
            	if(k >= Math.abs(numbers.get(nums[i]).intValue() - i)) {
            		return true;
            	} else {
                    numbers.put(nums[i], i);
                }
            } else {
                numbers.put(nums[i], i);
            }
        }
        return false;
    }

}
