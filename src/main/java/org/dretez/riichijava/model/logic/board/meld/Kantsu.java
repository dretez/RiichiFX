package org.dretez.riichijava.model.logic.board.meld;

import org.dretez.riichijava.model.logic.tile.Tile;
import org.dretez.riichijava.model.logic.common.Wind;

import java.util.Collections;

/**
 * A special tile meld composed of 4 instances of the same tile, also known as a quad.
 * <p>
 * In order for a quad to be considered as a proper meld, it must be declared via a "Kan" call.
 */
public class Kantsu extends Meld {
    private final boolean promoted;

    Kantsu(Tile tile, Wind blame, boolean promoted) {
        super(Collections.nCopies(4, tile), blame);
        this.promoted = promoted;
    }

    public Kantsu(Tile tile, Wind blame) {
        this(tile, blame, false);
    }

    public Kantsu(Tile tile) {
        this(tile, null);
    }

    public boolean isPromoted() {
        return promoted;
    }
}
