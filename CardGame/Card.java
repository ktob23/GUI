package CardGame;

public class Card {
    private Rank rank;
    private Suit suit;
    private boolean isfaceup;

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
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return "Suit: " + suit + "\nRank: " + rank;
    }

    public String toString() {
        string str = "";
        
        if (isfaceup) {
            str += rank.getValue() + " of " + suit.printSuit();
        }
        
        return str;
    }
}