package stringtest;
/*Time complexity O(n.log n)
 * Here we store all the index values according to their ASCII value
 * this reduces space complexity
 * at last we just compare the all the position value is 0 or not.
 * */
public class SortTest2 {
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
			al[index]--;
		}
		
		for(int i = 0; i< 256; i++) 
		{
			if(al[i] != 0) 
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
