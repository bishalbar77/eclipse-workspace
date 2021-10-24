package bitmanipulation;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerofTwo(398));
		System.out.println(isPowerofTwo2ndMethod(398));
		System.out.println(isPowerofTwo3rdMethod(398));
	}
	
	public static boolean isPowerofTwo(long n){
        int x = 0;
        while((1 << x) <= n) {
            if((1 << x) == n) {
                return true;
            }
            x++;
        }
        return false;
        
    }
	
	public static boolean isPowerofTwo2ndMethod(long n){
		if(n==0) 
			return false;
			
        return (int) (Math.ceil((Math.log(n)) / (Math.log(2)))) == (int) (Math.floor((Math.log(n)) / (Math.log(2))));
    }
	
	public static boolean isPowerofTwo3rdMethod(long n){
	        
	        return (n!=0) && ((n & (n-1)) == 0);
	        
	    }

}
