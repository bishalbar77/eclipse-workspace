package arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,7,11,15};
		for(int i :twoSum(nums, 9)) {
			System.out.println(i);
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(temp.containsKey(target - nums[i])) {
				if(i > temp.get(target - nums[i])) {
					result[0] = i+1;
					result[1] = temp.get(target - nums[i])+1;
				} else {
					result[0] = i+1;
					result[1] = temp.get(target - nums[i])+1;
				}
			}
			temp.put(nums[i], i);
		}
		Arrays.sort(result);
		return result;
		
    }

}
