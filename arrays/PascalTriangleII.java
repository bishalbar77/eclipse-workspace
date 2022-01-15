package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getRow(4));
	}
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> currentRow = null, previousRow = null;
		for(int i = 0 ; i < rowIndex; i++) {
			currentRow = new ArrayList<Integer>();
			/* Since we know that the number of columns in each row 
			 * would be equal to the number of rows so we traverse till the row count*/
			for(int j = 0; j <= i; j++) {
				if(j==0 || j==i) {
					// First and last element in row will be 1
					currentRow.add(1);
				}
				else {
					// Inner elements will be the sum of previous row j-1 and j
					currentRow.add(previousRow.get(j-1) + previousRow.get(j));
				}
					
			}
			previousRow = currentRow;
			
		}
		return currentRow;
        
    }
}
