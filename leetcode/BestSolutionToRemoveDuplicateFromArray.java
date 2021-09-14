package leetcode;

public class BestSolutionToRemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
        public static int removeDuplicates(int[] nums) 
        {
        int length = nums.length;
        
        // Assume the last element is always unique.
        // Then for each element, delete it iff it is
        // the same as the one after it. Use our deletion
        // algorithm for deleting from any index.
        for (int i = length - 2; i >= 0; i--) {
            if (nums[i] == nums[i + 1]) {
                // Delete the element at index i, using our standard
                // deletion algorithm we learned.
                for (int j = i + 1; j < length; j++) {
                    nums[j - 1] = nums[j];
                }
                // Reduce the length by 1.
                length--;
            }
        }
        // Return the new length.
        return length;
    }

}


//int count = 0;
//for(int i = 1; i < n; i++){
//    if(A[i] == A[i-1]) count++;
//    else A[i-count] = A[i];
//}
//return n-count;