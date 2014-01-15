package com.vshtokman.poker.core;

import java.util.List;
import java.util.Random;

import com.vshtokman.poker.api.Card;

public class Dealer {
	private Deck deck;

	public Dealer() {
		deck = new Deck();
	}
	
	public Card deal() throws Exception {
		return deck.draw();
	}
	
	public void shuffle() {
		deck = new Deck();
	}

	private class Deck {
		private List<Card> cards;
		private Random random;

		public Deck() {
			for (Card.Rank rank : Card.Rank.values()) {
				for (Card.Suit suit : Card.Suit.values()) {
					cards.add(new Card(suit, rank));
				}
			}
		}

		public Card draw() throws Exception {
			if (cards.isEmpty())
				throw new Exception("Deck is empty!");

			return cards.get(random.nextInt(cards.size()));
		}
	}
}
