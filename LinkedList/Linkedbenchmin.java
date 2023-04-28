import java.util.Random;
import java.lang.*;

class Linkedbenchmin {

	private static int[] randomarray(int n)
	{
		Random rnd = new Random();
		int[] array = new int[n];

		for(int i = 0; i < n;i++)
		{
			array[i] = rnd.nextInt(10*n);
		}
		return array;
	}



    public static void main(String[] arg) {

	int[] sizes = {100,200, 400,800, 1600, 3200};

	LinkedList a;
	LinkedList b;

	int[] a1 = Array.random(10);
	int[] b1 = new int[10];

	System.out.printf("# appending array and list time in ns\n");
	System.out.printf("#%7s%8s%8s%8s%8s\n", "n", "appendBconst", "appendAconst", "ArrayBconst", "arrayAconst");
	for ( int n : sizes) {



	    System.out.printf("%8d", n);

	    int k = 1000;

	    double min = Double.POSITIVE_INFINITY;

	    /*for (int i = 0; i < k; i++)
	    {
			a = LinkedList.list(n);
	   		b = LinkedList.list(10);

			long t0 = System.nanoTime();
			a.append(b);
			long t1 = System.nanoTime();
			double t = (t1 - t0);
			if (t < min)
			    min = t;
	    }*/

	    System.out.printf("%8.0f", (min));

	    min = Double.POSITIVE_INFINITY;

	    for (int i = 0; i < k; i++) {
		a = LinkedList.list(10);
	   	b = LinkedList.list(n);

		long t0 = System.nanoTime();
		a.append(b);
		long t1 = System.nanoTime();
		double t = (t1 - t0);
		if (t < min)
		    min = t;
	    }

	    System.out.printf("%8.0f" , (min));

	    min = Double.POSITIVE_INFINITY;
		for (int i = 0; i < k; i++)
		{
			b1 = new int[10];
			a1 = Array.random(n);
			long t0 = System.nanoTime();
			Array.append(a1, b1);
			long t1 = System.nanoTime();
			double t = (t1 - t0);
			if (t < min)
			    min = t;
		}

	    System.out.printf("%8.0f" , (min));

    min = Double.POSITIVE_INFINITY;
		for (int i = 0; i < k; i++)
		{
			a1 = new int[10];
			b1 = Array.random(n);

			long t0 = System.nanoTime();
			Array.append(a1, b1);
			long t1 = System.nanoTime();
			double t = (t1 - t0);
			if (t < min)
			    min = t;
		}

	    System.out.printf("%8.0f\n" , (min));
	}
    }
}
