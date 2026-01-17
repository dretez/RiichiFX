package org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * Scored when a hand has two identical sequences (two sequences with the same number and suit). It also requires the
 * hand to be closed.
 * <p></p>
 * If a hand has two {@code Iipeikou}, it instead scores {@code Ryanpeikou}.
 * @see Ryanpeikou
 */
public class Iipeikou implements Yaku {
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
        return 1;
    }
}
