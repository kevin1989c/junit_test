package Stack.util;
import java.util.Stack;

public class StackInteger  {
	Stack<Integer> stack;
	public int create(){
        stack = new Stack<Integer>();  
        return 0;
	}
	public int push(){
		stack.push(1);
		return 0;
	
	}
	public int pop(){
		stack.pop();
		return 0;
	}
	public int isEmpty(){
		if(stack.isEmpty()){
			return 0;
		}
		else{
			return 1;
		}
	}
	

	public void errorFunction(){
	
		StackInteger stackint = new StackInteger();
		stackint.push();
		stackint.create();
	    stackint.pop();
	    stackint.isEmpty();
		}

}

/*
In the code, I define the create(), push(), pop(), isEmpty() in the class StackInteger. 
In the function create(), it is purpose to create a stack, then return a value of 0.
In the function push(), it is purpose to push a integer into the stack, then return a value of 0.
In the function pop(), it is purpose to pop the integer out of the stack, then return a value of 0.
In the function isEmpty(), it is purpose to check the stack, if the stack is empty the return value would be 0, unless the return value would be 1.
*/

