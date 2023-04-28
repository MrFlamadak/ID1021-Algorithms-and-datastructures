	//Lstack.java
public class Stack
{

	LinkedList stack;

	//constructor
	public void Stack()
	{
		stack = null;
	}

	public BinaryTree.Node pop()
	{
		if(stack == null)
		{
			return null;
		}
		BinaryTree.Node popped = stack.head;
		stack = stack.tail;
		return popped;
	}
	public void push(BinaryTree.Node a)
	{
		stack = new LinkedList(a, stack);
	}
}