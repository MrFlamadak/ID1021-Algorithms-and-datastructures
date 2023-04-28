//Linkedtest
class Linkedtest
{


	public static void main (String [] args)
	{
		LinkedList a = LinkedList.Randlist(1);
		LinkedList b = LinkedList.Randlist(10);
		int[] ar = new int[1];
		int[] br = new int[10];
		int loops = 1000;
		long t0;
		long t1;
		long timetot1=0;
		long timetot2=0;
		long timetot3=0;
		long timetot4=0;
		//average of 1000 loop
		int[] values = {100, 200, 400, 800, 1600, 3200, 6400};

		System.out.println("n\tAppend Bconst\tAppend Aconst\tArray Bconst\tArray Aconst ");
		for(int n : values)
		{
			/*for(int i =0; i < loops ; i++)
			{
				a = LinkedList.Randlist(n);
				b = LinkedList.Randlist(10);

				t0 = System.nanoTime();
				a.append(b);
				t1 = System.nanoTime();
				timetot1 += t1-t0;
			}*/

			for(int i =0; i < loops ; i++)
			{
				a = LinkedList.list(10);
				b = LinkedList.list(n);

				t0 = System.nanoTime();
				a.append(b);
				t1 = System.nanoTime();
				timetot2 += t1-t0;
			}
			/*for(int i =0; i < loops ; i++)
			{
				ar = Array.random(n);
				br = Array.random(10);

				t0 = System.nanoTime();
				Array.append(ar, br);
				t1 = System.nanoTime();
				timetot3 += t1-t0;
			}

			for(int i =0; i < loops ; i++)
			{
				ar = Array.random(10);
				br = Array.random(n);

				t0 = System.nanoTime();
				Array.append(ar, br);
				t1 = System.nanoTime();
				timetot4 += t1-t0;
			}*/

			System.out.println(n + "\t" + timetot1/loops + "\t\t"+ timetot2/loops + "\t\t"+ timetot3/loops + "\t\t"+ timetot4/loops );
		}
	}
}