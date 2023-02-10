import java.util.Scanner;

public class ComparableExample {

	public static void insertionSort(Comparable [] a ) {
		for(int i = 1; i < a.length; i++) {
			Comparable tmp = a[i];
			int j = i;
			while(j < 0 && tmp.compareTo(a[j - 1]) < 0) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = tmp;
		}
	}	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String [] list = new String[6];
		for(int i = 0; i < list.length; i++) {
			list[i] = in.next();
			for(String s : list) {
				System.out.println(s + " ");
			}
			}
			System.out.println();
		}
	}
				
			
	class X implements Comparable {
		private int id;
		
		public X() {
			id = -1;
		}
		
		public X(int val) {
			id = val;
		}
		
		public String toString() {
			return ""+id;
		}
		
		public int compareTo(Object other) {
			if (other == null)
				throw new NullPointerException();
			else if(!(other instanceof X))
				throw new IllegalArgumentException();
			else {
				X otherx = (X) other;
				return id - otherx.id;
			}
		}
	}

