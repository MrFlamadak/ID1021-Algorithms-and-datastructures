	//Lstack.java
public class Stack
{
	LinkedList stack;

	//constructor
	public void Stack()
	{
		stack = null;
	}

	public int pop()
	{
		if(stack == null)
		{
			return 0;
		}
		int popped = stack.head;
		stack = stack.tail;
		return popped;
	}
	public void push(int a)
	{
		stack = new LinkedList(a, stack);
	}
}