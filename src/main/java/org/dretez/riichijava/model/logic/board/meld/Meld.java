package org.dretez.riichijava.model.logic.board.meld;

import org.dretez.riichijava.model.logic.tile.Tile;
import org.dretez.riichijava.model.logic.common.Wind;

import java.util.List;

public abstract class Meld {
    private final boolean open;
    private final List<Tile> tiles;
    private final Wind blame;

    public Meld(List<Tile> tiles, Wind blame) {
        this.open = true;
        this.tiles = tiles;
        this.blame = blame;
    }

    public boolean isOpen() {
        return open;
    }

    public List<Tile> tiles() {
        return tiles;
    }

    public Wind blame() {
        return blame;
    }

    @Override
    public String toString() {
        return tiles.toString();
    }
}
