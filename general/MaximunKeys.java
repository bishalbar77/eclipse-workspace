package general;

import java.util.Scanner;

public class MaximunKeys {

	public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int result = (2 * t - 1) + (2 * t-1) * (2 * t) + (2 * t-1) * (2 * t) * (2 * t);
        System.out.println(result);
    }

}
