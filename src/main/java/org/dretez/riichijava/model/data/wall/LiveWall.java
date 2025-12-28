package org.dretez.riichijava.model.data.wall;

import org.dretez.riichijava.model.data.tiles.Tile;
import org.dretez.riichijava.model.exceptions.EmptyWallDrawException;

import java.util.List;

public class LiveWall {
    private final List<Tile> tiles;

    public LiveWall(List<Tile> tiles) {
        this.tiles = tiles;
    }

    public Tile draw() {
        try {
            return tiles.removeFirst();
        } catch (Exception e) {
            throw new EmptyWallDrawException(e);
        }
    }
}
