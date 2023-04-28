//Binary.java
import java.util.*;
import java.lang.*;
class Binary
{
	/*public static void main (String [] args)
	{
			int[] array = {1, 4, 6, 7, 9, 15, 35, 56, 86, 90};
			int key = 5;
			if (binary_search(array, key))
				System.out.println("the key " + key + " was found in the array \n" + Arrays.toString(array));
			else
				System.out.println("the key " + key + " was not found in the array\n" + Arrays.toString(array));

	}*/

	private static int[] sorted_array (int n)
		{
			Random rnd = new Random();
			int[] array = new int[n];
			int nxt = 0;
			for (int i = 0; i < n ; i++)
			{
				nxt += rnd.nextInt(10) + 1;
				array[i] = nxt;
			}
			return array;
		}


	public static boolean search(int[] array, int key)
	{
		int first = 0;
		int last = array.length-1;
		int index = (first + last)/2;

		while (index != last && index != first)
		{
			// jump to the middle
			index = (first + last)/2;
			if (array[index] == key)
			{
				// hmm what now?
				return true;
				//: <-- what dis?
			}

			if (array[index] < key && index < last)
			{
				// The index position holds something that is less than
				// what we're looking for, what is the first possible page?
				first = index++;
				continue;
			}

			if (array[index] > key && index > first)
			{
				// The index position holds something that is larger than
				// what we're looking for, what is the last possible page?
				last = index--;
				continue;
			}

			//we land if we reach index = last or first without finding our key

			// Why do we land here? What shoudl we do?
		}
		return false;

	}
}