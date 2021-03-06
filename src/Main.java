public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();

        /*
        System.out.println(deck);
        testCompareTo(deck);
        testDraw(deck, 52);
         */

        testIterator(deck);
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

    public static void testCompareTo(Deck deck) {
        for (int i = 0; i < deck.cardsRemaining() - 1; i++) {
            System.out.println("-- TEST NUMBER " + (i + 1) + " --");
            Card card = deck.getCards()[i];
            Card card2 = deck.getCards()[i + 1];

            System.out.println("Card 1 = " + card);
            System.out.println("Card 2 = " + card2);

            System.out.println("Resultat = " + card.compareTo(card2) + "\n");
        }
    }

    public static void testIterator(Deck deck) {
        int i = 0;

        for(Card card : deck) {
            System.out.println("Card " + "[" + i + "] " + card);
            i++;
        }
    }
}
