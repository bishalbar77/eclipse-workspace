package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumSmallerThanCurrentNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] nums = { 8, 1, 2, 2, 3 } ;
//		
//		for(int i : smallerNumbersThanCurrent(nums)) {
//			System.out.println(i);
//		}
		String text = "&amp; &quot; is an HTML entity but &ambassador; is not.";
		System.out.println(entityParser(text));
	}
	
	public static int[] smallerNumbersThanCurrent(int[] nums) {
        int numsSize[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j])
                    count++;
            }
            numsSize[i] = count;
        }
        return numsSize;
    }
	
	public static String entityParser(String text) {
		Map<String, String> map = new HashMap<>();
		map.put("&quot;", "\"");
		map.put("&apos;", "'");
		map.put("&amp;", "&");
		map.put("&gt;", ">");
		map.put("&lt;", "<");
		map.put("&frasl;", "/");
		
		for(String key : map.keySet()) {
            text = text.replaceAll(key, map.get(key));
		}
		return text;
		
	}

}
