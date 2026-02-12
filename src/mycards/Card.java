package mycards;

public class Card {
    // These constants make it easy to identify suits
    public final static int SPADES = 0;   
    public final static int HEARTS = 1;
    public final static int DIAMONDS = 2;
    public final static int CLUBS = 3;

    public final static int ACE = 1;      
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;

    private final int suit; 
    private final int value;

    public Card(int theValue, int theSuit) {
        value = theValue;
        suit = theSuit;
    }

    public String toString() {
        String s, v;
        switch (suit) {
            case SPADES: s = "Spades"; break;
            case HEARTS: s = "Hearts"; break;
            case DIAMONDS: s = "Diamonds"; break;
            default: s = "Clubs"; break;
        }
        switch (value) {
            case 1: v = "Ace"; break;
            case 11: v = "Jack"; break;
            case 12: v = "Queen"; break;
            case 13: v = "King"; break;
            default: v = String.valueOf(value); break;
        }
        return v + " of " + s;
    }
}