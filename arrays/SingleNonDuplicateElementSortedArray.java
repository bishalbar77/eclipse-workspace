package arrays;

public class SingleNonDuplicateElementSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,3,7,7,10,11,11};
		System.out.println(singleNonDuplicate(nums));
	}
	
    public static int singleNonDuplicate(int[] nums) {
    	int prev = nums[0];
    	int curr = nums[0];
    	int next = nums[0];
    	if(nums.length > 2 && nums[0] != nums[1]) {
    		return nums[1];
    	}
    	
    	for(int i = 1; i < nums.length-1; i++) {
    		prev = nums[i-1];
    		curr = nums[i];
    		next = nums[i+1];
    		if(!(prev == curr || curr == next)) {
    			return curr;
    		}
    	}
		return nums[nums.length-1];
        
    }

}
