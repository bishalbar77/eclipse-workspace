package hackerearth;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VaccineDealers {
	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int testCases = sc.nextInt();
//		for(int i = 0; i < testCases; i++) {
//			int dealers = sc.nextInt();
//			int numVaccines = sc.nextInt();
//			int vaccines[] = new int[numVaccines];
//			int sumOfVaccines = 0;
//			for(int j = 0; j < numVaccines; j++) {
//				vaccines[j] = sc.nextInt();
//				sumOfVaccines += vaccines[j];
//			}
//			int minDistribution = sumOfVaccines / dealers;
//			Arrays.sort(vaccines);
//			int maxOverFill = vaccines[numVaccines-1] - minDistribution;
//		}
		
		
		
			int[] nums = {1, 78, 45, 452, 3};
			Solution ob = new Solution();
			long ans = Solution.minOperations(nums, 5);
			System.out.println(ans);
	}
	

}

class Solution {
	static long minOperations(int A[], int N) 
    { 
       int target = -N;
       for(int A1:A) target+= A1;
       if (target ==0) return A.length; //since all elements are positive, we have to take all of them
       
       Map<Integer, Integer>map = new HashMap<>();
       map.put(0,-1);
       int sum = 0;
       int res = Integer.MIN_VALUE;
       
       for (int i=0;i<A.length;++i){
           sum += A[i];
           if (map.containsKey(sum-target));
       }
       // no need to check containskey since sum is unique map.put(sum, i);
        return res == Integer.MIN_VALUE?-1 : A.length-res;
    }
}
