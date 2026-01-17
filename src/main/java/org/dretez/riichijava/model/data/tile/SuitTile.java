package org.dretez.riichijava.model.data.tile;

/**
 * Represents a Suit tile in a Mahjong set.
 * <p>
 * A Suit tile is represented by a number ranging from 1 to 9, and by one of three Suits: Pinzu/Dots, Souzu/Sticks and
 * Manzu/Characters.
 */
public record SuitTile(SuitType suit, int number) implements Tile {
    public SuitTile {
        if (number < 1 || number > 9)
            throw new IllegalArgumentException("Suit tiles range from 1 to 9, received: " + number);
    }

    @Override
    public TileType type() {
        return suit;
    }
}
