package org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * Scored when a closed hand gains no fu from its composition at tenpai or wait pattern. In other words, it would only
 * gain the base 20 fu and fu from the win method. It can only be scored by closed hands.
 */
public class Pinfu implements Yaku {
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
