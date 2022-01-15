package arrays;

public class MaximumProductSubarray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,3,-2,4};
		System.out.println(maxProduct(nums));
	}
	
	public static int maxProduct(int[] nums) {
		int maximunVal = 0, currVal = 1;
		boolean allNegatives = true;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > 0) {
				allNegatives = false;
			}
		}
		if(allNegatives) {
			maximunVal = Integer.MIN_VALUE;
			for(int i = 0; i < nums.length; i++) {
				maximunVal = Math.max(maximunVal, nums[i]);
			}
		} else {
			for(int i = 0; i < nums.length; i++) {
				currVal *= nums[i];
				if(currVal > maximunVal)
					maximunVal = currVal;
				if(currVal < 0)
					currVal = 0;
			}
		}
		return maximunVal;
        
    }
}
