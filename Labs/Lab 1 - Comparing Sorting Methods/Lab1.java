
import java.util.Random;
import java.util.Scanner;

public class Lab1 {

	public static void insertionSort(Comparable [] a)
	{
		int n = a.length;
		for(int i=1; i<n; i++) {
			Comparable tmp = a[i];
			int j = i;
			while (j > 0 && tmp.compareTo(a[j-1]) < 0) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = tmp;
		}
	}
	
	public static void selectionSort(Comparable [] a) {
		int n = a.length;
		for(int i = 0; i < n-1; i++) {
			int minIndex = i;
			for(int j=i+1; j<n; j++) {
				if(a[j].compareTo(a[minIndex]) < 0)
						minIndex = j;
			}
			Comparable tmp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = tmp;
		}
	}
	
	public static void mergeSort(Comparable [] a)
	{
		Comparable [] wspace = new Comparable[a.length];
		mergeSort(a, 0, a.length-1, wspace);
	}
	
	public static void mergeSort(Comparable [] a, int low, int high, Comparable[] wspace)
	{
		if (low < high) {
			int mid = (low+high)/2;
			mergeSort(a, low, mid, wspace);
			mergeSort(a, mid+1, high, wspace);
			
			int i=low, j=mid+1;
			int k = low;
			while (i <= mid && j <= high) {
				if (a[i].compareTo(a[j]) < 0) {
					wspace[k++] = a[i++];
				}
				else {
					wspace[k++] = a[j++];
				}
			}
			while (i <= mid)
				wspace[k++] = a[i++];
			while (j <= high)
				wspace[k++] = a[j++];
			
			for(i=low; i<=high; i++)
				a[i] = wspace[i];
		}
	}
	
	public static void printArray(Comparable [] a)
	{
		System.out.print(a[0]);
		for(int i=1; i<a.length; i++)
			System.out.print(" " + a[i]);
		System.out.println();
	}
	
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		
		Comparable [] a1;
		Comparable [] a2;
		Comparable [] a3;
		
		int n;
		System.out.print("Enter array size --> ");
		n = in.nextInt();
		a1 = new Integer[n];
		a2 = new Integer[n];
		a3 = new Integer[n];
		
		for(int i = 0; i < a1.length; i++) {
			a1[i] = a2[i] = a3[i] = rnd.nextInt(10*a1.length);
		}
		//System.out.print("Array before Insertion Sort");
		//printarray(a1);
		insertionSort(a1);
		//System.out.print("Array after Insertion Sort");
		//printarray(a1);
		
		//System.out.print("Array before Selection Sort");
		//printarray(a2);
		selectionSort(a2);
		//System.out.print("Array after Selection Sort");
		//printarray(a2);
		
		//System.out.print("Array before Merge Sort");
		//printarray(a3);
		mergeSort(a3);
		//System.out.print("Array after Merge Sort");
		//printarray(a1);

		
		double start, end;
		start = System.nanoTime();
		for(int i = 0; i < a1.length; i++)
			a1[i] = i;
		end = System.nanoTime();
		double t1 = end-start;
		System.out.println("InsertionSort time: " + t1/1000000);
		
		start = System.nanoTime();
		for(int i = 0; i < a1.length; i++)
			a2[i] = i;
		end = System.nanoTime();
		double t2 = end-start;
		System.out.println("SelectionSort time: " + t2/1000000);
		
		start = System.nanoTime();
		for(int i = 0; i < a1.length; i++)
			a3[i] = i;
		end = System.nanoTime();
		double t3 = end-start;
		System.out.println("MergeSort time: " + t3/1000000);
	}
	
}
