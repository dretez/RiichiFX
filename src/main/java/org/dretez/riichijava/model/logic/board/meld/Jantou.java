package org.dretez.riichijava.model.logic.board.meld;

import org.dretez.riichijava.model.data.tile.Tile;

import java.util.Collections;

/**
 * A pair of equal tiles.
 */
public class Jantou extends Meld {
    public Jantou(Tile tile) {
        super(Collections.nCopies(2, tile), null);
    }
}
