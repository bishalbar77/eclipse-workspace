package bitmanipulation;

public class CopySetBitsInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(setSetBit(20909, 10178, 2, 6));
		System.out.println(setSetBit2ndMethod(20909, 10178, 2, 6));
	}
	
	static long setSetBit(int x, int y, int l, int r){
		int mask = 0;
		for(int i = l; i < r; i++) {
			mask = 1 << i-1; 
			if((y & mask) > 0) {
				x = x | mask; 
			}
		}
		return x;
    }
	
	static long setSetBit2ndMethod(int x, int y, int l, int r){
		int maskLength = (1<<(r-l+2)) - 1;
	    int mask = (int) (((maskLength)<<(l-1)) & y) ;
	    x = x | mask;
		return x;
    }

}
