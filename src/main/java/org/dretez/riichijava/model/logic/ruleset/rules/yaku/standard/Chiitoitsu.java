package org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman.KokushiMusou;

/**
 * Scored when a hand has seven pairs. It is one of the two exceptions to the "four melds and one pair" rule for
 * winning hands, the other being {@code KokushiMusou}. Because the hand does not use melds, it can only be closed.
 * @see KokushiMusou
 */
public class Chiitoitsu implements Yaku {
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
        return ctx.closedHand();
    }

    @Override
    public int han(WinContext ctx) {
        return 2;
    }
}
