package hackerrank;

import java.util.*;
public class ElectronicsShop {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String FirstLine = sc.nextLine();
		String SecondLine = sc.nextLine();
		String ThirdLine = sc.nextLine();
		String[] tokens = FirstLine.split(" ");
		String[] tokens2 = SecondLine.split(" ");
		String[] tokens3 = ThirdLine.split(" ");
		int budget = Integer.parseInt(tokens[0]);
		int keyboards = Integer.parseInt(tokens[1]);
		int drives = Integer.parseInt(tokens[2]);
		int[] inputkeyboards = new int[tokens2.length];
		int[] inputdrives = new int[tokens3.length];
		for(int i = 0; i < keyboards; i++) {
			inputkeyboards[i] = Integer.parseInt(tokens2[i]);
		}
		for(int i = 0; i < drives; i++) {
			inputdrives[i] = Integer.parseInt(tokens3[i]);
		}
		int indexlength = (inputkeyboards.length)*(inputdrives.length);
		int[] budgetCostArray = new int[indexlength];
		int k=0;
		boolean print = true, noValue=true;
		for(int i =0;i<inputkeyboards.length;i++)
		{
			for(int j=0;j<inputdrives.length;j++)
			{
				int cost = inputkeyboards[i] + inputdrives[j];
				if(cost == budget)
				{
					noValue = false;
					print = false;
					System.out.println(cost);
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
		if(noValue)
		{
			System.out.println(-1);
		}
		else if(print)
		{
			Arrays.sort(budgetCostArray);
			System.out.println(budgetCostArray[indexlength-1]);
		}
		
	}
}
