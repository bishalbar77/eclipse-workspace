package arrays;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-2,-3,-3,-4,-7,-8,-6,-5,-4};
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums) {
		int maximunVal = 0, currVal = 0;
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
				currVal += nums[i];
				if(currVal > maximunVal)
					maximunVal = currVal;
				if(currVal < 0)
					currVal = 0;
			}
		}
		return maximunVal;
        
    }

}
