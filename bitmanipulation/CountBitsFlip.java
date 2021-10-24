package bitmanipulation;

public class CountBitsFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
		System.out.println(countBitsFlip(a, b));
		System.out.println(countBitsFlip2ndMethod(a, b));
	}
	
	public static int countBitsFlip(int a, int b){
        int count  = 0;
        int xor = a ^ b;
        while(xor > 0) {
        	count += xor & 1;
        	xor >>=1;
        }
        return count;
    }
	
	public static int countBitsFlip2ndMethod(int a, int b){
        int count  = 0;
        int xor = a ^ b;
        while(xor != 0) {
        	count++;
        	xor = (xor&(xor-1));
        }
        return count;
    }

}
