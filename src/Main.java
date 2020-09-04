import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println(deck);
        System.out.println();
        deck.shuffle();
        System.out.println(deck);
        testDraw(deck, 52);
    }

    public static void testDraw(Deck deck, int amountOfDraws) {
        for (int i = 0; i < amountOfDraws; i++) {
            System.out.println("-- DRAW NUMBER " + (i + 1) + " --");
            deck.draw();
            System.out.println("Deck now contains: " + deck);
            System.out.println("Deck size is now: " + deck.cardsRemaining());
            System.out.println();
        }
    }
}
