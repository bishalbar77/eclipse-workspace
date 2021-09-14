package random;

import java.util.Scanner;
import java.util.Arrays;
public class FloatingNumbersSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner dis=new Scanner(System.in);
        double subArray[] = new double[100];
        String line;
        int j=0,k=0,l=0,m=0,n=0;
        String[] lineVector;
        line = dis.nextLine();
        lineVector = line.split(",");

        for(int i=0;i<lineVector.length;i++)
        {
        	subArray[i] = Double.parseDouble(lineVector[i]);
        }
        for(int i=0;i<lineVector.length;i++)
        {
        	if(subArray[i] < 0.2)
        	{
        		j++;
       		}
        	
        	else if(subArray[i] < 0.4)
        	{
       			k++;
       		}
        	else if(subArray[i] < 0.6)
        	{
       			l++;
       		}
        	else if(subArray[i] < 0.8)
        	{
       			m++;
       		}
        	else if(subArray[i] < 1.0)
        	{
       			n++;
       		}
        }
        int count[] = {j, k, l, m, n};
        Arrays.sort(count);
        Arrays.sort(subArray);
        int count0=0, count2=0, count4=0, count6=0, count8=0;
        for(int i=0;i<subArray.length;i++)
        {
        	if(subArray[i]==0.0);
        	else 
        	{
        		if(subArray[i-1] != 0.0)
            	{
            		System.out.print(",");
            	}
            	if(subArray[i] < 0.2 && subArray[i] >= 0.0 && count0<count[0])
            	{
            		System.out.print(subArray[i]);
            		count0++;
           		}
            	
            	else if(subArray[i] < 0.4 && subArray[i] >= 0.2 && count2<count[0])
            	{
            		System.out.print(subArray[i]);
            		count2++;
           		}
            	else if(subArray[i] < 0.6 && subArray[i] >= 0.4 && count4<count[0])
            	{
            		System.out.print(subArray[i]);
            		count4++;
           		}
            	else if(subArray[i] < 0.8 && subArray[i] >= 0.6 && count6<count[0])
            	{
            		System.out.print(subArray[i]);
            		count6++;
           		}
            	else if(subArray[i] < 1.0 && subArray[i] >= 0.8 && count8<count[0])
            	{
            		System.out.print(subArray[i]);
            		count8++;
           		}
        	}
        }
	}
}
