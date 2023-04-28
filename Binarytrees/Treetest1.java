//Treetest1.java
import java.util.Arrays;
import java.util.Random;
import java.lang.*;
class Treetest1
{
	public static void main (String []args)
	{
		BinaryTree yo = new BinaryTree();
		//root
		yo.add(50, 1);
		yo.add(40, 2);
		yo.add(30, 3);
		yo.add(25, 4);
		yo.add(20, 5);


		//left

		 /*fix so that root value can be replaced later
		yo.add(4,5);*/
		System.out.println(yo.root.value);

		yo.root.print();
		for (int i : yo)
		{
			System.out.println("ooof "+ i);
		}
	}
}