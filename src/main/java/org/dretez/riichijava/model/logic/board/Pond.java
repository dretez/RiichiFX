package org.dretez.riichijava.model.logic.board;

import org.dretez.riichijava.model.data.tile.Tile;

import java.util.ArrayList;

public class Pond {
    private final ArrayList<Tile> tiles;

    public Pond() {
        this.tiles = new ArrayList<>();
    }

    public void discard(Tile tile) {
        tiles.addLast(tile);
    }

    public Tile getLastDiscard() {
        return tiles.getLast();
    }
}
