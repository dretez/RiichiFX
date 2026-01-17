package org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * Scored when the player completes the 1-1-1-2-3-4-5-6-7-8-9-9-9 pattern at tenpai, without any duplicate tiles.
 * Calling a kan on the 1 or 9 invalidates the yakuman.
 * @see ChuurenPoutou
 */
public class ChuurenKyuumen implements Yaku {
    private final boolean doubleYakumanPolicy;

    public ChuurenKyuumen(boolean doubleYakumanPolicy) {
        this.doubleYakumanPolicy = doubleYakumanPolicy;
    }

    @Override
    public boolean isYakuman() {
        return true;
    }

    @Override
    public boolean isDoubleYakuman() {
        return doubleYakumanPolicy;
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
