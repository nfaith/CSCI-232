package problemFour;

public class Queue<Item> {
	
	private Node last = null;
	private Node first = null;
	
	private class Node {
			Item element;
			Node prev;
			Node next;
	}
	
	// enqueues an item to the queue
	public void enqueue(Item nodeIn) {
		
		if(last == null) {              // Takes in the first item and holds its information
			last = new Node();
			last.element = nodeIn;
			last.next = null;
			last.prev = last;
			
		}else if (first == null){       // Takes in the second information and holds that
			first = new Node();
			first.element = nodeIn;
			first.next = last;
			first.prev = null;
			last.prev = first;
		}else {                        // Creates the "first" object in the queue and keeps track of it. 
			Node old = first;
			first = new Node();
			first.element = nodeIn;
			first.next = old;
			first.prev = null;
			first.next.prev = first;
		}
		
	}
	
	// dequeue or deletes an integer from the queue
	public Item dequeue() {
		Node deleted = last;
		last = last.prev;
		return deleted.element;
	}
	
	// returns true if nothing in the queue. Returns false otherwise.
	public boolean IsEmpty() {
		boolean flag = false;
		if (last == null) {
			flag = true;		
		}
		return flag;
	}
	
}
