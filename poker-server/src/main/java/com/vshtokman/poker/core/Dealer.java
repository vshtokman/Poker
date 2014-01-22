package com.vshtokman.poker.core;

import java.util.List;
import java.util.Random;

import com.vshtokman.poker.api.Card;

/*
 * 1. Listen for more people to join.
 * 2. People join in the folded state.
 * 3. As soon as two or more people sit at the table, start a game.
 * 4. When the game starts, convert the people at the table to the active state.
 * 5. 
 */

public class Dealer {
	private Deck deck;
	private Game game;
	private Player[] players;

	public Dealer() {
		deck = new Deck();
		players = new Player[8];
	}

	public Card deal() throws Exception {
		return deck.draw();
	}

	public void shuffle() {
		deck = new Deck();
	}
	
	public void join(int seat, Player player) {
		if (players[seat] == null) {
			players[seat] = player;
			//TODO: Broadcast that a player has joined this seat.
		}
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
