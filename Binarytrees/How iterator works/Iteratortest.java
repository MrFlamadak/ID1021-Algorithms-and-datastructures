//Iteratortest
import java.util.*;

public class Iteratortest
{
	public static void main (String []args)
	{
		List<String> yo = new ArrayList<>();
		yo.add("Habibi");
		yo.add("Shako");
		yo.add("Mako");

		Iterator<String> iterator = yo.iterator();

		for( String i : yo)
		{
			System.out.println("Magical jutsu of nine tails " + i);
		}



	}
}