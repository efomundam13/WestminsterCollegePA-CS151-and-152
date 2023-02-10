import java.util.ArrayList;

public class CompareTimes {

	public static void main(String[] args) {
		int [] a1 = new int[10000000];
		ArrayList<Integer> a2 = new ArrayList<>();
		double start, end;
		
		start = System.nanoTime();
		for(int i = 0; i < a1.length; i++)
			a1[i] = i;
		end = System.nanoTime();
		double t1 = end-start;
		System.out.println("Array time: " + t1/100000000);
		
		start = System.nanoTime();
		for(int i = 0; i < a1.length; i++)
			a2.add(i);
		end = System.nanoTime();
		double t2 = end-start;
		System.out.println("ArrayList time: " + t2/100000000);
		System.out.println("Array is " + t2/t1 + " times faster than ArrayList");

	}

}
