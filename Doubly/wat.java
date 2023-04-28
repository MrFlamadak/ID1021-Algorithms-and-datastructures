// wat.java
import java.util.Arrays;
import java.util.Random;
import java.lang.*;

class wat
{


	public static int[] sequence(int k, int n)
		{
			int[] sequence = new int[k];
			Random rnd = new Random();

			for (int i = 0; i < k; i++) {
			sequence[i] = rnd.nextInt(n);
			}
			return sequence;
	}

	public static void main (String [] args)
	{
		int k= 10;
		int loops=100000;
		long t1 = 0;
		long t0 = 0;
		long tot1 = 0;
		long tot2 = 0;
		int[] values = {100,200,400, 800,1600,3200, 6400};

		System.out.println("n\tDLL RemoAdd\tLL remove RemoAdd ");
		for(int n : values)
		{
			//setting up all variables and objects
			int[] rand = Array.random(n);
			//System.out.println(Arrays.toString(rand));
			Dlinkedlist yo = Dlinkedlist.list(rand);
			LinkedList no = LinkedList.Randlist(n);
			Dlinkedlist[] pointers = Dlinkedlist.index(yo,rand.length);
			//making an array containing k elements with randomized integers from 0 up to n;
			int[] sequence = sequence(k, n);
			//looping removing an element in index sequence[i] and adding the element pointers[sequence[i]] back
			tot1 = 0;
			tot2 = 0 ;
			for(int j=0;j<loops;j++)
			{
				for(int i = 0; i<k; i++)
				{
					t0 = System.nanoTime();
					yo = Dlinkedlist.remove(pointers, yo, sequence[i], n);
					yo = Dlinkedlist.add(pointers[sequence[i]], yo);
					t1= System.nanoTime();
					tot1 += t1-t0;
					pointers = Dlinkedlist.index(yo,rand.length);
				}

				for(int i=0;i < k ;i++)
				{
					LinkedList sremoved = new LinkedList(pointers[sequence[i]].value, null);
					t0 = System.nanoTime();
					no = LinkedList.remove(no, sequence[i]);
					no = LinkedList.insert(sremoved, no );
					t1 = System.nanoTime();
					tot2 += t1-t0;
				}
			}
				System.out.println(n + "\t" + tot1/(loops*k) + "\t\t"+ tot2/(k*loops));
		}

	}
}
