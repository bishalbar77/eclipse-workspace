package stringtest;
/*Time complexity O(n.log n)
 * Here we store all the index values according to their ASCII value
 * al and bl arrays r used to store no. of time a variable is repeated and accordingly its store
 * at last we just compare the both arrays whether they r equal or not.
 * */
public class sortTest {
	public static void main(String args[])
	{
		String a ="ca$13t";
		String b ="ta$31c";
		int al[] = new int[256];
		int bl[] = new int[256];
		boolean isAna = true;
		for(char c: a.toCharArray()) 
		{
			int index = (int) c;
			al[index]++;
		}
		
		for(char c: b.toCharArray()) 
		{
			int index = (int) c;
			bl[index]++;
		}
		
		for(int i = 0; i< 256; i++) 
		{
			if(al[i] != bl[i]) 
			{
				isAna = false;
				break;
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
