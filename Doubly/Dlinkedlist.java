//DLinkedlist.java
class Dlinkedlist
{
	int value;
	Dlinkedlist nxt;
	Dlinkedlist prv;
	//constructor
	public Dlinkedlist(int item, Dlinkedlist prev, Dlinkedlist next)
	{

	 value = item;
	 nxt = next;
	 prv = prev;
	}
	public int value(Dlinkedlist a)
	{
		return a.value;

	}

	public Dlinkedlist nxt(Dlinkedlist a)
	{
		return a.nxt;
	}

		public Dlinkedlist prv(Dlinkedlist a)
		{
			return a.prv;
	}

	public void append(Dlinkedlist a)
	{
		//make iterator
		Dlinkedlist after = this;
		//iterate until last position
		while(after.nxt != null)
		{
			after = after.nxt;
		}
		//add a to the last node in the list
		after.nxt = a;
		a.prv = after;
	}
	public static void golf(Dlinkedlist a)
	{
		a = a.nxt;
		return;

	}
		//method that removes an element in list and returns edited list
		public static Dlinkedlist remove(Dlinkedlist[] pointers, Dlinkedlist a, int index, int listsize)
		{
			//make a nxt pointer point at the list then make list point at a
			if (index == 0)
			{
				pointers[1].prv = null;
				pointers[0].nxt = null;
				a= pointers[1];
				return a;
			}
			else if(index == (listsize-1))
			{
				pointers[index-1].nxt= null;
				pointers[index].prv = null;
				return a;
			}
		else
			{
				pointers[index].nxt =null;
				pointers[index].prv = null;
				pointers[index-1].nxt = pointers[index+1];
				pointers[index+1].prv = pointers[index-1];
				return a;
			}

		}
	public static Dlinkedlist add(Dlinkedlist item, Dlinkedlist list)
	{
		//add item to the last node in the list
		item.nxt = list;
		list= item;
		return list;
		/*if(pointers[listsize-1].prv == null)
		{
			pointers[listsize-2].nxt = item;
			item.prv = pointers[listsize-2];
		}
		else
		{
			pointers[listsize-1].nxt = item;
			item.prv = pointers[listsize-1];
		}*/
	}



		public static Dlinkedlist[] index(Dlinkedlist a, int listsize)
		{
			Dlinkedlist nxt = a;
			Dlinkedlist[] pointers = new Dlinkedlist[listsize];
			for( int i = 0 ; i < listsize ; i++)
			{
				pointers[i] = nxt;
				nxt = nxt.nxt;
			}
			return pointers;
		}

		public static Dlinkedlist list(int[] n)
		{
			Dlinkedlist a = new Dlinkedlist(n[0], null, null);

			for(int i =1; i< n.length; i++)
			{
				Dlinkedlist list = new Dlinkedlist(n[i],null, null);
				a.append(list);
			}
			return a;
	}


}


