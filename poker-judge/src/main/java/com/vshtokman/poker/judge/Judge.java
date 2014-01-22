package com.vshtokman.poker.judge;

import java.util.List;

import com.vshtokman.poker.api.Card;
import com.vshtokman.poker.api.Result;

public interface Judge {
	
	public Result calculateBestHand(List<Card> cards);
	
}
