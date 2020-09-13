import java.util.Iterator;
import java.util.Objects;

public class Card implements Comparable<Card> {
    Rank rank;
    Color color;

    public Card(Rank rank, Color color) {
        this.rank = rank;
        this.color = color;
    }

    @Override
    public String toString() {
        return rank + " of " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank &&
                color == card.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, color);
    }

    public int compareTo(Card other) {
        if(this.color.compareTo(other.color) != 0) {
            return this.color.compareTo(other.color);
        }
        else if(this.rank.compareTo(other.rank) != 0) {
            return this.rank.compareTo(other.rank);

            // kort er ens
        } else {
            return 0;
        }
    }
}