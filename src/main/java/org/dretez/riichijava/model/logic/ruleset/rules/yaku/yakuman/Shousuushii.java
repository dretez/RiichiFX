package org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * Scored by having triplets/quads of three winds, and a pair of the last wind.
 */
public class Shousuushii implements Yaku {
    @Override
    public boolean isYakuman() {
        return true;
    }

    @Override
    public boolean isDoubleYakuman() {
        return false;
    }

    @Override
    public boolean matches(Hand hand, WinContext ctx) {
        // TODO
        return false;
    }

    @Override
    public int han(WinContext ctx) {
        return 0;
    }
}
