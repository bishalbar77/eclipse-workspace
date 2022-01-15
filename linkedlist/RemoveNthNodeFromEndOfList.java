package linkedlist;

public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);  
		ListNode second = new ListNode(2);  
		ListNode third = new ListNode(3);  
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);  
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = null;
		ListNode newNode = removeNthFromEnd(head, 2);
		while(newNode != null) {
			System.out.println(newNode.val);
			newNode = newNode.next;
		}
	}
	
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode start = new ListNode();
        start.next = head;
    	ListNode fast = start;
    	ListNode slow = start;
    	for(int i = 1; i <= n; ++i)
    		fast = fast.next;

	    while(fast.next != null)
	    {
	        fast = fast.next;
	        slow = slow.next;
	    }
	    
	    slow.next = slow.next.next;
	    
	    return start.next;
        
    }
   
}
