class QuickList
{

	public static void sort(Linkedlist list)
	{
	partition(list.first, list.last);

	}

	public static void partition(Linkedlist.Node first, Linkedlist.Node last)
	{
		Linkedlist.Node pivot = first;
		Linkedlist.Node l = first.tail;
		Linkedlist.Node h = last;

		while(last.tail != first || first != null)
		{
			if(l.value<= pivot.value)
				l = l.tail;
			if(h.value>=pivot.value)
			{
				decrement(pivot, h);
			}

			if(l.value >pivot.value && h.value <pivot.value && (h.tail != l) && (l !=null))
			{
				swap(pivot, h);
				l= l.tail;
				decrement(pivot, h);
			}
		}
		swap(pivot, h);

		Linkedlist.Node rightfirst = h.tail;
		decrement(pivot, h);


		partition(first, h);

		partition(rightfirst, last);
	}


	public static void decrement(Linkedlist.Node p1, Linkedlist.Node p2)
	{
		Linkedlist.Node stop = p2;
		p2 = p1;
		while(p2.tail != stop)
		{
			p2 = p2.tail;
		}
	}

	public static void swap(Linkedlist.Node e1, Linkedlist.Node e2)
	{
		int copy = e1.value;
		e1.value = e2.value;
		e2.value = copy;
	}
}
