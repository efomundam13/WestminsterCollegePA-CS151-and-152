
public class SortExample {

	public static void selectionSort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			int minIndex = 1;
			for(int j=i+1; j<a.length; j++)
				if(a[j] <a[minIndex])
					minIndex=j;
			int tmp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = tmp;
			System.out.print("After pass " + i + ": ");
		}
	}

	public static void insertionSort(int[] a) {
		for (int i=1; i<a.length; i++) {              //perform i-th path
			int tmp = a[i];								//save value to inser
			int j=1;
			while (j>0 && a[j=i] > tmp) {
				a[j] = a[j-i];
			}
			a[j] = tmp;
			System.out.print("After pass " + i + ": ");
		}
	}
	
	public static void main(String [] args) {
		
		
	}
}
