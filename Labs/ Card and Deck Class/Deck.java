
import java.util.Random;

public class Deck {
	
	private Card[] deck;
	private int numCards;
	private int nextCard;
	
	//makes a new deck
	public Deck() {
		deck = new Card[52];
		for (int i = 0; i < 13; i++)
			for (int j = 0; j < 4; j++)
				deck[4*i + j] = new Card(j+1, i+1);
		nextCard = 0;
	}
	
	//shuffles the whole deck
	public void shuffle () {
		Random rnd = new Random();	
		for (int c = 0; c < 52; c++) {
		{
			int swap = rnd.nextInt(52);
			
			Card temp = deck[c];
			deck[c] = deck[swap];
			deck[swap] = temp;
		}
		nextCard = 0;
	}
}
	
	//finds or draws the next card
	public Card nextCard() {
		if(deck.length == 0) {
			shuffle();
		}
		return deck[nextCard++];
	}
	
	//determines the number of cards left after drawing a card or cards
	public int numLeft() {
		numCards = deck.length - nextCard;
		return numCards;
	}
	
	//determines if teh deck has the card
	public boolean hasCard() {
		int index = 0;
		boolean contained = false;
		if(deck.length==0) {
			System.out.print("Error, card size is 0");
			return false;
		}
		else {
			while(index<deck.length && !contained) {
				System.out.print("Card found");
				contained=true;
			}
			index++;
		}
return contained;
}
	
	//returns the cards that are left in the pack
	public String toString() {
		return toString();
	}
}
