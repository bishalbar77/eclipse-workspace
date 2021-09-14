package leetcode;

public class ReplaceArrayRightIndexElement {
	public static void main(String args[])
	{
		int[] array = {1, 2 ,5 ,45 ,12 ,23 ,545, 54 ,86 ,85 ,21};
		array = replaceElements(array);
		for(int i : array)
			System.out.print(i+ " ");
		
	}
	    public static int[] replaceElements(int[] arr) 
	    {
	        for(int i=0;i<arr.length-1;i++)
	        {
	                int temp=arr[i+1];
	                for(int j=(i+1);j<arr.length;j++)
	                {
	                        if(temp<arr[j])
	                                temp = arr[j];
	                }
	                arr[i] = temp;
	        }
	        arr[arr.length-1] = -1;
	        return arr;
	    }
}
