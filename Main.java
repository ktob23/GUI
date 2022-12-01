class Main {
  public static void main(String[] args) {
    Card card = new Card();
    Card card2 = new Card(10, "Spades");
    
    System.out.println(card);
    System.out.println(card2);
    System.out.println(card2.compareTo());
  }
}