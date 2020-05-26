package problemFour;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		while(queue.IsEmpty() == false) {
			System.out.print(queue.dequeue());	
		}
		
	}

}
