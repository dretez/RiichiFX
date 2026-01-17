package org.dretez.riichijava.model.logic.ruleset.policies;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.data.tile.Tile;

public record GameContext(
        Hand hand,
        boolean riichiDeclared,
        Tile actionTile
) {
}
