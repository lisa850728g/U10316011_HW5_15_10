public class TestMyStack {
	public static void main(String[] args) throws CloneNotSupportedException{
		MyStack stack = new MyStack();
		MyStack stack1 = (MyStack)stack.clone();
		
		System.out.println("stack == stack1 is " + (stack == stack1));
		System.out.println("stack.list == stack1.list is " + (stack.list == stack1.list));
		
	}
}
