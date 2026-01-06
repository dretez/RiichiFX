package org.dretez.riichijava.model.logic.board.meld;

import org.dretez.riichijava.model.logic.tile.Tile;
import org.dretez.riichijava.model.logic.common.Wind;

import java.util.Collections;

/**
 * A tile meld composed of 3 instances of the same tile, also known as a triplet.
 */
public class Koutsu extends Meld {
    public Koutsu(Tile tile, Wind blame) {
        super(Collections.nCopies(3, tile), blame);
    }

    public Koutsu(Tile tile) {
        this(tile, null);
    }

    public Meld promote() {
        return new Kantsu(tiles().getFirst(), blame(), true);
    }
}
