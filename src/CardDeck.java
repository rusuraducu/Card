import javafx.util.Pair;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

public class CardDeck {

    public static ArrayList<Card> used = new ArrayList<>();
    private static ArrayList<Card> available = myShuffle();

    private static Scanner scanner = new Scanner(System.in);

    public int availableCardCount() {
        return available.size();
    }

    public int usedCardCount() {
        return used.size();
    }
    //Muta cartile extrase in pachetul de baza.
    
    public void shuffle() {
        available.addAll(used);
        used.removeAll(used);
    }

    public void dealCards() {
        System.out.println("Cate carti doresti sa extragi?");
        int no = scanner.nextInt();
        if (no > availableCardCount()) {
            no = availableCardCount();
        }
        System.out.println("Carti extrase: " + no);
        List<Card> toDelete = new ArrayList<>();
        for (int i = 0; i < no; i++) {
            System.out.println(available.get(i));
            used.add(available.get(i));
            toDelete.add(available.get(i));
        }

        for (int n = 0; n < toDelete.size(); n++)
            available.remove(toDelete.get(n));
    }

    public static ArrayList<Card> availableCards() {
        ArrayList<Card> availableCards = new ArrayList<>();
        availableCards.add(new Card("2", "Romb"));
        availableCards.add(new Card("2", "Frunza"));
        availableCards.add(new Card("2", "Inima"));
        availableCards.add(new Card("2", "Trefla"));
        availableCards.add(new Card("3", "Romb"));
        availableCards.add(new Card("3", "Frunza"));
        availableCards.add(new Card("3", "Inima"));
        availableCards.add(new Card("3", "Trefla"));
        availableCards.add(new Card("4", "Romb"));
        availableCards.add(new Card("4", "Frunza"));
        availableCards.add(new Card("4", "Inima"));
        availableCards.add(new Card("4", "Trefla"));
        availableCards.add(new Card("5", "Romb"));
        availableCards.add(new Card("5", "Frunza"));
        availableCards.add(new Card("5", "Inima"));
        availableCards.add(new Card("5", "Trefla"));
        availableCards.add(new Card("6", "Romb"));
        availableCards.add(new Card("6", "Frunza"));
        availableCards.add(new Card("6", "Inima"));
        availableCards.add(new Card("6", "Trefla"));
        availableCards.add(new Card("7", "Romb"));
        availableCards.add(new Card("7", "Frunza"));
        availableCards.add(new Card("7", "Inima"));
        availableCards.add(new Card("7", "Trefla"));
        availableCards.add(new Card("8", "Romb"));
        availableCards.add(new Card("8", "Frunza"));
        availableCards.add(new Card("8", "Inima"));
        availableCards.add(new Card("8", "Trefla"));
        availableCards.add(new Card("9", "Romb"));
        availableCards.add(new Card("9", "Frunza"));
        availableCards.add(new Card("9", "Inima"));
        availableCards.add(new Card("9", "Trefla"));
        availableCards.add(new Card("10", "Romb"));
        availableCards.add(new Card("10", "Frunza"));
        availableCards.add(new Card("10", "Inima"));
        availableCards.add(new Card("10", "Trefla"));
        availableCards.add(new Card("AS", "Romb"));
        availableCards.add(new Card("AS", "Frunza"));
        availableCards.add(new Card("AS", "Inima"));
        availableCards.add(new Card("AS", "Trefla"));
        availableCards.add(new Card("J", "Frunza"));
        availableCards.add(new Card("J", "Inima"));
        availableCards.add(new Card("J", "Trefla"));
        availableCards.add(new Card("J", "Frunza"));
        availableCards.add(new Card("Q", "Inima"));
        availableCards.add(new Card("Q", "Trefla"));
        availableCards.add(new Card("Q", "Frunza"));
        availableCards.add(new Card("Q", "Inima"));
        availableCards.add(new Card("K", "Trefla"));
        availableCards.add(new Card("K", "Trefla"));
        availableCards.add(new Card("K", "Trefla"));
        availableCards.add(new Card("K", "Trefla"));
        availableCards.add(new Card("Joker", "Rosu"));
        availableCards.add(new Card("Joker", "Negru"));
        return availableCards;
    }

    // Am definit o metoda proprie de amesticare a cartilor din pachet.

    private static ArrayList<Card> myShuffle() {
        ArrayList<Card> cards = availableCards();
        ArrayList<Card> shuffle = new ArrayList<>();
        while (cards.size() > 0) {
            int random = new Random().nextInt(cards.size());
            shuffle.add(cards.get(random));
            cards.remove(random);
        }
        return shuffle;
    }
}

