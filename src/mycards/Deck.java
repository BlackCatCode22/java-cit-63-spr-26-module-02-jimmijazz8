package mycards;

public class Deck {

    // Line 5: Correctly using the Card class as a type
    private Card[] deck; 
    private int cardsUsed;

    public Deck() {
        // Initialize the array to hold 52 Card objects
        deck = new Card[52];
        int cardCt = 0; 
        for ( int suit = 0; suit <= 3; suit++ ) {
            for ( int value = 1; value <= 13; value++ ) {
                // This calls the constructor in your Card.java
                deck[cardCt] = new Card(value, suit);
                cardCt++;
            }
        }
        cardsUsed = 0;
    }

    public void shuffle() {
        // Randomly swaps cards in the array
        for ( int i = 51; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;
    }

    public Card dealCard() {
        if (cardsUsed == 52)
            throw new IllegalStateException("No cards left.");
        cardsUsed++;
        return deck[cardsUsed - 1];
    }
}
