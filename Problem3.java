package problemThree;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		while(stack.IsEmpty() == false) {
			System.out.print(stack.pop());
			
		}
	}

}
