package org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * Scored when a hand has two "{@code Iipeikou}". In other words, it is scored when the hand is closed and has four
 * sequences, with two sequences sharing identical suit/numbers with each other, and the other two sequences also
 * sharing the same suit/numbers.
 * @see Iipeikou
 */
public class Ryanpeikou implements Yaku {
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
        return 3;
    }
}
