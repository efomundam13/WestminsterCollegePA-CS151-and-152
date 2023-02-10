/*
 * Hand - class to represent a hand of cards
 * 
 * Programmer: John Bonomo
 *       Date: 11/17/21
 */
public class Hand {

	private Card[] cards;		// storage for the cards
	private int numCards;		// current number of cards in hand
	
	/*
	 * constructors
	 */
	public Hand()
	{
		setHandSize(5);			// default hand size
	}

	public Hand(int s)
	{
		setHandSize(s);
	}

	public void clearHand()
	/*
	 * clearHand() - removes all cards from the hand
	 */
	{
		for(int i=0; i<cards.length; i++)
			cards[i] = null;
		numCards = 0;
	}
	
	public void setHandSize(int s)
	/*
	 * setHandSize(s) - set maximum size of hand to s
	 */
	{
		if (s <= 0) {
			System.out.println("ERROR: illegal hand size " + s);
			System.exit(0);
		}
		cards = new Card[s];
		clearHand();
	}
	
	public int getHandSize()
	/*
	 * getHandSize() - return maximum size of hand
	 */
	{
		return cards.length;
	}
	
	public void receiveCard(Card c)
	/*
	 * reveiveCard(c) - add card c to hand if there is room
	 */
	{
		if (numCards == cards.length) {
			System.out.println("Too many cards");
			System.exit(0);
		}
		cards[numCards++] = c;
	}

	public Card getCard(int i)
	/*
	 * getCard(i) - return i-th card in hand if it exists; return null otherwise
	 */
	{
		if (i<=0 || i > numCards)
			return null;
		return cards[i-1];
	}
	
	public int getNumCards()
	/*
	 * getNumCards() - return current number of cards in hand
	 */
	{
		return numCards;
	}
	
	public String toString()
	/*
	 * toString() - return string representation of hand
	 */
	{
		if (numCards == 0)
			return "";
		String ans = "" + cards[0];
		for(int i=1; i<cards.length; i++)
			ans += "," + cards[i];
		return ans;
	}
	
	public void sortHand()
	/*
	 * sortHand() - sort the hand by rank of card
	 */
	{
		for(int i=0; i<numCards-1; i++) {
			int k = i;
			for(int j=i+1; j<numCards; j++)
				if (cards[j].getRank() < cards[k].getRank())
					k = j;
			Card tmp = cards[i];
			cards[i] = cards[k];
			cards[k] = tmp;
		}
	}
	
	public static void main(String args[])
	{
		Deck d = new Deck();
		d.shuffle();
		Hand h = new Hand();
		
		for(int i=0; i<h.getHandSize(); i++)
			h.receiveCard(d.nextCard());
		
		System.out.println(h);
		h.sortHand();
		System.out.println(h);
	}
}
