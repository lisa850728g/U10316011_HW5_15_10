/**測試deep copy of MyStack*/
public class TestMyStack {
	//main method
	public static void main(String[] args) throws CloneNotSupportedException{
		//new an object
		MyStack stack = new MyStack();
		//add objects into the stack array
		stack.push(0);
		stack.push(1);

		//new a copy
		MyStack stack1 = (MyStack)stack.clone();
		//add objects into the stack1 array
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		
		/*compare stack and stack1*/
		System.out.println("       stack vs stack1(deep copy) ");
		
		//show stack's size and stack1's size
		System.out.println("Size : " + "  " + stack.getSize() + "         "  + stack1.getSize());
		
		System.out.print("內容 : ");
		System.out.print("  ");
		
		//show stack's objects
		while(stack.getSize() != 0 ){
			System.out.print(stack.pop());
		}
		
		//排版
		System.out.print("      ");
		//show stack1's objects
		while(stack1.getSize() != 0 ){
			System.out.print(stack1.pop());
		}
		
	}
}
