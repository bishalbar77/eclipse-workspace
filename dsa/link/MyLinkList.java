package dsa.link;

public class MyLinkList<e> {
	
	Node<e> head;
	
	public void add(e data)
	{
		Node<e> toAdd = new Node<e>(data);
		
		if(isEmpty())
		{
			head = toAdd;
			return;
		}
		
		Node<e> temp = head;                   //Travelser or tevaersing
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next =toAdd;
	}
	
	void print()
	{
		Node<e> temp = head;                   //Travelser or tevaersing
		while(temp!= null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		
	}
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public e removeLast() throws Exception
	{
		Node<e> temp = head;                   //Travelser or tevaersing
		
		if(temp==null)
		{
			throw new Exception("NO poping bro. No element in the Stack");
		}
		
		if(temp.next == null)
		{
			Node<e> toRemove =head;
			head = null;
			return toRemove.data;
		}
		while(temp.next.next!= null)
		{
			
			temp = temp.next;
		}
		Node<e> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}
	
	public e getLast() throws Exception{
		
		Node<e> temp = head;                   //Travelser or tevaersing
		
		if(temp==null)
		{
			throw new Exception("NO peeking bro. No element in the Stack");
		}
		
		
		while(temp.next!= null)
		{
			
			temp = temp.next;
		}
		
		return temp.data;
		
	}
	static class Node<e> {
		e data;
		Node<e> next;
		
		public Node(e data)
		{
			this.data = data;
			next = null ;
		}
	}
}
