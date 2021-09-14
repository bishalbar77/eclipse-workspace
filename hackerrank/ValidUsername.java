package hackerrank;

import java.util.Scanner;

public class ValidUsername {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] userNames = new String[N];
		sc.nextLine();
		for(int i=0;i<N;i++) {
			int firstChar;
			if(sc.hasNextLine()) {
				userNames[i] = sc.nextLine();
			}
			if(userNames[i].length() > 7 && userNames[i].length() < 30) {
				if(!(Character.isDigit(userNames[i].charAt(0)) || (int)userNames[i].charAt(0)==95)) {
					if(userNames[i].indexOf('?') == -1 && userNames[i].indexOf('@') == -1) {
						System.out.println("Valid");
						continue;
						
					} else {
						System.out.println("Invalid");
						continue;
					}
				} else {
					System.out.println("Invalid");
					continue;
				}
			} else {
				System.out.println("Invalid");
				continue;
			}
		}
	}

}
