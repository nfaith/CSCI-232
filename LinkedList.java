package problemTwo;

import java.io.*;

public class LinkedList<Item> {
	
	private Node first = null;
	
	private class Node {
			Item element;
			Node next;
	}

	// inserts an integer at the head of the list
	public void insert(Item nodeIn) {
		Node old = first;
		first = new Node();
		
		first.element = nodeIn;
		first.next = old;
	}
	
	// removes all the duplicates from the linked list
	public void deleteDubs() {
		Node temp = first;
		Node secondTemp;
		
		while(temp != null) {
			secondTemp = temp.next;
			while(secondTemp != null) {
				if(temp.element == secondTemp.element) {
					secondTemp.next = secondTemp.next.next;
				}	
				if (secondTemp != null){
					secondTemp = secondTemp.next;
				}
			}
			temp = temp.next;
		}
		return;	
	}

	// prints the list from head to last node
	public void print() {
		Node toPrint = first;
		System.out.print("List: ");
		while(toPrint != null) {
			System.out.print(toPrint.element + " ");
			toPrint = toPrint.next;
		}
		
		System.out.println();
		
	}

	
}
