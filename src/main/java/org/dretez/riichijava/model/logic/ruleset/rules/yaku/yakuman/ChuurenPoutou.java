package org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * Scored when a hand contains the 13-tile pattern of: 1-1-1-2-3-4-5-6-7-8-9-9-9 of the same suit, plus any one tile
 * from the same suit. In addition, the hand must be closed. Calling a kan on the 1 or 9 invalidates the yakuman.
 * @see ChuurenKyuumen
 */
public class ChuurenPoutou implements Yaku {
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
