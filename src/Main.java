import java.util.Scanner;

public class Main {
    private static CardDeck cardDeck = new CardDeck();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
            menu();
            boolean quit = false;
            int value = 0;
            while (quit == false) {
                System.out.println("Introdu un numar... ");
                value = scanner.nextInt();
                scanner.nextLine();
                switch (value) {
                    case 1:
                        cardDeck.dealCards();
                        break;
                    case 2:
                        System.out.printf("3. Dimensiune pachete:\n");
                        System.out.printf("Carti extrase: %d carti.\n", cardDeck.usedCardCount());
                        System.out.printf("Pachet de baza: %d carti.\n", cardDeck.availableCardCount());
                        break;
                    case 3:
                        System.out.println("3. Arata carti extrase.");
                        for (Card c : cardDeck.used) {
                            System.out.println(c);
                        }
                        System.out.println("Carti extrase: " + cardDeck.usedCardCount());
                        break;
                    case 4:
                        cardDeck.shuffle();
                        System.out.println("5. Cartile au fost amestecate! ");
                        break;
                    case 5:
                        menu();
                        break;
                    case 6:
                        quit = true;
                        System.out.println("Programul a fost inchis.");
                }
            }
        }
    private static void menu() {
        System.out.println("1. Extrage carti.\n" +
                "2. Dimensiune pachete.\n" +
                "3. Afiseaza carti extrase.\n" +
                "4. Shuffle! Muta toate cartile in pachetul de baza. \n" +
                "5. Afisare meniu.\n"+
                "6. Inchide program!");
    }
}
