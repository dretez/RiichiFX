package org.dretez.riichijava.model.data.player.meld;

import org.dretez.riichijava.model.data.tiles.Tile;
import org.dretez.riichijava.model.data.tiles.enums.Wind;

import java.util.ArrayList;

public class Meld {
    private final boolean open;
    private final ArrayList<Tile> tiles;

    public Meld(boolean open, ArrayList<Tile> tiles) {
        this.open = open;
        this.tiles = tiles;
    }

    public Meld(ArrayList<Tile> tiles) {
        this(false, tiles);
    }

    public boolean isOpen() {
        return open;
    }

    @Override
    public String toString() {
        return tiles.toString();
    }
}
