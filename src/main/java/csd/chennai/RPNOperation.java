package csd.chennai;
import java.util.*;

public class RPNOperation {

	public int calculate(String input) {
		// TODO Auto-generated method stub
		Stack<Integer> myStack = new Stack<Integer>(); 
		int retValue=0;
		String expr[] = input.split(",");
		for(int i=0;i<expr.length;i++)
		{
			if(expr[i].equals("+"))
			{
				retValue = myStack.pop()+myStack.pop();
				myStack.push(retValue);
			}
			else
			{
				myStack.push(Integer.parseInt(expr[i]));
			}
		}
		
		return myStack.pop();
	}

}
