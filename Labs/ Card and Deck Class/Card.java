
public class Card {
	
	public static final int CLUBS = 1;
	public static final int DIAMONDS = 2;
	public static final int HEARTS = 3;
	public static final int SPADES = 4;
	
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	
	private int suit;
	private int rank;
	
	//creates a card
	public Card(int j, int i) {
		this.suit=j;
		this.rank=i;
		badCard();
	}
	
	//determines the suit and card
	public Card(int num) {
		num--;
		suit = num/13 + 1;
		rank = num%13 + 1;
		badCard();
	}
	
	//gets the rank of the card
	public int getRank() 
	{
		return rank;
	}
	
	//gets the suit of the card
	public int getSuit()
	{
		return suit;
	}
	
	//determines if the card has a bad suit or rank
	public void badCard() {
		if (rank < 1 || rank > 13) {
			System.out.println("Invalid rank, must be a rank between 1 and 13.");
			System.exit(0);
		}
		if(suit != SPADES && suit != HEARTS && suit != DIAMONDS && suit != CLUBS) {
			System.out.println("Illegal Suit");
			System.exit(0);
		}
	}
	
	//changes the number to its respectable suit
	public String suitToString() {
		switch(suit) {
		case CLUBS:
			return "C";
		case DIAMONDS:
			return "D";
		case HEARTS:
			return "H";
		case SPADES:
			return "S";
		default:
			return null;
		}
	}
	
	// changes the number to its respectable rank
	public String rankToString() {
		switch(rank) {
		case 1:
			return "A";
		case 2:
			return "2";
		case 3:
			return "3";
		case 4:
			return "4";
		case 5:
			return "5";
		case 6:
			return "6";
		case 7:
			return "7";
		case 8:
			return "8";
		case 9:
			return "9";
		case 10:
			return "10";
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
		default:
			return null;
		}
	}

	//adds together the rank and suit values together
	public String toString() {
		return suitToString() + rankToString();
	}
	
	//copy constructor
	public Card(Card c) {
		this.suit= c.suit;
		this.rank= c.rank;
	}
	
	//determines if two cards are the same
	public boolean equals(Card c) {
		if(!(c instanceof Card))
			return false;
		if (c == this)
			return true;
		
		Card that = (Card)c;
		return that.getRank() == getRank() && that.getSuit() == getSuit();
	}
}