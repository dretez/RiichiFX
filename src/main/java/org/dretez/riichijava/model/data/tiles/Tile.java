package org.dretez.riichijava.model.data.tiles;

/**
 * Represents a Mahjong tile.
 */
public sealed interface Tile permits HonourTile, SuitTile {
    /**
     * Interprets the Dora using this {@code Tile} as the Dora indicator.
     *
     * @return Dora {@code Tile}
     */
    Tile getDora();

    /**
     * @return Previous {@code Tile} in the sequence
     */
    Tile prev();

    /**
     * @return Next {@code Tile} in the sequence
     */
    Tile next();
}
