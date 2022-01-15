package linkedlist;

public class RemoveDuplicatesfromSortedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);  
		ListNode second = new ListNode(2);  
		ListNode third = new ListNode(3);  
		ListNode fourth = new ListNode(3);
		ListNode fifth = new ListNode(4); 
		ListNode sixth = new ListNode(4);
		ListNode seventh = new ListNode(4); 
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = null;
		ListNode list = deleteDuplicates(head);
		ListNode currNode = list;
		while(currNode != null) {
			System.out.println(currNode.val);
			currNode = currNode.next;
		}
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		if(head.next == null || head == null) return head;
		ListNode currentNode = head.next;
		ListNode prevNode = head;
		while(currentNode != null) {
			if(currentNode.val == prevNode.val) {
				prevNode.next = prevNode.next.next;
				currentNode = currentNode.next;
			} else {
				prevNode = currentNode;
				currentNode = currentNode.next;
			}
		}
		return head;
        
    }
}
