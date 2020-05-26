package problemTwo;

import java.io.*;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insert(1);
		list.insert(2);
		list.insert(5);
		list.insert(7);
		list.insert(1);
		list.insert(5);
		list.insert(6);
		list.insert(2);
		list.print();
		list.deleteDubs();
		list.print();
	}

}
