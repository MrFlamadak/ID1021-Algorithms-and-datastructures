//Linkedlist.java
class Linkedlist
{
	Node first;
	Node last;

	public class Node
	{
		public int value;
		public Node tail;
		public Node(int item, Node list)
		{
			this.value = item;
			this.tail = list;
		}
	}
	//constructor
	public Linkedlist()
	{
		first = null;
		last =	null;
	}

	public void add(Node a )
	{
		if(first==null)
		{
			first = a;
			last = a;
		}
		else if(first == last)
		{
			last.tail = a;
			last = last.tail;
		}
	}
	/*public void append(Node list)
	{
		last.tail= list.first;
		last = list.last;

	}*/
}

