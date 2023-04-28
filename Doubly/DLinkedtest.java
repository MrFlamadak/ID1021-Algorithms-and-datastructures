//DLinkedtest.java
import java.util.Arrays;
import java.util.Random;
import java.lang.*;


class DLinkedtest
{


	public static int[] sequence(int k, int n)
		{
			int[] sequence = new int[k];
			Random rnd = new Random();

			for (int i = 0; i < k; i++) {
			sequence[i] = rnd.nextInt(n);
			}
			return sequence;
	}

	public static void main (String [] args)
	{
		int n= 10;
		int k= 5;
		//creates and prints array with 10 elements
		int[] rand = {7,3,4,5,9,9,9,5,9,8};
		System.out.println(Arrays.toString(rand));
		//makes corresponding Dlist with array
		Dlinkedlist yo = Dlinkedlist.list(rand);
		//printing out list values to see correspondence
		System.out.println("fourth element: " + yo.nxt.nxt.nxt.value);
		//making references for all elements in the list
		Dlinkedlist[] pointers = Dlinkedlist.index(yo,rand.length);
		//testing correspondence
		System.out.println("last element: " + pointers[rand.length-1].value);
		//making an array containing k elements with randomized integers from 0 up to n;
		int[] sequence = {1,2,3,4,5};
		//looping removing an element in index sequence[i] and adding the element pointers[sequence[i]] back
		for( int i = 0; i < k; i++)
		{

			yo = Dlinkedlist.remove(pointers, yo, sequence[i], n);
			System.out.println("removed element: "+ pointers[sequence[i]].value);
			Dlinkedlist.add(yo,pointers, pointers[sequence[i]], n);
			System.out.println("readded element: "+ pointers[sequence[i]].value);
			System.out.println("last element on list: " + yo.nxt.nxt.nxt.nxt.nxt.nxt.nxt.nxt.value);

		}

	}

}