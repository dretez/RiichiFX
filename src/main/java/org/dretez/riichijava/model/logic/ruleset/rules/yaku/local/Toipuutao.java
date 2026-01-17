package org.dretez.riichijava.model.logic.ruleset.rules.yaku.local;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.data.tile.Dragon;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;
import org.dretez.riichijava.model.data.tile.HonourTile;
import org.dretez.riichijava.model.data.tile.SuitType;
import org.dretez.riichijava.model.data.tile.SuitTile;
import org.dretez.riichijava.model.data.tile.Tile;

import java.util.HashSet;
import java.util.List;

/**
 * A hand that only consists of tiles that look the same when turned upside down. That means haku/white dragon, all
 * souzu/sticks tiles except 1, 3 and 7 and all pinfu/dots tiles except for 6 and 7.
 */
public class Toipuutao implements Yaku {
    private static final List<Tile> allowedTiles = List.of(
            new HonourTile(Dragon.WHITE),
            new SuitTile(SuitType.SOUZU, 2),
            new SuitTile(SuitType.SOUZU, 4),
            new SuitTile(SuitType.SOUZU, 5),
            new SuitTile(SuitType.SOUZU, 6),
            new SuitTile(SuitType.SOUZU, 8),
            new SuitTile(SuitType.SOUZU, 9),
            new SuitTile(SuitType.PINZU, 1),
            new SuitTile(SuitType.PINZU, 2),
            new SuitTile(SuitType.PINZU, 3),
            new SuitTile(SuitType.PINZU, 4),
            new SuitTile(SuitType.PINZU, 5),
            new SuitTile(SuitType.PINZU, 8),
            new SuitTile(SuitType.PINZU, 9)
    );

    @Override
    public boolean isYakuman() {
        return false;
    }

    @Override
    public boolean isDoubleYakuman() {
        return false;
    }

    @Override
    public boolean matches(Hand hand, WinContext ctx) {
        return new HashSet<>(allowedTiles).containsAll(hand.tiles());
    }

    @Override
    public int han(WinContext ctx) {
        return 1;
    }
}
