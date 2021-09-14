package hackerrank;
	import java.util.Scanner;
public class SockPairs 
	{
	    public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        int b=0;
	        boolean isVisited[] = new boolean[n];

	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        for(int i=0;i<n;i++)
	        {
	            for(int j=i+1;j<n;j++)
	            {
	                if(a[i]==a[j] && !isVisited[j] && !isVisited[i])
	                {
	                    b++;
	                    
	                    isVisited[j]=true;
	                    isVisited[i]=true;
	                    break;
	                }
	            }
	        }
	        System.out.print(b);
	    }
	}