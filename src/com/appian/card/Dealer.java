package com.appian.card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// This class will be responsible for maintaining one deck of cards 
// and changes to that deck
public class Dealer {
	
	// List of Cards in order
	private List<Card> deck;
	
	// Dealer Constructor
	public Dealer() {
		createNewDeck();
	}

	// This method will initialize a new deck of cards
	private void createNewDeck() {
		deck = new ArrayList<Card>();
		CardValue[] allCardValues = CardValue.values();
		CardSuit[] allCardSuits = CardSuit.values();
		
		// Loop through all suits and values to populate the deck with unique cards
		for (int x = 0; x < allCardValues.length; x++) {
			for (int y = 0; y < allCardSuits.length; y++) {
				// Create Card object and add to deck
				Card card = new Card(allCardValues[x], allCardSuits[y]);
				deck.add(card);
			}
		}
	}

	// This method will rearrange the cards in the deck
	public void shuffle() {
		
		Random random = new Random();
		int size = getCardCount();
		
		// Loop through deck of cards and swap indices in the ArrayList of Cards
		for (int oldIndex = 0; oldIndex < size; oldIndex++) {
			
			// Get index to be swapped
			int newIndex = oldIndex + random.nextInt(size - oldIndex);
			
			if (newIndex != oldIndex) {
				// Swap card indices in the deck
				Card tempCard = deck.get(oldIndex);
				deck.set(oldIndex, deck.get(newIndex));
				deck.set(newIndex, tempCard);
			}
			
		}
	}

	// Get number of cards left in the deck
	public int getCardCount() {
		if (deck != null) {
			return deck.size();
		} else {
			return 0;
		}
	}

	// Remove and return one card from the deck or null if empty
	public Card dealOneCard() {
		if (deck != null && getCardCount() > 0) {
			return deck.remove(0);
		} else {
			return null;
		}
	}

}
