package collections.list;

import java.util.Arrays;

public class LearnArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1, 2, 4, 8, 4, 5, 9, 5, 5, 2 };
		Arrays.parallelSort(numbers);
		System.out.println("index = "+Arrays.binarySearch(numbers, 8));
		for(int i: numbers) {
			System.out.print(i+" ");
		}
		System.out.println();
		Arrays.fill(numbers, 7);
		for(int i: numbers) {
			System.out.print(i+" ");
		}
	}

}
