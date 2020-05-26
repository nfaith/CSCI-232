package problemThree;

public class Stack<Item>{
	
	private Node first = null;
	
	private class Node {
			Item element;
			Node next;
	}
	
	// pushes an integer onto the stack
	public void push(Item nodeIn) {
		Node old = first;
		first = new Node();
		
		first.element = nodeIn;
		first.next = old;
	}
	
	// pops or deletes an integer from the stack
	public Item pop() {
		Node popped;
		popped = first;
		first = first.next;
		return popped.element;
	}
	
	// returns true if nothing in the stack. Returns false otherwise.
	public boolean IsEmpty() {
		boolean flag = false;
		if (first == null) {
			flag = true;		
		}
		return flag;
	}
	
}
