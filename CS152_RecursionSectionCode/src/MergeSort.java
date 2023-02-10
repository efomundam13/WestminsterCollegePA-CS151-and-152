import java.util.*;

public class MergeSort {

	public static final int SIZE = 25;
	
	public static void mergeSort(int [] a, int low, int high, int [] wspace)
	{

	}
	
	public static void mergeSort(int [] a)
	{
		int [] wspace = new int[a.length];
		mergeSort(a, 0, a.length-1, wspace);
	}
	
	public static void main(String [] args)
	{
		int [] array = new int[SIZE];
		Random rnd= new Random();
		
		for(int i=0; i<SIZE; i++) {
			array[i] = rnd.nextInt(100*SIZE);
		}
		
		System.out.println("Before Sort:");
		System.out.print(array[0]);
		for(int i=1; i<SIZE; i++)
			System.out.print(" " + array[i]);
		System.out.println();
		
		mergeSort(array);
		
		System.out.println("After Sort:");
		System.out.print(array[0]);
		for(int i=1; i<SIZE; i++)
			System.out.print(" " + array[i]);		
		System.out.println();
	}
}
