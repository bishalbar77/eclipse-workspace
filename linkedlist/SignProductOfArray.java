package linkedlist;

public class SignProductOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-1,-2,-3,-4,3,2,1};
		System.out.println(arraySign(nums));
	}
	
	public static int arraySign(int[] nums) {
		int product = 1;
		int returnValue = 0;
		for(int i: nums) {
			product *= i;
		}
		if(product > 0)
			returnValue = 1;
		if(product == 0)
			returnValue = 0;
		if(product < 0)
			returnValue = -1;
		return returnValue;
    }

}
