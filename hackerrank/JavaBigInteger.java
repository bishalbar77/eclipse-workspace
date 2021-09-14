package hackerrank;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BigInteger num1 = new BigInteger(sc.nextLine());
		BigInteger num2 = new BigInteger(sc.nextLine());
		System.out.println(num1.add(num2));
		System.out.println(num1.multiply(num2));
	}
}

