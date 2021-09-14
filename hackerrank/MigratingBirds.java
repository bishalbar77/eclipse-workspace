package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MigratingBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int nums[] = new int[N];
		for(int i=0;i<N;i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		int count=0, prevCount=0, temp=nums[0];
		for(int i=1;i<N;i++) {
			if(temp==nums[i]) {
				count++;
				prevCount++;
			} else if(count > prevCount){
				prevCount = count;
			} else {
				count=0;
				temp=nums[i];
			}
			System.out.println(count);
		}
		for(int i:nums) {
			System.out.println(i);
		}
//		System.out.println(count);
	}

}
