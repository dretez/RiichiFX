package org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.WinType;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * Scored when a closed hand wins with a self-drawn tile - in other words, a menzen hand winning from a tsumo call.
 */
public class MenzenTsumo implements Yaku {
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
        return ctx.winType() == WinType.TSUMO && ctx.closedHand();
    }

    @Override
    public int han(WinContext ctx) {
        return 1;
    }
}
