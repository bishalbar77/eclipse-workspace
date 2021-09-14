package dsa.binarytree;
import java.util.*;

public class FullBinaryTree {

	 
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
	    System.out.println(ShortestDistance(firstNum, secondNum) );
	}
	
	static void ShortestPath(int i, int j, int k, int m, int n)
	{
	    Vector<Integer> path1=new Vector<Integer>(),
	                    path2=new Vector<Integer>();
	    int x = m - 1;
	 
	    // push node i in path1
	    path1.add(i);
	    while (x != k)
	    {
	        path1.add(i / 2);
	        i = i / 2;
	        x--;
	    }
	    int y = n - 1;
	    path2.add(j);
	    while (y != k)
	    {
	        path2.add(j / 2);
	        j = j / 2;
	        y--;
	    }
	    System.out.println();
	}
	 
	static int ShortestDistance(int i, int j)
	{
	    Vector<Integer> v1=new Vector<Integer>(),
	                    v2=new Vector<Integer>();
	    int p1 = i;
	    int p2 = j;
	    while (i != 0)
	    {
	        v1.add(i % 2);
	        i = i / 2;
	    }
	    while (j != 0)
	    {
	        v2.add(j % 2);
	        j = j / 2;
	    }
	    Collections.reverse(v1);
	    Collections.reverse(v2);
	    int m = v1.size(), n = v2.size(), k = 0;
	    if (m < n)
	    {
	        while (k < m && v1.get(k) == v2.get(k))
	            k++;
	    }
	    else
	    {
	        while (k < n && v1.get(k) == v2.get(k))
	            k++;
	    }
	 
	    ShortestPath(p1, p2, k - 1, m, n);
	    return m + n - 2 * k;
	}
}