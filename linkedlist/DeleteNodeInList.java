package linkedlist;

public class DeleteNodeInList {
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
		deleteNode(third);
		ListNode currNode = head;
		while(currNode != null) {
			System.out.println(currNode.val);
			currNode = currNode.next;
		}
	}
	
	public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
