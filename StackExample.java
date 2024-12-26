package collections;
import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
    	Stack<Integer> stack = new Stack<>();
    	
    	stack.push(5);
    	stack.push(10);
    	stack.push(15);
    	
    	System.out.println("Stack: " + stack);
    	
    	int topElement = stack.peek();
    	System.out.println("Top element: " + topElement);
    	
    	int poppedElement = stack.pop();
    	System.out.println("Popped element: " + poppedElement);
    	
    	System.out.println("Stack after pop: " + stack);
    	
    	stack.pop();
    	System.out.println("Stack after pop: " +  stack);
    	
    	
    	

	}

}
