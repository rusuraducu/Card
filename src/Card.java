public class Card {
    String number;
    String suit;

    public Card(String number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    public String getNumber() {
        return number;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "Carte: " +
                " " + number +
                " de '" + suit + '\'' ;
    }

}

    //You should also define a Card class to remember the individual cards. This should have 2
       // properties: number (2 - 14) and suit (diamonds (♦), clubs (♣), hearts (♥) and spades (♠) ).
