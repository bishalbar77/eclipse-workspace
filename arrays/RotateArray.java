package arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7};
		rotate(nums, 3);
		for(int i: nums) {
			System.out.println(i);
		}
	}
	
	public static void rotate(int[] nums, int k) {
        k = k % nums.length;  // Since k could be greater than nums.length
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
	
	public static void reverse(int[] nums, int start, int end) {
		while(start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
