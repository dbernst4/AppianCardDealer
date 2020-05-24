package com.appian.card;

// This is a test program for Appian written by Dan Bernstein 5/23/20
// This Java Application will create, shuffle, then deal a deck of cards
public class Main {

	// Main Method
	public static void main(String[] args) {
		
		// Create Dealer and Shuffle Cards
		Dealer dealer = new Dealer();
		dealer.shuffle();
		
		int size = dealer.getCardCount();
		
		// Loop through deck of cards and deal cards one at a time
		for (int x = 0; x < size; x++) {
			Card card = dealer.dealOneCard();
			
			// Print to console
			if (card != null) {
				System.out.println((x + 1) + ". " + card.toString());
			} else {
				System.out.println("No Cards Left");
			}
		}
		
	}

}
