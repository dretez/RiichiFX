package org.dretez.riichijava.model.data.tiles;

public sealed interface Tile permits HonourTile, SuitTile {
    Tile getDora();
    Tile prev();
    Tile next();
}
