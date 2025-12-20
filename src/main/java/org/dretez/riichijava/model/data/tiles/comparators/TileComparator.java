package org.dretez.riichijava.model.data.tiles.comparators;

import org.dretez.riichijava.model.data.tiles.HonourTile;
import org.dretez.riichijava.model.data.tiles.SuitTile;
import org.dretez.riichijava.model.data.tiles.Tile;

import java.util.Comparator;

public class TileComparator implements Comparator<Tile> {
    @Override
    public int compare(Tile o1, Tile o2) {
        if (o1 instanceof SuitTile && o2 instanceof HonourTile<?>) return -1;
        if (o1 instanceof HonourTile<?> && o2 instanceof SuitTile) return 1;
        if (o1 instanceof SuitTile && o2 instanceof SuitTile)
            return ((SuitTile) o1).compareTo((SuitTile) o2);
        if (o1 instanceof HonourTile<?> && o2 instanceof HonourTile<?>)
            return ((HonourTile<?>) o1).compareTo((HonourTile<?>) o2);
        return 0;
    }
}
