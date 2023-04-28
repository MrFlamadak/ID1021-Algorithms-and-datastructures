//java LinkedLints.java
import java.lang.*;
import java.util.Random;

public class LinkedList
{
	int head;
	LinkedList tail;

	public LinkedList (int item, LinkedList list)
	{
		head = item;
		tail = list;
	}

	public int head()
	{
		return this.head;
	}

	public LinkedList tail()
	{
		return this.tail;
	}
	//put list at the end of list
	public void append(LinkedList b)
	{
		LinkedList nxt = this;

		while (nxt.tail != null)
		{
			nxt = nxt.tail;
		}
		nxt.tail = b;
	}

	public static LinkedList insert(LinkedList b, LinkedList a)
	{
			b.tail = a;
			a = b;
			return a;
	}
	public static LinkedList remove(LinkedList a, int index)
	{
		LinkedList nxt = a;
		if(index== 0)
		{
			a = a.tail;
			return a;
		}
		for(int i=0; i<index-1;i++)
		{
			nxt = nxt.tail;

		}
		nxt.tail= nxt.tail.tail;

		return a;

	}

	public static LinkedList pop(LinkedList stack)
	{
		LinkedList popped = stack;
		stack = stack.tail;
		popped.tail = null;
		return popped;
	}

	public static LinkedList Randlist(int n)
	{
		Random rnd = new Random();
		LinkedList a = new LinkedList(rnd.nextInt(n), null);

		for(int i =0; i< n-1; i++)
		{
			LinkedList rndlist = new LinkedList(rnd.nextInt(n), null);
			a.append(rndlist);
		}
		return a;
	}
		public static LinkedList list(int[] n)
		{
			LinkedList a = new LinkedList(n[0], null);

			for(int i =1; i< n.length; i++)
			{
				LinkedList list = new LinkedList(n[i], null);
				a.append(list);
			}
			return a;
	}

}