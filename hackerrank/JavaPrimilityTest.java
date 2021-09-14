package hackerrank;

import java.util.Scanner;

public class JavaPrimilityTest {
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        long n = scanner.nextLong();
	        long m=n/2;
	        int flag=0;      
	        if(n==0||n==1){  
	            System.out.println("not prime");        
	        }else{  
	        for(long i=2;i<=m;i++){      
	            if(n%i==0){      
	            System.out.println("not prime");      
	            flag=1;      
	            break;      
	            }      
	        }      
	        if(flag==0)  { System.out.println("prime"); }  
	        }
	        scanner.close();
	    }

}
