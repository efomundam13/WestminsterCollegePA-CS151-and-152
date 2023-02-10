import java.util.Random;
import java.util.Scanner;

/** Manny Fomundam
	 * 11/28/2021
	 * Lab 10: Customized Magic Squares
	 * Using a 2D array to detrmine the number of spades in a row and column
	 */

public class Lab10 {
	//creates the magic square
	public static int[][] makeMagicSquare(int a, int b, int c) { 
		int [][] grid = new int [3][3];
		grid [0][0] = a;
		grid [0][1] = b;
		grid [0][2] = c;
		grid [1][0] = (b + 4*c - 2*a)/3;
		grid [1][1] = (a+b+c)/3;
		grid [1][2] = (b + 4*a + 2*c)/3;
		grid [2][0] = (2*a + 2*b - c)/3;
		grid [2][1] = (2*a + 2*c - b)/3;
		grid [2][2] = (2*b + 2*c - a)/3;
		
		
		return grid;
	}
	// prints out the magic square
	public static void printMagicSquare(int [][] grid) {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length;j++) { 
				System.out.printf("%6d ", grid[i][j]);
		}
		System.out.println();
		}
	}

	//main method
	public static void main (String [] args) {
		
		System.out.println("Enter in 2 numbers");
		Scanner in = new Scanner(System.in);
		Random rnd = new Random(0-9999);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = (a + b) % 3;
		c += 3 * rnd.nextInt(3333);
		int [][] grid = makeMagicSquare(a, b, c);
		printMagicSquare(grid);
		
	
	}
	
}