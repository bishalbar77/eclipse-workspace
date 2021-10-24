package dsa.matrix;

import java.util.Arrays;
import java.util.Comparator;

public class FindMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matrix[][] = {{1,3,5},{2,6,9},{3,6,9}};
		System.out.println(median(matrix,3,3));
	}
	
	public static void sortbyColumn(int arr[][], int col)
    {
        // Using built-in sort function Arrays.sort
        Arrays.sort(arr, new Comparator<int[]>() {
            
          @Override              
          // Compare values according to columns
          public int compare(final int[] entry1, 
                             final int[] entry2) {
  
            // To sort in descending order revert 
            // the '>' Operator
            if (entry1[col] > entry2[col])
                return 1;
            else
                return -1;
          }
        });  // End of function call sort().
    }
	
	static int median(int matrix[][], int r, int c) {
		sortbyColumn(matrix, 1);
		int count = r * c;
		int counter = 1;
		int medianNum = 0;
		int median = (count%2 == 0) ? count/2 : (count/2 + 1);
//		System.out.println(median);
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				counter++;
//				if(counter == median) {
//				System.out.println(counter);
					medianNum = matrix[i][j];
					System.out.println(matrix[i][j]);
//				}
			}
		}
		return medianNum;
    }

}
