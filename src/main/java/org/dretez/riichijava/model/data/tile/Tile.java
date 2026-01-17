package org.dretez.riichijava.model.data.tile;

/**
 * Represents a Mahjong tile.
 */
public sealed interface Tile permits HonourTile, SuitTile {
    TileType type();
}
