//selection.java
class insertion
{
 	public static void sort(int[] array)
	{
		int copy = 0;
		for (int i = 0; i < array.length; i++)
		{
		// for each element from i towards 1, swap the item found with the
		// item before it if it is smaller
			copy = array[i];
			for (int j = i; j > 0 &&  array[j-1] > array[j] ; j--)
			{
					array[j] = array[j-1];
					array[j-1] = copy;
			}
		}
	}
}