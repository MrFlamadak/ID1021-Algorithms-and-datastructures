//QuickArr
class QuickArr
{
	int c= 0;
	// sorting method
	public static void sort(int[] array)
	{
		int low = 1;
		int high = array.length-1;

		partition(array, low, high);
	}

	public static void partition(int[] array, int l, int h)
	{
		//variable initialising
		int pivot = l-1;
		int high = h;
		int low = l;
		//while left index smaller than right index, loop
		while(l < h)
		{
			//if the l index element is smaller than pivot index element => increment l
			if(array[l]<= array[pivot])
			{
				l++;
			}
			//if the h index element is higher than pivot index element => decrement h
			if (array[h] >= array[pivot])
			{
				h--;
			}
			//if l index element is greater than pivot element and h index element is lesser than pivot element => swap them
			if(array[l]>array[pivot] && array[h]<array[pivot])
			{
				swap(array, array[l], array[h]);
				h--;
				l++;
			}
		}
		swap(array, array[pivot], array[h]);

		if(pivot != low)
		{
		partition(array, low, h-1 );
		}
		if(pivot != high)
		{
		partition(array, h+1, high);
		}
	}//array sections (all ele <pivot ele) | pivot ele | (all ele> pivot ele)
	// return pivoteleindex

	public static void swap(int[] array, int index1, int index2)
	{
		int copy = array[index1];
		array[index1] = array[index2];
		array[index2] = copy;
	}

}