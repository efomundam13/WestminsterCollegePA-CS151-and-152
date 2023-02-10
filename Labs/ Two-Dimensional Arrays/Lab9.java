/** Manny Fomundam
	 * 11/25/2021
	 * Lab 9: 2D Array
	 * Using a 2D array to detrmine the number of spades in a row and column
	 */

public class Lab9 {
	private static Deck d;
	private static Card[][] grid;
	
	public static void main(String [] args) {
		Deck d = new Deck();
		Card [][] grid = new Card [5][5];
		d.shuffle();
		for(int row = 0; row <= 4; row++) {	
			for(int col = 0; col <= 4; col++) {
			grid[row][col] = d.nextCard();
			System.out.print(grid[row][col]);
		}
	}
		//determines the number of spades in each row and column
			int numSpades = 0;
			for(int row = 0; row <= 4; row++) {
				for(int col = 0; col <= 4; col++) {
					if (grid[row][col].getSuit() == Card.SPADES);
					numSpades++;
			}
				//outputs the results
				System.out.println();
				System.out.println("column " + (row + 1) + ":" + numSpades);
				System.out.println("row " + (row + 1) + ":" + numSpades);
	}
}
}
