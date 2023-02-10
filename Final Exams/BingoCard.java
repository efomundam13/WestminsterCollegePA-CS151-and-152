/*
 * Final Exam Code Fall 21
 * 
 * Rudimentary Bingo Card class
 * 
 * NOTE: You should remove all the println() statements from any method you supply code for other than printCard()
 */
public class BingoCard {

	private static final int XED_OUT = -1;
	
	private int[][] card = new int[5][5];
	
	public BingoCard()
	{
		for(int c=0; c<5; c++) {				// this initializes the card to
			for(int r=0; r<5; r++) {			//  B   I   N   G   O
				card[r][c] = 15*c + r + 1;		//  1  16  31  46  61
			}									//  2  17  32  47  62
		}										//  3  18   X  48  63
		card[2][2] = XED_OUT;					//  4  19  34  49  64	
	}											//  5  20  35  50  65
	
	public void calledNumber(int n)
	{
		System.out.println("Number " + n + " called");
	}
	
	public boolean checkForBingo()
	{
		System.out.println("Checking for a bingo");
		return false;
	}
	
	public void printCard()
	{
		System.out.println(card[0][0]);		// currently only prints out one square
	}
	
	public void calledNumber(String s)
	{
		System.out.println("Number " + s + " called");
	}
	
	public void generateCard()
	{
		System.out.println("Generate a random bingo card");
	}
	
	public static void main(String [] args)
	{
		BingoCard card = new BingoCard();
		card.printCard();
		card.calledNumber(1);
		card.printCard();
		if (card.checkForBingo())
			System.out.println("Bingo!");
		else
			System.out.println("No bingo yet, keep playing");
		card.calledNumber("I16");
		card.printCard();
		card.generateCard();
		card.printCard();
	}
}
