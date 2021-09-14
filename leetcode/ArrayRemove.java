package leetcode;

public class ArrayRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {3,2,2,3,2,3};
		int i = removeElement(n,3);
			System.out.println(i);

	}
    public static int removeElement(int[] nums, int val) 
    {
    	 int begin=0;
    	 for(int i=0;i<nums.length;i++)
    	 {
    		 if(nums[i]!=val)
    			 nums[begin++]=nums[i];
    	 }
    	 return begin;
    }

}
