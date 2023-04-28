// Bench_average.java
import java.util.Arrays;
import java.util.Random;
import java.lang.*;

// tack Deniel :sob: :pray:

class Bench_average {

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
public static void main(String[] args) {
int k = 10000;
int[] values = {1200};

double t0 = 0;
double tsum1 = 0;
double tsum2 = 0;
double tsum3 = 0;

System.out.println("n\tSelection\tInsertion\tMerge");
for(int n : values)
{

for(int i = 0; i < k; i++)
{
int[] array = randomarray(n);

int[] copy = array.clone();
t0 = System.nanoTime();
a.append(b);
tsum1 += (System.nanoTime() - t0);

copy = array.clone();
t0 = System.nanoTime();
insertion.sort(copy);
tsum2 += (System.nanoTime() - t0);

copy = array.clone();
t0 = System.nanoTime();
Merge.sort(copy);
tsum3 += (System.nanoTime() - t0);
// System.out.println(Arrays.toString(copy));
}
System.out.println(n + "\t" + (tsum1/(k*1000) + "\t\t" + (tsum2/(k*1000)) + "\t\t" + (tsum3/(k*1000))));

t0 = 0;
tsum1 = 0;
tsum2 = 0;
tsum3 = 0;
}
}
}