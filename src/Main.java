import java.awt.List;
import java.util.Scanner;

public class Main {

	public static void main (String args[]) 
	{
		
		
		System.out.println("Please enter a postfix calculation");
		
		 Scanner input = new Scanner(System.in);  // Create a Scanner object
		  
		 LinkedStack<String> stack = new LinkedStack<>();
		 
		 
		    String calculation = input.nextLine();  // Read user input
		   
		    String[] string = calculation.split("\\s");        //now the calculation is split
		    
		    int result = 0;
		    
		    for (int i=0; i< string.length; i++)          
		    {
		    	
		    	
		    	if (string[i].contentEquals("+"))
		    	{
		    		result = Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
		    		stack.push(Integer.toString(result));
		    	}
		    	else if (string[i].contentEquals("-"))
		    	{
		    		int temp = Integer.parseInt(stack.pop());
		    		result = Integer.parseInt(stack.pop()) - temp;
		    		stack.push(Integer.toString(result));
		    	}
		    	else if (string[i].contentEquals("*"))
		    	{
		    		result = Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop());
		    		stack.push(Integer.toString(result));
		    	}
		    	else if (string[i].contentEquals("/"))
		    	{
		    		int temp = Integer.parseInt(stack.pop());
		    		result = Integer.parseInt(stack.pop()) / temp;
		    		stack.push(Integer.toString(result));
		    		
		    	}
		    	else
		    	{
		    	 stack.push(string[i]);
		    	}
		    		
		    	
		    }
		    
		    System.out.println("Result: " + result);

		    
		
		
		
		
		
		
	}
}
