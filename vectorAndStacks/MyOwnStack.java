package vectorAndStacks;

import dsa.link.MyLinkList;

public class MyOwnStack<e> {
	
	private MyLinkList<e> ll = new MyLinkList<e>();
	
	void push(e e1)
	{
		ll.add(e1);
	}
	
	e pop() throws Exception
	{
		if(ll.isEmpty())
		{
			throw new Exception("No poping Empty linked list");
			
		}
		return ll.removeLast();
	}
	
	e peek() throws Exception {
		if(ll.isEmpty())
		{
			throw new Exception("No peeking Empty linked list");
			
		}
		return ll.getLast();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
