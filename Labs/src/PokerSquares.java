import java.util.Scanner;

public class PokerSquares {
		
	public static final int STRAIGHT_FLUSH = 100;
	public static final int FOUR_OF_A_KIND = 50;
	public static final int FULL_HOUSE = 25;
	public static final int FLUSH = 20;
	public static final int STRAIGHT = 15;
	public static final int THREE_OF_A_KIND = 10;
	public static final int TWO_PAIR = 5;
	public static final int PAIR = 2;
	
	public static Deck d = new Deck();
	public static Card [][] grid = new Card [5][5];
	public static PokerHandEvaluator pEval = new PokerHandEvaluator();;
	public static Hand h = new Hand();
	public static Card val;
	public static int r, c;
	public static Scanner in  = new Scanner(System.in);
	
		public static void main(String [] args) {
			in = new Scanner(System.in);
			d.shuffle();
			char ans;
				do {
					int total = 0;
					do {
						initBoard();
							for(int turn=1; turn<=25; turn++) {
								System.out.print(d.nextCard());
								System.out.println();
								val = d.nextCard();
								printBoard();
								System.out.println("Which row? (type 1-5)");
								r = in.nextInt()-1;
								System.out.println("Which column? (1-5)");
								c = in.nextInt()-1;
								grid[r][c] = val;
							}
							System.out.println("Final Board");
							printBoard();
							evaluateBoard();
						} while(total >= 200);
						System.out.println("The total is or over 200 points");
						System.out.println("Do you want to play again (y/n)? --- ");
						ans = in.next().toLowerCase().charAt(0);
						} while(ans == 'y');
				}

		public static void printBoard() {
				for(int r = 0; r < grid.length; r++) {
					for(int c = 0; c < grid[r].length; c++) { 
							System.out.print(grid[r][c]);
					}
				System.out.println();
				}
		}

		 public static void initBoard() {
			return;
		    }
		 
		public static int evaluateBoard() {
			h.sortHand();
			pEval.acceptHand();
			int total = 0;
			int evaluatedRow = 0;
			for(int r = 0; r == grid[r].length; r++)
				if (pEval.isPair() == true)
					total += 2;
				else if (pEval.isTwoPair() == true)
					total += 5;
				else if (pEval.isThreeOfAKind() == true)
					total += 10;
				else if (pEval.isStraight() == true)
					total += 15;
				else if (pEval.isFlush() == true)
					total += 20;
				else if (pEval.isFullHouse() == true)
					total += 25;
				else if (pEval.isFourOfAKind() == true)
					total += 50;
				else if (pEval.isStraightFlush() == true)
					total += 100;
				else
					total += 0;
			total += evaluatedRow;
				
			int evaluatedCol = 0;
			for(int c = 0; c == grid[c].length; c++)
				if (pEval.isPair() == true)
					total += 2;
				else if (pEval.isTwoPair() == true)
					total += 5;
				else if (pEval.isThreeOfAKind() == true)
					total += 10;
				else if (pEval.isStraight() == true)
					total += 15;
				else if (pEval.isFlush() == true)
					total += 20;
				else if (pEval.isFullHouse() == true)
					total += 25;
				else if (pEval.isFourOfAKind() == true)
					total += 50;
				else if (pEval.isStraightFlush() == true)
					total += 100;
				else
					total += 0;
			total += evaluatedCol;
			return total;	
		}
		}
