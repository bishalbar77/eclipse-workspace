package dsa.matrix;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		System.out.println(searchMatrix(matrix,22));
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) 
	{
		for(int i = 0; i < matrix.length; i++) 
		{
			if(target > matrix[i][0]) 
			{
				if(!((i+1) == matrix.length)) 
				{
					if(target < matrix[i+1][0]) 
					{
						for(int j = 0; j < matrix[i].length; j++) 
						{
							if(matrix[i][j] == target) 
								return true;
						}
					}
				} else {
					for(int j = 0; j < matrix[i].length; j++) 
					{
						if(matrix[i][j] == target) 
							return true;
					}
				}
			}
		}
        return false;
    }

}
