package org.dretez.riichijava.model.logic.ruleset.rules.yaku.local;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

import java.util.Collections;

/**
 * A hand with a single wait where 3 of the waiting tile are already visible on the board (discard pool, open calls or
 * dora indicators)
 */
public class Ketsupaihou implements Yaku {
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
        return Collections.frequency(ctx.visibleTiles(), ctx.winTile()) == 3;
    }

    @Override
    public int han(WinContext ctx) {
        return 1;
    }
}
