package leetcode;

public class RemoveFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {1,2,2,2,3,3};
		int i = removeDuplicates(n);
			System.out.println(i);
	}    
	public static int removeDuplicates(int[] nums) {
		int temp=0, begin=0;
		for(int i=0;i<nums.length;i++)
		{
			if(i==0)
			{
				nums[begin]=nums[i];
				temp=nums[i];
				begin++;
			}
			if(nums[i]!=temp)
			{
				nums[begin]=nums[i];
				temp=nums[i];
				begin++;
			}
			
		}
		return begin;
        
    }

}
