//QuickArrRoy
class QuickArrRoy
{

	// sorting method
	public static void sort(int[] array)
	{

		partition(array, 0, array.length-1);
	}

	public static void partition(int[] array, int l, int h)
	{
		if(l >= h)
		{
			return;
		}
		//variable initialising
		int pivot = l;
		int low = l;
		int high = h;
		l++;
		//while left index smaller than right index, loop
		while(l <= h)
		{
			//if the l index element is smaller than pivot index element => increment l
			if(l+1 > array.length-1)
			{
				break;
			}
			if(array[l]<= array[pivot])
				l++;
			//if the h index element is higher than pivot index element => decrement h
			if (array[h] >= array[pivot])
				h--;
			//if l index element is greater than pivot element and h index element is lesser than pivot element => swap them
			if(array[l]>array[pivot] && array[h]<array[pivot] && !(l > h))
			{
				swap(array, l, h);
				h--;
				l++;
			}
		}

		swap(array, pivot, h);
		if(!(low>=h-1))
			partition(array, low, h-1 );
		if(!(h + 1 >= high))
			partition(array, h+1, high);

	}
	//array sections (all ele <pivot ele) | pivot ele | (all ele> pivot ele)
	// return pivoteleindex

	public static void swap(int[] array, int index1, int index2)
	{
		int copy = array[index1];
		array[index1] = array[index2];
		array[index2] = copy;
	}

}