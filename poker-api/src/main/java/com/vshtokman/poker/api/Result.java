package com.vshtokman.poker.api;

import java.util.List;

public class Result {
	private List<Card> bestSet;
	private String description;
	private HandTitle title;
	private int points;

	public Result(List<Card> bestSet, HandTitle title, String description, int points) {
		this.bestSet = bestSet;
		this.title = title;
		this.description = description;
		this.points = points;
	}

	public List<Card> getBestSet() {
		return bestSet;
	}

	public HandTitle getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}

	public int getPoints() {
		return points;
	}
	
	public enum HandTitle {
		HIGH_CARD,
		PAIR,
		TWO_PAIR,
		THREE_OF_A_KIND,
		STRAIGHT,
		FLUSH,
		FULL_HOUSE,
		FOUR_OF_A_KIND,
		STRAIGHT_FLUSH,
		ROYAL_FLUSH,
	}
}
