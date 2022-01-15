package leetcode;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(n));
	}
	public static int missingNumber(int[] nums) {
		int aux[] = new int[nums.length + 1];
		for(int i = 0; i < aux.length; i++) {
			aux[i] = -1;
		}
		for(int i = 0; i < nums.length; i++) {
			aux[nums[i]] = nums[i];
		}
		for(int i = 0; i < aux.length; i++) {
			if(aux[i] == -1) {
				return i;
			}
		}
		return 0;
		
    }
	
//	A better a approach
//	public int missingNumber(int[] nums) {
//        int sum = 0;
//        for(int num: nums)
//            sum += num;
//            
//        return (nums.length * (nums.length + 1) )/ 2 - sum;
//    }

}
