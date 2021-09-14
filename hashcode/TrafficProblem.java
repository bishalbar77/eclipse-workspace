package hashcode;

import java.util.Scanner;

public class TrafficProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int seconds = sc.nextInt();
		int intersections = sc.nextInt();
		int streets = sc.nextInt();
		int cars = sc.nextInt();
		int points = sc.nextInt();
		int[] startingIntersection = new int[streets];
		int[] endingIntersection = new int[streets];
		int[] timeTaken = new int[streets];
		String[] streetNames = new String[streets];
		for(int i=0;i<streets;i++) {
			startingIntersection[i] = sc.nextInt();
			endingIntersection[i] = sc.nextInt();
			streetNames[i] = sc.nextLine();
			timeTaken[i] = sc.nextInt();
		}
		for(int i=0;i<cars;i++) {
			int intersectionsPoints = sc.nextInt();
			String[] intersectionsPointStreetNames = new String[intersectionsPoints];
			for(int j=0;j<intersectionsPoints;j++) {
				intersectionsPointStreetNames[j] = sc.nextLine();
			}
		}
		System.out.println("done");
	}

}
