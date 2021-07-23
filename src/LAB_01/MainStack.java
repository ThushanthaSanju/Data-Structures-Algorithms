package LAB_01;

public class MainStack {

	public static void main(String[] args) {
		Stack stack = new Stack(10);
		stack.Push(12);
		stack.Push(14);
		stack.Push(18);
		System.out.println(stack.Peek());
		stack.Push(112);
        
		while (!stack.isEmpty()) {
			
			double val = stack.Pop();
			System.out.println(val);
			
		}
	}

}
