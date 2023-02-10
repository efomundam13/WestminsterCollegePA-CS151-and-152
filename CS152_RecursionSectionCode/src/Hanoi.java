
import java.util.Scanner;

public class Hanoi {
	
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		hanoi(n, 1, 3, 2);
	}
	
	public static void hanoi(int n, int init, int dest, int work) {
		if (n > 1)
			hanoi(n-1, init, work, dest);
		System.out.println("Move disk " + n + " from peg " + init + " to peg " + dest);
		if (n > 1)
			hanoi(n-1, work, dest, init);
	}
}
