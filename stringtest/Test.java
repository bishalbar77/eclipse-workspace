package stringtest;

public class Test 
{	//Time complexity O(n*n)
	public static void main(String args[])
	{
		String a ="listen";
		String b ="silent";
		boolean isAna = false;                         // check a char is anagram or not
		boolean isVisited[]= new boolean[b.length()];  // +checks character wise whether it is visited or not
		if( a.length()==b.length()) 
		{
			for(int i=0;i<a.length();i++) 
			{
				int c = a.charAt(i);
				isAna = false;
				for(int j=0;j<b.length();j++) 
				{
					if(b.charAt(j)==c && !isVisited[j]) 
					{
						isVisited[j]=true;              // stores the visited character
						isAna =true;
						break;
						
					}
				}
				if(!isAna)
				{
					break;
				}
				
			}
		}
		if(isAna)
		{
			System.out.print("Anagram");
		}
		else
			System.out.print("Not Anagram");
	}
	

}
