package linkedlist;

public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);  
		ListNode second = new ListNode(2);  
		ListNode third = new ListNode(3);  
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);  
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = third;
		System.out.println(hasCycle(third));
	}
	public static boolean hasCycle(ListNode head) {
		ListNode headPointerNode = head;
		ListNode cycleNode = head;
		while(cycleNode != null) {
			if(cycleNode.next == head) return true;
			cycleNode = cycleNode.next;
			headPointerNode.next = head;
			headPointerNode = cycleNode;
		}
		return false;
        
    }
}
