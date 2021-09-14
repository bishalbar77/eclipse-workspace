package hackerrank;
import java.util.Scanner;

import java.math.BigInteger;

public class BigInt
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BigInteger factorial = BigInteger.ONE;
    int i;
    for(i=n; i>0;i--)
    {
        factorial = factorial.multiply(BigInteger.valueOf(i));
    }
    System.out.print(factorial);
}}