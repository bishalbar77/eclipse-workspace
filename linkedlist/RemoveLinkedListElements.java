package linkedlist;

public class RemoveLinkedListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);  
		ListNode second = new ListNode(2);  
		ListNode third = new ListNode(4);  
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5); 
		ListNode sixth = new ListNode(4);
		ListNode seventh = new ListNode(1); 
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = null;
		ListNode mergedList = removeElements(head, 4);
		ListNode currNode = mergedList;
		while(currNode != null) {
			System.out.println(currNode.val);
			currNode = currNode.next;
		}
	}
	
	public static ListNode removeElements(ListNode head, int val) {
		while(head != null && head.val == val) {
			head = head.next;
		}
		ListNode start = new ListNode();
		start.next = head;
		ListNode currentNode = head;
		ListNode prevNode = head;
		while(currentNode != null) {
			if(currentNode.val == val) {
				prevNode.next = prevNode.next.next;
				currentNode = currentNode.next;
			} else {
				prevNode = currentNode;
				currentNode = currentNode.next;
			}
		}
		return start.next;
        
    }

}
