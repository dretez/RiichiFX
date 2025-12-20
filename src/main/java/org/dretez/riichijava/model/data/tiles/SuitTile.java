package org.dretez.riichijava.model.data.tiles;

public class SuitTile extends Tile implements Comparable<SuitTile> {
    private final Suit suit;
    private final int number;

    public SuitTile(Suit suit, int number) throws IllegalArgumentException{
        if (number < 1 || number > 9)
            throw new IllegalArgumentException("Suit tiles range from 1 to 9 (inclusive), received: " + number);
        this.suit = suit;
        this.number = number;
    }

    @Override
    public Tile getDora() {
        return new SuitTile(this.suit, (this.number % 9) + 1);
    }

    @Override
    public int compareTo(SuitTile o) {
        if (suit.compareTo(o.suit) != 0)
            return suit.compareTo(o.suit);
        return Integer.compare(number, o.number);
    }
}
