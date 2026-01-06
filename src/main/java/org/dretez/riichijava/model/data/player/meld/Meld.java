package org.dretez.riichijava.model.data.player.meld;

import org.dretez.riichijava.model.data.tiles.Tile;
import org.dretez.riichijava.model.data.tiles.enums.Wind;

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
