package dsa.matrix;

public class MatrixChainMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4 };
	    System.out.println(matrixMultiplication(arr.length,arr));
	}
	
	static int matrixMultiplication(int N, int arr[])
    {
		int m[][] = new int[N][N];
		for (int i = 1; i < N; i++)
            m[i][i] = 0;
		int s[][] = new int[N][N];
		for(int d = 2; d < N; d++) {
			for(int i = 1; i < N-d+1; i++) {
				int j = i+d-1;
                if (j == N)
                    continue;
                m[i][j] = Integer.MAX_VALUE;
				for(int k = i; k <= j-1; k++) {
					int q = m[i][k] + m[k+1][j] + arr[i-1] * arr[k] * arr[j];
					if(q < m[i][j]) {
						m[i][j] = q;
						s[i][j] = k;
					}
				}
			}
		}
		
		
		return m[1][N-1];
    }

}
