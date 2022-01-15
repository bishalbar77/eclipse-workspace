package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,2};
		System.out.println(subsets(nums));
	}
	
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> subset = new ArrayList<>();
		Arrays.sort(nums);
		recursiveSubset(0, nums, subset, res);
		return res;
        
    }

	public static void recursiveSubset(int index, int[] nums, List<Integer> subset, List<List<Integer>> res) {
		// TODO Auto-generated method stub
		// use new ArrayList<> else it will change by reference
		res.add(new ArrayList<>(subset));
		for(int i = index; i < nums.length; i++) {
			subset.add(nums[i]);
			if(i!=index && nums[i] == nums[i-1]) continue;
			recursiveSubset(i+1, nums, new ArrayList<>(subset), res);
			subset.remove(subset.size()-1);  // Last in the subset
		}
	}
}
