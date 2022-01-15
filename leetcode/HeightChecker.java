package leetcode;

import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,1,4,2,1,3};
		System.out.println(heightChecker(nums));
	}
	
	public static int heightChecker(int[] heights) {
		int heightCounter = 0;
		int aux[] = new int[heights.length];
		for(int i = 0; i < heights.length; i++) {
			aux[i] = heights[i];
		}
		Arrays.sort(aux);

		for(int i = 0; i < heights.length; i++) {
			if(aux[i] != heights[i])
				heightCounter++;
		}
		return heightCounter;
        
    }

}
