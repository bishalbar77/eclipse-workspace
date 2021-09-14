package dsa.link;

class GFG
{
     
/* Linked list node */
static class Node
{
    int data;
    Node next;
};
 
/* Function to insert a node at the beginning 
of the linked list */
	static Node push(Node head_ref, int new_data)
	{
	    /* allocate node */
	    Node new_node =new Node();
	    /* put in the data */
	    new_node.data = new_data;
	         
	    /* link the old list at the end 
	    of the new node */
	    new_node.next = head_ref; 
	         
	    /* move the head to point to the new node */
	    head_ref = new_node;
	     
	    return head_ref;
	} 
	 
	static Node front,back;
	 
	/* Split the nodes of the given list 
	into front and back halves,
	and return the two lists 
	using the reference parameters.
	Uses the fast/slow pointer strategy. */
	static void frontAndBackSplit( Node head)
	{
	    Node slow, fast;
	     
	    slow = head;
	    fast = head.next;
	     
	    /* Advance 'fast' two nodes, and 
	    advance 'slow' one node */
	    while (fast != null)
	    {
	        fast = fast.next;
	        if (fast != null)
	        {
	            slow = slow.next;
	            fast = fast.next;
	        }
	    }
	     
	    /* 'slow' is before the midpoint in the list, 
	        so split it in two at that point. */
	    front = head;
	    back = slow.next;
	    slow.next = null;
	}
	 
	/* Function to reverse the linked list */
	static Node reverseList( Node head_ref)
	{
	    Node current, prev, next;
	    current = head_ref;
	    prev = null;
	    while (current != null)
	    {
	        next = current.next;
	        current.next = prev;
	        prev = current;
	        current = next;
	    } 
	    head_ref = prev;
	    return head_ref;
	}
	 
	// perfrom the required subtraction operation 
	// on the 1st half of the linked list
	static void modifyTheContentsOf1stHalf()
	{
	    Node front1 = front, back1 = back;
	    // traversing both the lists simultaneously
	    while (back1 != null)
	    {
	        // subtraction operation and node data
	        // modification
	        front1.data = front1.data - back1.data;
	         
	        front1 = front1.next;
	        back1 = back1.next;
	    }
	}
	 
	// function to concatenate the 2nd(back) list 
	// at the end of the 1st(front) list and 
	// returns the head of the new list
	static Node concatFrontAndBackList(Node front,
	                                   Node back)
	{
	    Node head = front;
	     
	    if(front == null)return back;
	     
	    while (front.next != null)
	        front = front.next; 
	         
	    front.next = back;
	     
	    return head;
	}
	 
	// function to modify the contents of the linked list
	static Node modifyTheList( Node head)
	{
	    // if list is empty or contains only single node
	    if (head == null || head.next == null)
	        return head;
	    front = null; back = null;
	     
	    // split the list into two halves
	    // front and back lists
	    frontAndBackSplit(head);
	         
	    // reverse the 2nd(back) list
	    back = reverseList(back);
	     
	    // modify the contents of 1st half 
	    modifyTheContentsOf1stHalf();
	     
	    // agains reverse the 2nd(back) list
	    back = reverseList(back);
	     
	    // concatenating the 2nd list back to the 
	    // end of the 1st list
	    head = concatFrontAndBackList(front, back);
	 
	    // pointer to the modified list
	    return head;
	}
	 
	// function to print the linked list
	static void printList( Node head)
	{
	    if (head == null)
	        return;
	     
	    while (head.next != null)
	    {
	        System.out.print(head.data + " -> ");
	        head = head.next;
	    }
	    System.out.println(head.data );
	}
	 
	// Driver Code
	public static void main(String args[])
	{
	    Node head = null;
	     
	    // creating the linked list
	    head = push(head, 1);
	    head = push(head, 2);
	    head = push(head, 3);
	    head = push(head, 4);
	    head = push(head, 5);
	    head = push(head, 6);
	     
	    // modify the linked list
	    head = modifyTheList(head);
	     
	    // print the modified linked list
	    System.out.println( "Modified List:" );
	    printList(head);
	}
}
