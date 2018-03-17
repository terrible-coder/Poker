package cards;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Deck {
	
	Set<Card> pile;

	public Deck() {
		pile = new HashSet<Card>(0);
		for(Suit s : Suit.values())
			for(Rank r : Rank.values())
				pile.add(new Card(s, r));
	}

	public void shuffle() {
		
	}
}