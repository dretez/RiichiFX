package org.dretez.riichijava.model.logic.tile;

import org.dretez.riichijava.model.data.tile.HonourTile;
import org.dretez.riichijava.model.data.tile.SuitTile;
import org.dretez.riichijava.model.data.tile.Tile;

import java.util.Comparator;

public class TileOrder implements Comparator<Tile> {
    private final static TileOrder instance = new TileOrder();

    private TileOrder() {}

    @Override
    public int compare(Tile o1, Tile o2) {
        if (o1 instanceof SuitTile s1 && o2 instanceof SuitTile s2) {
            int suitComp = s1.suit().compareTo(s2.suit());
            return suitComp != 0 ? suitComp : Integer.compare(s1.number(), s2.number());
        }
        if (o1 instanceof HonourTile h1 && o2 instanceof HonourTile h2) {
            return HonourOrder.compareHonours(h1.honour(), h2.honour());
        }
        return o1 instanceof SuitTile ? -1 : 1;
    }

    public static int compareTiles(Tile o1, Tile o2) {
        return instance.compare(o1, o2);
    }

    public static TileOrder instance() {
        return instance;
    }
}
