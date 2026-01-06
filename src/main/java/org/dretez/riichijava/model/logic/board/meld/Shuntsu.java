package org.dretez.riichijava.model.logic.board.meld;

import org.dretez.riichijava.model.logic.tile.Tile;
import org.dretez.riichijava.model.logic.tile.TileComparator;
import org.dretez.riichijava.model.logic.common.Wind;
import org.dretez.riichijava.model.exceptions.IllegalTileCallException;

import java.util.ArrayList;
import java.util.List;

/**
 * A tile meld composed of a sequence of 3 tiles.
 */
public class Shuntsu extends Meld {
    private Shuntsu(List<Tile> tiles, Wind blame) {
        super(tiles, blame);
    }

    public static Shuntsu factory(List<Tile> tiles, Wind blame) throws IllegalTileCallException {
        if (tiles.size() != 3)
            throw new IllegalTileCallException("A sequence must contain exactly 3 tiles, provided: " + tiles.size());
        List<Tile> meld = new ArrayList<>(tiles);
        meld.sort(TileComparator.get());
        for (int i = 0; i < meld.size() - 1; i++)
            if (meld.get(i) == meld.get(i + 1) || meld.get(i).next() != meld.get(i + 1))
                throw new IllegalTileCallException("Cannot form a sequence with tiles " + meld);
        return new Shuntsu(meld, blame);
    }

    public static Shuntsu factory(List<Tile> tiles) throws IllegalTileCallException {
        return factory(tiles, null);
    }
}
