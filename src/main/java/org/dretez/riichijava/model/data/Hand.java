package org.dretez.riichijava.model.data;

import org.dretez.riichijava.model.data.tiles.Tile;
import org.dretez.riichijava.model.data.tiles.comparators.TileComparator;

import java.util.ArrayList;

public class Hand {
    private final ArrayList<Tile> tiles;
    private boolean open;

    private static final TileComparator sorter = new TileComparator();

    public Hand() {
        this.tiles = new ArrayList<>(14);
        this.open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public void draw(Tile tile) {
        tiles.add(tile);
    }

    public Tile discard(int idx) {
        return tiles.remove(idx);
    }

    public void pon(Tile tile) {
        // TODO
        open = true;
    }

    public void chi(Tile tile) {
        // TODO
        open = true;
    }

    public void ankan(Tile tile) {
        // TODO
        open = true;
    }

    public void daiminkan(Tile tile) {
        // TODO
        open = true;
    }

    public void shouminkan(Tile tile) {
        // TODO
        open = true;
    }

    public boolean discard(Tile tile) {
        return tiles.remove(tile);
    }

    public void sort() {
        tiles.sort(sorter);
    }
}
