package org.dretez.riichijava.model.logic.board.meld;

import org.dretez.riichijava.model.data.tile.Tile;
import org.dretez.riichijava.model.data.common.Wind;

import java.util.Collections;
import java.util.List;

public abstract class Meld {
    private final List<Tile> tiles;
    private final Wind blame;

    public Meld(List<Tile> tiles, Wind blame) {
        this.tiles = tiles;
        this.blame = blame;
    }

    public boolean isOpen() {
        return blame != null;
    }

    public List<Tile> tiles() {
        return Collections.unmodifiableList(tiles);
    }

    public Wind blame() {
        return blame;
    }

    @Override
    public String toString() {
        return tiles.toString();
    }
}
