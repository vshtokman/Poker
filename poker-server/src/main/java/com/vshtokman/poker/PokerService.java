package com.vshtokman.poker;

import com.vshtokman.poker.api.Card;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class PokerService extends Service<PokerConfiguration> {

	public static void main(String[] args) throws Exception {
		new PokerService().run(args);
	}

	@Override
	public void initialize(Bootstrap<PokerConfiguration> bootstrap) {

	}

	@Override
	public void run(PokerConfiguration pokerConfiguration,
			Environment environment) throws Exception {
		
		/*
		 * For each table: 
		 * 1 dealer 
		 * 2-8 players 
		 * player starts with N dollars
		 * players may be in folded or active state 
		 * small blind: 5 
		 * big blind: 10
		 * deal out the cards 
		 * send a message to the first player to act. Only accept events from that player. 
		 * Get the event from the player.
		 * Validate. Distribute to other players. 
		 * Once the betting round is over, reveal three cards. 
		 * Once the next round is over, reveal one more card. 
		 * Once the next round is over, reveal one more card.
		 * Determine the winner. Allocate the money. Rinse and repeat.
		 */
	}
}