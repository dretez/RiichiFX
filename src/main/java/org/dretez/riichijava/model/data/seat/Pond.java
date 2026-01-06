package org.dretez.riichijava.model.data.seat;

import org.dretez.riichijava.model.data.tiles.Tile;

import java.util.ArrayList;

public class Pond {
    private final ArrayList<Tile> tiles;

    public Pond() {
        this.tiles = new ArrayList<>();
    }

    public void discard(Tile tile) {
        tiles.addLast(tile);
    }

    public Tile steal() {
        return tiles.getLast();
    }
}
