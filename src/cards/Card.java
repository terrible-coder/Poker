package cards;

/**
 * Card
 */
public class Card {

	Suit suit;
	Rank rank;

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Card) {
			Card c = (Card) o;
			if(c.suit == this.suit && c.rank == this.rank)
				return true;
			return false;
		}
		return false;
	}

	public int compareTo(Card c) {
		return this.rank.ordinal() - c.rank.ordinal();
	}
}