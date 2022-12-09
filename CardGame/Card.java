package CardGame;

public class Card {
    private Rank rank;
    private Suit suit;
    private boolean isfaceup;
    private static int CARDWIDTH = 30, CARDHEIGHT = 30;

    public Card() {
    }

    public Card(Rank r, Suit s) {
        rank = r;
        suit = s;
        isfaceup = false;
    }

    public void flipCards() {
        isfaceup = true;
    }

    public int getRank() {
        return rank.getRank();
    }

    public String getSuit() {
        return suit.printSuit();
    }

    public String toString() {
        String str = "";
        
        if (isfaceup) {
            str += rank.getRank() + " of " + suit.printSuit();
        }
        
        return str;
    }

    public static int getCardWidth() {
        return CARDWIDTH;
    }
    
    public static int getCardHeight() {
        return CARDHEIGHT;
    }
}