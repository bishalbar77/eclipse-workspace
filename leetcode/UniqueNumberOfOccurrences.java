package leetcode;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumberOfOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-3,0,1,-3,1,1,1,-3,10,0};
		System.out.println(uniqueOccurrences(nums));
	}
	public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurences = new HashMap<>();
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
        	occurences.put(arr[i], occurences.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry map : occurences.entrySet()) {
            int key = (int) map.getKey();
            int value = (int) map.getValue();
            if(freq.containsKey(value)) {
        		return false;
        	}
        	freq.put(value, key);
        }
		return true;
    }

}
