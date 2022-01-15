package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateIII {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		System.out.println(containsNearbyAlmostDuplicate(nums, 3, 0));
	}
	
	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(numbers.containsKey(nums[i])) {
            	if((k >= Math.abs(numbers.get(nums[i]).intValue() - i)) && (Math.abs(nums[numbers.get(nums[i]).intValue()] - nums[i]) <= t)) {
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
