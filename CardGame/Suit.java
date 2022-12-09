package CardGame;
public enum Suit {
    HEARTS("\u2665"), SPADES("\u2660"), DIAMONDS("\u2666"), CLUBS("\u2663");


private final String suitText;

// Constructor
private Suit(String suitText) {
    this.suitText = suitText;
}

// Public Method
public String printSuit() {
    return suitText;
}
}