
import java.util.Scanner;

public class NestedLoopExample2 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int n, m;
/*		
		System.out.print("Enter n amd m ---> " );
		n = in.nextInt();
		m = in.nextInt();

		for(int row=1; row<=n; row++) {	// loop over rows
			for (int col=1; col<=m; col++) { // loop over columns
				System.out.print("*");
			}
			System.out.println();
		}
*/
/*
		System.out.print("Enter n --> ");
		n = in.nextInt();
		for(int row = 1; row<=n; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
			}
*/
		System.out.print("Enter n --> ");
		n = in.nextInt();
		int numAstericks = n;
		for(int row = 1; row<=n; row++) {
			for(int col=1; col<=numAstericks; col++) {
				System.out.print("*");
			}
			numAstericks--;
			System.out.println();
		}
		
	}
	}
