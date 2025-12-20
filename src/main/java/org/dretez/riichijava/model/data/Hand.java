package org.dretez.riichijava.model.data;

import org.dretez.riichijava.model.data.tiles.Tile;
import org.dretez.riichijava.model.data.tiles.comparators.TileComparator;

import java.util.ArrayList;

public class Hand {
    private final ArrayList<Tile> tiles;

    public Hand() {
        this.tiles = new ArrayList<>(14);
    }

    public void draw(Tile tile) {
        tiles.add(tile);
    }

    public Tile discard(int idx) {
        return tiles.remove(idx);
    }

    public void sort() {
        tiles.sort(new TileComparator());
    }
}
