//Mergetest.javas
import java.util.*;
import java.lang.*;

class Mergetest
{	public static void main (String [] args)
	{
		int [] org = {9, 6, 1, 40, 8, 3 , 5, 7, 2, 32};

		System.out.println(Arrays.toString(org));
		MergeSort.sort(org);

		System.out.println(Arrays.toString(org));
	}

}