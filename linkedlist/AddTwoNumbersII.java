package linkedlist;

public class AddTwoNumbersII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listOne0 =  new ListNode(7);
		ListNode listOne1 =  new ListNode(2);
		ListNode listOne2 =  new ListNode(4);
		ListNode listOne3 =  new ListNode(3);
		listOne0.next = listOne1;
		listOne1.next = listOne2;
		listOne2.next = listOne3;
		ListNode listTwo1 =  new ListNode(5);
		ListNode listTwo2 =  new ListNode(6);
		ListNode listTwo3 =  new ListNode(4);
		listTwo1.next = listTwo2;
		listTwo2.next = listTwo3;
		
		ListNode result = addTwoNumbers(listOne0, listTwo1);
		ListNode currNode = result;
		while(currNode != null) {
			System.out.println(currNode.val);
			currNode = currNode.next;
		}
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);
		int carry = 0;
		ListNode start = new ListNode();
		ListNode temp = start;
		while(l1 != null || l2 != null || carry == 1) {
			int sum = 0;
			if(l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if(l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			sum += carry;
			carry = sum/10;
			ListNode node = new ListNode(sum%10);
			temp.next = node;
			temp = temp.next;
		}
		return reverseList(start.next);
    }

	public static ListNode reverseList(ListNode head) {
		ListNode prev = new ListNode();  
		ListNode curr = new ListNode();  
		prev = null;
		curr = head;
		while(curr != null) {
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp; 
		}
		return prev;
        
    }

}
