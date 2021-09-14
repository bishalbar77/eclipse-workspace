package codechef;

import java.util.*;
class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cp=0,mp=0,q=0,p=0,r=0,s=0,t=0,chef=0,morty=0,c=0;
		if(sc.hasNextInt())
		t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int cs=0,ms=0;
			if(sc.hasNextInt())
		    c = sc.nextInt();
		    for(int j=0;j<c;j++)
		    {
		    	if(sc.hasNextInt())
		        chef = sc.nextInt();
		        morty = sc.nextInt();
		        if(chef/10==0)
		        {
		            cp = chef;
		        }
		        else
		        {
		            q = chef%10;
		            p = chef/10;
		            cp = q+p;
		        }
		        if(morty/10==0)
		        {
		            mp = morty;
		        }
		        else
		        {
		            r = morty%10;
		            s = morty/10;
		            mp = q+p;
		        }
		        if(cp>mp)
		        {
		            cs++;
		        }
		        else if(mp>cp)
		        {
		            ms++;
		        }
		        else
		        {
		            cs++;
		            ms++;
		        }
		    }
    	    if(cs>ms)
	        {
	            System.out.println("0 "+cs);
	        }
	        else if(ms>cs)
	        {
	            System.out.println("1 "+ms);
	        }
	        else
	        {
	            System.out.println("2 "+cs);
	        }
		}
	}
}