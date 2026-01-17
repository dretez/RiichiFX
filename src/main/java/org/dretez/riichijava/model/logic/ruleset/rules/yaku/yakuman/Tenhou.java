package org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * Similar to {@code Chiihou}. Scored by the dealer completing the hand on the first tile draw. In other words, the hand
 * wins before the first tile discard. Any combination of 14 tiles that can win can score {@code Tenhou}. Declaring kan
 * (or kita in sanma) will invalidate the yakuman. By definition, {@code Tenhou} can only win by tsumo.
 * @see Chiihou
 */
public class Tenhou implements Yaku {
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
