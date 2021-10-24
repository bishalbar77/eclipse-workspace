package kickstart;

import java.util.Scanner;

public class DogsAndCats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int i = 0; i < testCase; i++) {
			int numAnimals = sc.nextInt();
			int dogsMeal = sc.nextInt();
			int catsMeal = sc.nextInt();
			int extraPortions = sc.nextInt();
			sc.nextLine();
			String animalLine = sc.nextLine();
			
			// 1st Case :- Check if there are any dogs else return Yes
			boolean flag = false;
			for(int j = 0; j < animalLine.length(); j++) {
				if(animalLine.charAt(j) == 'D') {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println("Case #" + (i+1) + ": YES");
				continue;
			}

			// 2nd Case :- Feed dogs increase cat meal by extraPortions and feed cats
			for(int j = 0; j < animalLine.length(); j++) {
				if(animalLine.charAt(j) == 'D') {
					if(dogsMeal > 0) {
						dogsMeal -= 1;
						catsMeal += extraPortions;
					} else {
						System.out.println("Case #" + (i+1) + ": NO");
						break;
					}
				} else {
					if(catsMeal > 0) {
						catsMeal -= 1;
					} else {
						System.out.println("Case #" + (i+1) + ": NO");
						break;
					}
				}
				if(j == (animalLine.length() - 1)) {
					System.out.println("Case #" + (i+1) + ": YES");
				}
			}
		}
	}

}
