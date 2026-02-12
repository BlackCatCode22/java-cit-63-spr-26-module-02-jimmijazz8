package mycards;

public class Driver {
    public static void main(String[] args) {
        // 1. Initialize the deck
        Deck myDeck = new Deck();
        
        // 2. Shuffle the cards
        myDeck.shuffle();
        
        System.out.println("--- Your Hand ---");
        
        // 3. Deal 5 cards using a loop
        for (int i = 0; i < 5; i++) {
            Card dealtCard = myDeck.dealCard();
            System.out.println(dealtCard.toString());
        }
    }
}