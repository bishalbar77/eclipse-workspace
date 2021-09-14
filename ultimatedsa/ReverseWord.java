package ultimatedsa;

import java.util.Scanner;

public class ReverseWord {

	long first;
	long second;  
    public ReverseWord(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		long a[] = {1, 2, 5 ,9};
		System.out.println(reverseString(str));
		System.out.println(getMinMax(a, a.length));
	}

	private static String reverseString(String str) {
		String newStr = null;
		int length = str.length();
		for(int i=length-1;i>=0;i--) {
			if(i==length-1) {
				newStr = Character.toString(str.charAt(i));
				continue;
			}
			newStr = newStr + str.charAt(i);
		}
		return newStr;
	}
	
	static ReverseWord getMinMax(long a[], long n)  
    {
        long min = a[0];
        long max = a[0];
        for(int i=0;i<n;i++) {
            if(a[(int) i] > max) {
                max = a[(int) i];
            }
            if(a[(int) i] < min) {
                min = a[(int) i];
            }
        }
		ReverseWord minmax = new ReverseWord(min, max);
        return minmax;
    }


}
