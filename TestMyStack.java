/**測試deep copy of MyStack*/
public class TestMyStack {
	//main method
	public static void main(String[] args) throws CloneNotSupportedException{
		//new an object
		MyStack stack = new MyStack();
		//new a copy
		MyStack stack1 = (MyStack)stack.clone();
		
		//compare stack and stack1
		System.out.println("stack == stack1 is " + (stack == stack1));
		//compare stack.list and stack1.list
		System.out.println("stack.list == stack1.list is " + (stack.list == stack1.list));
		
	}
}
