package search;
import java.util.Scanner;
public class MonkHackerEarth 
		{
		    public static void main(String[] args)
		    {
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt()+1;
		        String a= "aeiou";
		        String str;
		        int len=0;
		        for(int i=1,b=0;i<=n;i++)
		        {
		            str = sc.nextLine().toLowerCase();
                    
		            len = str.length();
		            for(int k=0;k<5;k++)
		            {
		                for(int j=0;j<len;j++)
		                if(str.charAt(j)==a.charAt(k))
		                {
		                    b++;
		                }
		            }
		            if(i>1)
		            System.out.println(b);
		            b=0;
		        }
		        sc.close();
		    }
		}