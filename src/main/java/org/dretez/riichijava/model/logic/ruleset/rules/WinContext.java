package org.dretez.riichijava.model.logic.ruleset.rules;

import org.dretez.riichijava.model.logic.board.WaitType;
import org.dretez.riichijava.model.data.common.Wind;
import org.dretez.riichijava.model.data.tile.Tile;

import java.util.List;

public record WinContext (
        Tile winTile,
        WinType winType,
        WaitType waitType,
        Wind seatWind,
        Wind roundWind,
        List<Tile> visibleTiles,
        List<Tile> dora,
        List<Tile> uraDora,
        boolean closedHand,
        boolean riichi,
        boolean doubleRiichi
) {
}
