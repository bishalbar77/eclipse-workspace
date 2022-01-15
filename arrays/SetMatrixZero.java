package arrays;

public class SetMatrixZero {

	public static void main(String[] args) {
		// Traverse the 1D matrix
//		int matrix[] =  {0,1,2,0,3,4,5,2,1,3,1,5};
//		for(int row = 0; row < matrix.length; row++) {
//			System.out.println(matrix[row]);
//		}
		
		
		
		int matrix[][] =  {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		System.out.println("Before Processing");
		// Traverse the 2D matrix
		for(int row = 0; row < matrix.length; row++) {
			for(int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col]+" ");
			}
			System.out.println();
		}
		// Step - 1 Taking auxillary row and column
		int aux_row[] = new int[matrix.length];
		for(int i = 0; i < aux_row.length; i++) {
			aux_row[i] = -1;
		}
		int aux_col[] = new int[matrix[0].length];
		for(int i = 0; i < aux_col.length; i++) {
			aux_col[i] = -1;
		}
		// Step - 2
		for(int row = 0; row < matrix.length; row++) {
			for(int col = 0; col < matrix[row].length; col++) {
				if(matrix[row][col] == 0) {
					aux_row[row] = 0;
					aux_col[col] = 0;
				}
			}
		}
		// Step - 3
		for(int row = 0; row < matrix.length; row++) {
			for(int col = 0; col < matrix[row].length; col++) {
				if(aux_row[row] == 0 || aux_col[col] == 0) {
					matrix[row][col] = 0;
				}
			}
		}
		
		

		System.out.println("After Processing");
		// Traverse the 2D matrix
		for(int row = 0; row < matrix.length; row++) {
			for(int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col]+" ");
			}
			System.out.println();
		}
	}

}
