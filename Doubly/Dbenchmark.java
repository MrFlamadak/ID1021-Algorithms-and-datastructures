//Dbenchmark
import java.lang.*;
import java.util.Random;

class Dbenchmark
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
		int loops = 1000;
		int k = 10;
		long t0;
		long t1;
		long tot1=0;
		long tot2=0;
		//average of 1000 loop
		int[] values = {100,200,300,400, 500, 600};

		System.out.println("n\tDLL RemoAdd\tLL remove RemoAdd ");
		for(int n : values)
		{
			int[] rand = Array.random(n);
			//makes corresponding Dlist with array
			//making references for all elements in the list
			//making an array containing k elements with randomized integers from 0 up to n;
			int[] sequence = sequence(k, n);

			LinkedList no = LinkedList.Randlist(n);

			for( int i = 0; i < k; i++)
			{
				LinkedList sremoved = new LinkedList(5, null);
				t0 = System.nanoTime();
				no = LinkedList.remove(no, 3);
				no = LinkedList.insert(sremoved, no );
				t1 = System.nanoTime();
				tot2 += t1-t0;
			}

			System.out.println(n + "\t" + tot1/k + "\t\t"+ tot2/k);
		}
	}
}