//Array.java
import java.util.Random;
class Array
{

public static void append(int[]a, int[] b)
{
	int[] yo = new int[a.length + b.length];
	//ins�ttning av a i yo
	for (int i = 0 ; i < a.length ;i++)
	{
		yo[i]=a[i];
	}
	//ins�ttning av b i yo
	for(int j = 0; j < b.length; j++)
	{
		yo[a.length + j]=b[j];
	}
	//ers�tt gamla a med nya a
	a = yo;
	}

	public static int[] random(int n)
	{
		Random rnd = new Random();
		int[] array = new int[n];

		for(int i = 0; i < n;i++)
		{
			array[i] = rnd.nextInt(n);
		}
		return array;
	}
}