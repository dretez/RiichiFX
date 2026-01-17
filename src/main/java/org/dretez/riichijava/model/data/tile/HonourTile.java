package org.dretez.riichijava.model.data.tile;

public record HonourTile(HonourType honour) implements Tile {
    @Override
    public HonourType type() {
        return honour;
    }
}
