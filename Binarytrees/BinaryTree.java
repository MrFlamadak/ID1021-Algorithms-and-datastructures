//BinaryTree.java
import java.util.*;
import java.util.Random;
import java.lang.*;

public class BinaryTree implements Iterable<Integer>
{


	public class Node
	{
		public Integer key;
		public Integer value;
		public Node left, right;
		public Node(Integer key, Integer value)
		{
			this.key = key;
			this.value = value;
			this.left = this.right = null;
		}

		public void print()
		{
			if(left != null)
				left.print();
			System.out.println(" key: " + key + "\tvalue: " + value);
			if(right != null)
				right.print();
		}

	}
	Node root;
	int size=0;

	public int size()
	{
		int size = this.size;
		return size;
	}

	public BinaryTree()
	{
		root = null;
	}

	public Iterator<Integer> iterator()
	{
		return new TreeIterator();
	}

	public class TreeIterator implements Iterator<Integer>
	{
		private Node next; // always pointing at nextnode
		private Stack stack = new Stack();
		private int index;
		private int leftreached = 0;
		public TreeIterator()
		{

			if(leftreached == 1)
			{
				//iterate once to right direction
				next = stack.pop();

			}
			else if(leftreached == 0)
			{
				next = root;

				while(next.left != null)
				{
					stack.push(next);
					index++;
					next = next.left;
				}
				// goes to left-most
			 	leftreached =1;
			}
			/*iterate through whole left-most side
			if(next == null)

				stack.push(next);
				TreeIterator(yo.left);

				TreeIterator(yo.right);
				next = root;
				while(next.left != null)
				{
					stack.push(next);
					index++;
					next = next.left;
				}*/

		}
		@Override
		public boolean hasNext()
		{
			if(index < 3 )
				return true;
			else
				return false;
		}
		@Override
		public Integer next() //returns next, if next = null, end has been reached
		{
			int value = next.value;
			next = stack.pop();

			//next.TreeIterator()

			return value;

		}
		@Override
		public void remove()
		{
			throw new UnsupportedOperationException();
		}
	}
	/**************************************************/
	public static BinaryTree generate(int[] shuffled)
	{
		BinaryTree tree = new BinaryTree();
	    for(int i = 0; i < shuffled.length; i++)
	    {
	    	tree.add(shuffled[i], i);
	    }

	    return tree;
    }

    public static int[] shuffle(int n) {
	        Random rnd = new Random();
	        int[] index = new int[n];
	        for(int i = 0; i < n; i++)
	        {
	            index[i] = i;
	        }
	        for(int i = 0; i < n; i++)
	        {
	            int swap = rnd.nextInt(n);
	            int temp = index[swap];
	            index[swap] = index[i];
	            index[i] = temp;
	        }

	        return index;
    }
    public static int[] ordered(int n) {

	        int[] index = new int[n];
	        for(int i = 0; i < n; i++)
	        {
	            index[i] = i;
	        }

	        return index;
    }


	public void add(Integer key, Integer value)
	{
		// if root is null then the root will be assigned the key and value
		if(this.root == null)
		{
			this.root = new Node(key, value);
			this.size++;
			return;
		}
		//if not then move will iterate through the tree
		else
		{
			Node move = this.root;
			//iteration will stop when key to replace is found
			while(key != move.key)
			{
				if(key > move.key )
				{
					if(move.right != null)
					{
						move = move.right;
					}
					//or when endpoint has been reached
					else
					{
						move.right = new Node(key, value);
						this.size++;
						return;
					}
				}
				else if(key < move.key)
				{
					if(move.left != null)
					{
						move = move.left;
					}
					//other endpoint
					else
					{
						move.left = new Node(key, value);
						this.size++;
						return;
					}
				}
			}
			move = new Node(key, value);
		}
		}

	public Integer lookup(Integer key)
	{
		Node move = this.root;
		/*this method employs same iteration principle as add, but
		returns the value if key is found or null when not found.*/
		if(move ==null)
		{
			return null;
		}
		while (true)
		{
			if(key == move.key)
			{
				return move.value;
			}
			if(key > move.key)
			{
				if(move.right !=null)
				{
					move=move.right;
				}
				else
				return null;
			}
			else if(key < move.key)
			{
				if(move.left !=null)
				{
					move=move.left;
				}
				else
				return null;
			}
		}
	}

}