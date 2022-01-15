package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,1,1,1,1};
		System.out.println(sumOfUnique(nums));
	}
	
	public static int sumOfUnique(int[] nums) {
		int sum = 0;
		Map<Integer, Integer> occurences = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
        	occurences.put(nums[i], occurences.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry map : occurences.entrySet()) {
            int key = (int) map.getKey();
            int value = (int) map.getValue();
            if(value == 1) {
            	sum += key;
        	}
        }
        return sum;
    }

}
