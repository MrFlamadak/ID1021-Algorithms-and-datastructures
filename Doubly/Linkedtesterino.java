//Linkedtesterino.java
import java.util.Arrays;
import java.util.Random;
import java.lang.*;


class Linkedtesterino

{

	public static void main (String [] args)
	{

		int[] n={1,2,3,4,5,6,7,8,9,10};
		LinkedList yo = LinkedList.list(n);
		yo = LinkedList.remove(yo, 0);
		System.out.println(yo.tail.tail.tail.tail.tail.tail.tail.tail.head);

	}
}