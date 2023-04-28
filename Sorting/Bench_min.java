import java.util.Random;
import java.lang.*;

class Bench_min {

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

	int[] sizes = {100,200,300,400,500,600,700,800,900,1000,1100,1200,1300,1400,1500,1600};

	System.out.printf("# searching through an array of length n, time in ns\n");
	System.out.printf("#%7s%8s%8s%8s\n", "n", "selection", "insertion", "merge");
	for ( int n : sizes) {


	    int[] array = randomarray(n);

	    System.out.printf("%8d", n);

	    int k = 1000;

	    double min = Double.POSITIVE_INFINITY;

	    for (int i = 0; i < k; i++)
	    {
			int[] copy = array.clone();
			long t0 = System.nanoTime();
			selection.sort(copy);
			long t1 = System.nanoTime();
			double t = (t1 - t0);
			if (t < min)
			    min = t;
	    }

	    System.out.printf("%8.0f", (min/k));

	    min = Double.POSITIVE_INFINITY;

	    for (int i = 0; i < k; i++) {
		int[] copy = array.clone();
		long t0 = System.nanoTime();
		insertion.sort(copy);
		long t1 = System.nanoTime();
		double t = (t1 - t0);
		if (t < min)
		    min = t;
	    }

	    System.out.printf("%8.0f" , (min/k));

	    min = Double.POSITIVE_INFINITY;
		for (int i = 0; i < k; i++)
		{
		int[] copy = array.clone();
			long t0 = System.nanoTime();
			Merge.sort(copy);
			long t1 = System.nanoTime();
			double t = (t1 - t0);
			if (t < min)
			    min = t;
		}

	    System.out.printf("%8.0f\n" , (min/k));
	}
    }
}
