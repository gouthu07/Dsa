package dsa.stack;

public class stack_opt {
	int[] stack;
	int topstack=-1;
	
	stack_opt(int size)
	{
		stack=new int[size];
	}
	
	public boolean isEmpty()
	{
		return topstack==-1;
	}
	
	public boolean isFull()
	{
		return topstack==stack.length-1;
	}
	
	public void push(int v) {
		if(isFull())
		{
			System.out.println("Stack is full");
		}
		else {
			stack[++topstack]=v;
			System.out.println("Value is inserted");
		}
	}
	
	public void pop() {
		if(isEmpty())
		{
			System.out.println("Stack is already empty");
		}
		else {
			int v=stack[topstack--];
			System.out.println("Popped");
		}
	}
	
	public void peek() {
		if(isEmpty())
		{
			System.out.println("stack is already");
		}
		else {
			System.out.println("the peek element is:-"+stack[topstack]);
		}
	}
	
	public void delete() {
		stack=null;
		System.out.println("the stack is destroyed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack_opt s=new stack_opt(3);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.peek();
		s.pop();
		s.push(4);
		s.peek();
		s.delete();
	}

}
