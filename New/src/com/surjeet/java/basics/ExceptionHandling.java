package com.surjeet.java.basics;

class StackException extends Exception {
	public StackException(String reason)
	{ super(reason); }
}

class Stack2 {
	private Integer arr[];
	private int top;
	private int limit;
	
	private static final int DEFAULT_LIMIT = 5;
	
	public Stack2()
	{
		initialize(DEFAULT_LIMIT);
	}
	
	
	public Stack2(int size)
	{
		initialize(size);
	}
	
	
	
	private void initialize(int size)
	{
		arr = new Integer[size];
		top =-1;
		limit = size;
	}
	
	
	public void push(Integer ele) throws StackException
	{
		if(top< limit -1)
		{ arr[++top] = ele;}
		else { throw new StackException("Overflow");}
	}
	
	
	public Integer pop() throws StackException
	{
		if(top == -1)
		{
			throw new StackException("Underflow");
		}
		return arr[top--];
	}
	
	
	public Integer peak()
	{
		return arr[top];
	}
	
}



public class ExceptionHandling {

	public static void main(String[] args) throws StackException {

		Stack2 stk = new Stack2();
		stk.push(90);
		stk.peak();
	}

}
