//Linkedtest
class Linkedtest2
{


	public static void main (String [] args)
	{

		int loops = 10000;
		long t0;
		long t1;
		long timetot1=0;
		long timetot2=0;
		long timetot3=0;
		long timetot4=0;
		//average of 1000 loop
		int[] values = {100, 200, 400, 800, 1600, 3200, 6400};

		System.out.println("n\tBuild list\tBuild array");
		for(int n : values)
		{
			for(int i =0; i < loops ; i++)
			{
				t0 = System.nanoTime();
				LinkedList g = LinkedList.list(n);
				t1 = System.nanoTime();
				timetot1 += t1-t0;
			}

			for(int i =0; i < loops ; i++)
			{

				t0 = System.nanoTime();
				int[] p = new int[n];
				t1 = System.nanoTime();
				timetot2 += t1-t0;
			}

			System.out.println(n + "\t" + timetot1/loops + "\t\t"+ timetot2/loops);
		}
	}
}