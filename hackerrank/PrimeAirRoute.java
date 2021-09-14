package hackerrank;

import java.util.Scanner;

public class PrimeAirRoute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int maxTravelDist = sc.nextInt();
		sc.nextLine();
		String forwardRouteList = sc.nextLine();
		String returnRouteList = sc.nextLine();
		routeFinder(maxTravelDist, forwardRouteList, returnRouteList);
	
	}

	private static void routeFinder(int maxTravelDist, String forwardRouteList, String returnRouteList) {
		// TODO Auto-generated method stub
		String[] fwdRoutes = forwardRouteList.split(",");
		Optimise(fwdRoutes,forwardRouteList);
		for(int i=0; i<fwdRoutes.length;i++) {
			String[] points = fwdRoutes[i].split(",");
		}
	}

	private static void Optimise(String[] points, String forwardRouteList) {
		// TODO Auto-generated method stub
		for(int i=0; i<points.length;i++) {
			String outputRoutes = points[1].concat("1");
			System.out.println(outputRoutes);
			break;
		}
		Scanner sc = new Scanner(System.in);
		String[] tokens = forwardRouteList.split(" ");
		String[] tokens2 = forwardRouteList.split(" ");
		String[] tokens3 = forwardRouteList.split(" ");
		int budget = 0;
		int keyboards = 0;
		int drives = 0;
		int[] returnRoute = new int[tokens2.length];
		int[] fwdRouteWay = new int[tokens3.length];
		for(int i = 0; i < keyboards; i++) {
			returnRoute[i] = Integer.parseInt(tokens2[i]);
		}
		for(int i = 0; i < drives; i++) {
			fwdRouteWay[i] = Integer.parseInt(tokens3[i]);
		}
		int indexlength = (returnRoute.length)*(fwdRouteWay.length);
		int[] budgetCostArray = new int[indexlength];
		int k=0;
		boolean print = true, noValue=true;
		for(int i =0;i<returnRoute.length;i++)
		{
			for(int j=0;j<fwdRouteWay.length;j++)
			{
				int cost = returnRoute[i] + fwdRouteWay[j];
				if(cost == budget)
				{
					noValue = false;
					print = false;
					break;
				}
				if(cost < budget)
				{ 
					noValue = false;
					budgetCostArray[k] = cost;
					k++;
				}
			}
		}
	}
}
