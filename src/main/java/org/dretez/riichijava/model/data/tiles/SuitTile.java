package org.dretez.riichijava.model.data.tiles;

import java.util.Objects;

public class SuitTile extends Tile implements Comparable<SuitTile> {
    private final Suit suit;
    private final int number;

    private SuitTile(Suit suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    public static SuitTile get(Suit suit, int number) throws IllegalArgumentException {
        if (number < 1 || number > 9)
            throw new IllegalArgumentException("Suit tiles range from 1 to 9 (inclusive), received: " + number);
        return CACHE[suit.ordinal()][number - 1];
    }

    @Override
    public Tile getDora() {
        return get(suit, (number % 9) + 1);
    }

    /* ************************************************************************************************************** */

    @Override
    public int compareTo(SuitTile o) {
        if (suit.compareTo(o.suit) != 0)
            return suit.compareTo(o.suit);
        return Integer.compare(number, o.number);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SuitTile suitTile = (SuitTile) o;
        return number == suitTile.number && suit == suitTile.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, number);
    }

    @Override
    public String toString() {
        return suit + "-" + number;
    }

    /* ************************************************************************************************************** */

    private static final SuitTile[][] CACHE = new SuitTile[Suit.values().length][9];
    static {
        for (Suit suit : Suit.values())
            for (int i = 1; i <= 9; i++)
                CACHE[suit.ordinal()][i - 1] = new SuitTile(suit, i);
    }
}
