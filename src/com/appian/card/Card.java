package com.appian.card;

public class Card {
	
	private CardValue value;
	private CardSuit suit;
	
	public Card(CardValue v, CardSuit s) {
		this.value = v;
		this.suit = s;
	}
	
	public CardValue getValue() {
		return value;
	}
	public void setValue(CardValue value) {
		this.value = value;
	}
	public CardSuit getSuit() {
		return suit;
	}
	public void setSuit(CardSuit suit) {
		this.suit = suit;
	}
	
	public String toString() {
		return this.value.toString() + " OF " + this.suit.toString();
	}
}
