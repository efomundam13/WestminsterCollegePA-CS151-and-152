/*
 * Lab8Driver - driver code for Lab 8
 * 
 * Programmer: John Bonomo
 *       Date: 11/15/21
 */
public class Lab8Driver {

	public static void main(String[] args) {

		Deck d = new Deck();
		Card c;
		System.out.println(" Initial deck: " + d);
		d.shuffle();
		System.out.println("After shuffle: " + d);
		while (d.numLeft() > 10) {
			c = d.nextCard();
			System.out.println("Card " + c + " has suit " + c.getSuit() + " and rank " + c.getRank());
		}
		System.out.println("10 remaining cards in deck: " + d);
		System.out.println("Deal 9 more cards");
		while (d.numLeft() > 1) {
			c = d.nextCard();
		}
		if (d.hasCard())
			System.out.println("Should print this as there is 1 card left");
		else
			System.out.println("Shouldn't print this as there is 1 card left");
		System.out.println("Deal 1 more card");
		c = d.nextCard();
		System.out.println("Last card is " + c);
		if (d.hasCard())
			System.out.println("Shouldn't print this as there are now 0 cards left");
		else
			System.out.println("Should print this as there are now 0 cards left");
		System.out.println("nextCard() now returns " + d.nextCard());
	}

}
