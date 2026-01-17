package org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * Scored when the hand only has numbered tiles 2-8. In other words, the hand cannot contain terminal tiles (1 and 9) or
 * honor tiles.
 */
public class Tanyao implements Yaku {
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
        // TODO
        return false;
    }

    @Override
    public int han(WinContext ctx) {
        return 1;
    }
}
