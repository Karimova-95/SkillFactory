package Tasks.Collections.Card;

import java.util.Objects;

public class Card {

    private String name;
    private String rank;

    public Card(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(name, card.name) && Objects.equals(rank, card.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rank);
    }
}
