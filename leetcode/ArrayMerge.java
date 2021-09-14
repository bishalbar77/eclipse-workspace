package leetcode;

import java.util.Arrays;

public class ArrayMerge {

	public static void main(String args[])
	{
		int nums1[] = {1,2,3,0,0,0};
		int nums2[] = {2,5,6};
		merge(nums1,3,nums2,3);
	}
    public static void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int arrayLength = m+n;
        for(int j=0,i=m;j<n && i<arrayLength;j++,i++)
        {
            nums1[i]=nums2[j];
        }
        Arrays.sort(nums1);
//        int arrayLength = m+n;
//        int newArray[] = new int[arrayLength];
//        for(int i=0;i<m;i++)
//        {
//            newArray[i]=nums1[i];
//        }  
//        for(int j=0,i=m;j<n && i<arrayLength;j++,i++)
//        {
//            newArray[i]=nums2[j];
//        }
//        Arrays.sort(newArray);
//        nums1 = newArray;
//        for(int i: nums1)
//        	System.out.print(i+" ");
    }
}
