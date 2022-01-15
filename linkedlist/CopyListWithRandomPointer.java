package linkedlist;

public class CopyListWithRandomPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Node copyRandomList(Node head) {
        Node front = head;
        Node iter = head;
        // Put the copy nodes after original nodes
        while(iter != null) {
            Node newNode = new Node(iter.val);
            front = iter.next;
            iter.next = newNode;
            newNode.next = front;
            iter = front;
        }
        iter = head;
        // Copy the random pointers from original nodes
        while(iter != null) {
            if(iter.random != null) {
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }
        iter = head;
        // Create a dummy node to return as copy list head
        Node dummy = new Node(0);
        Node newNode = dummy;
        // Seperate the original node and copy node
        while(iter != null) {
            // Move the front pointer to next original pointer
            front = iter.next.next;
            // Point the (dummy node/previous copy list node) to iter.next which is a copy node
            newNode.next = iter.next;
            // Front contains the original pointer so point the iter to original node
            iter.next = front;
            // Move both the copy and original list
            newNode = newNode.next;
            iter = iter.next;
            
        }
        
        return dummy.next;
    }
}
