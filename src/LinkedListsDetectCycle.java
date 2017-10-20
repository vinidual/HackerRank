import java.util.ArrayList;

public class LinkedListsDetectCycle {
	
	class Node {
        int data;
        Node next;
    }
	
	boolean hasCycle(Node head) {
		
		if(head == null) {
			return false;
		}
		
		ArrayList<Node> visitedNodes = new ArrayList<Node>();
		
		Node next = head;
		
		while(next != null) {
			
			if(visitedNodes.contains(next)) {
				return true;
			}
			
			visitedNodes.add(next);
			
			next = next.next;
		}
		
		return false;
	}

}
