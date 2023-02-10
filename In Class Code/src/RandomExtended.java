
import java.util.Random;

public class RandomExtended extends Random{

	public int nextInt(int low, int high) {
		return nextInt(high-low+1)+low;
	}
	
	public int nextInt(int n) {
		if (n >= 0)
			return super.nextInt(n);		//
		else
			return -super.nextInt(-n);
	}
	
	public static void main (String [] args ) {
		RandomExtended rnd = new RandomExtended();
		int low = 1;
		int high = 16;
		
		for (int i = 0; i<10; i++)
			System.out.print(rnd.nextInt(100) + " ");
		System.out.println();
		for (int i = 0; i<10; i++)
			System.out.print(rnd.nextInt(low, high) + " ");
		System.out.println();
		for (int i = 0; i<10; i++)
			System.out.print(rnd.nextInt(-10) + " ");
		System.out.println();
	}
}
