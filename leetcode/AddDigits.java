package leetcode;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDigits(38));
	}
	
	public static int addDigits(int num) {
		while(countDig(num) > 1) {
			int sum = 0;
			while(num > 0) {
				sum += num % 10;
				num = num/10;
			}
			num = sum;
		}
		return num;
        
    }
	
	public static int countDig(int n)  
	{  
		int temp = 1;  
		int count = 0;  
		while(temp <= n)  
		{  
			temp = temp * 10;  
			count = count + 1;  
		}  
		return count;  
	}  
}
