package org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * Similar to {@code Tenhou}. Scored by a non-dealer completing the hand on the first tile draw. In addition, any tile
 * call made by any player will invalidate chiihou. Any combination of 14 tiles that can win can score {@code Chiihou}.
 * Declaring kan (or kita in sanma) will invalidate the yakuman. By definition, {@code Chiihou} can only win by tsumo.
 * @see Tenhou
 */
public class Chiihou implements Yaku {
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
