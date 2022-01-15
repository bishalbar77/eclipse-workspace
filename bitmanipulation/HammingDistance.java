package bitmanipulation;

public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Hamming Distance 
		 * It means the binary difference between 2 nums
		 * E.g Hamming distance between 3 and 5 is 2
		 * 3 --> 11 and 5 --> 101
		 * so 3 ^ 5 => 110
		 * So the number of set bits are 2 
		 * hence hamming distance is 5 */
		System.out.println(hammingDistance(3,5));
	}
	
	public static int hammingDistance(int x, int y) {
		int xor = x ^ y;
		int count = 0;
		while(xor > 0) {
			count += xor&1;	
			xor>>=1;
		}
		return count;
        
    }

}
