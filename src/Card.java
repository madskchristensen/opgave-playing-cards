import java.util.Objects;

public class Card {
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
}