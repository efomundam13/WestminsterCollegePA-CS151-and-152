
public class PokerHandEvaluator {
	
	private static Card[] cards;
	
	//takes in the hand
	void acceptHand() {
		Hand h = new Hand();
		h.sortHand();
		System.out.print(h);
	}
	
	//determines if it's a straight flush
	public boolean isStraightFlush() {
		if(isFlush() && isStraight()) {
			return true;
		}
			return false;
	}
	
	//Determines if it's Four of a Kind
	public boolean isFourOfAKind() {
		int count = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = (i + 1); j < 5; j++) {
				if(cards[i].getRank() == cards[j].getRank()) {
				count++;
			}
		}
	}
	if(count == 4) {
		return true;
    }
		return false;
	}

	//Determines if hand is a full house
	public boolean isFullHouse() {
		if (isThreeOfAKind() && isTwoPair()) {
			return true;
		}
		return false;
		
    }

	//determines if hand is a flush
	public boolean isFlush() {
		int temp = cards[0].getSuit();
		for(int i = 1; i < 5; i++) {
			if(temp != cards[i].getSuit()) {
				return false;
			}
		}
		return true;
    }
	
	//determines if hand is straight
	public boolean isStraight() {
		int min = cards[0].getRank();
		for(int i = 1; i < 5; i++) {
			if(cards[i].getRank() < min) {
				min = cards[i].getRank();
			}
		}
		
		int max = cards[0].getRank();
		for(int j = 1; j < 5; j++) {
			if(cards[j].getRank() > min) {
				max = cards[j].getRank();
			}
		}
		
		if((max - min + 1) == 5) {
			for(int a = 0; a < 4; a++) {
				for(int b = (a+1); b < 5; b++) {
					if(cards[a].getRank() == cards[b].getRank()) {
						return false;
					}
					else {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	//Determines if hand is three of a kind
	public boolean isThreeOfAKind() {
		int count = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = (i + 1); j < 5; j++) {
				if(cards[i].getRank() == cards[j].getRank()) {
				count++;
			}
		}
	}
	if(count == 3) {
		return true;
    }
		return false;
	}
	
	//determines if hand is a two pair
	public boolean isTwoPair() {
		int count = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = (i + 1); j < 5; j++) {
				if(cards[i].getRank() == cards[j].getRank()) {
				count++;
			}
		}
	}
	if(count == 2) {
		return true;
	}
	else if(isFourOfAKind()) {
		return true;
	}
		return false;	
	}
	
	//Determines if its a pair
	public boolean isPair() {
		int count = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = (i+1); j < 5; j++) {
				if(cards[i].getRank() == cards[j].getRank()) {
					count++;
				}
			}
		}
		if(count == 1) {
			return true;
		}
		else if(isTwoPair() || isThreeOfAKind() || isFourOfAKind()) {
			return true;
		}
		return false;
	}

	//Determines if its a bust
	public boolean isBust() {
		int count = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = (i + 1); j < 5; j++) {
				if(cards[i].getRank() == cards[j].getRank()) {
				count++;
			}
		}
	}
	if(count == 0) {
		return true;
    }
		return false;
	}
}
