import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Deck {
    Card cards[];

    public Deck() {
        cards = new Card[52];
    }

    public int cardsRemaining() {
        return cards.length;
    }

    private void removeFirstCard() {
        Card cardsNew[] = new Card[cards.length - 1];

        for(int i = 1; i < cards.length; i++) {
            cardsNew[i - 1] = cards[i];
        }

        cards = cardsNew;
    }

    public void initialize() {
        final Rank[] RANKVALUES = Rank.values();
        final Color[] COLORVALUES = Color.values();
        Random random = new Random();

        for(int i = 0; i < cards.length; i++) {
            final Rank cardRank = RANKVALUES[random.nextInt(RANKVALUES.length)];
            final Color cardColor = COLORVALUES[random.nextInt(COLORVALUES.length)];

            cards[i] = new Card(cardRank, cardColor);
        }
    }

    public void shuffle() {
        Collections.shuffle(Arrays.asList(cards));
    }

    public void draw() {
        System.out.println("You drew [" + cards[0] + "]");
        removeFirstCard();
    }

    @Override
    public String toString() {
        String stringToReturn = "";

        for(int i = 0; i < cards.length; i++) {
            stringToReturn = stringToReturn + "[" + i + "] " + cards[i] + " | ";
        }

        return stringToReturn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck = (Deck) o;
        return Arrays.equals(cards, deck.cards);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(cards);
    }
}
