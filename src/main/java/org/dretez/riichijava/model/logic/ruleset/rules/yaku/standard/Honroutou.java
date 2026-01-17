package org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman.Chinroutou;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman.Tsuuiisou;

/**
 * Scored when every tile in the hand is either a terminal or an honor tile. The hand must contain at least one honor
 * and one terminal to score {@code Honroutou}; an all honor hand would be {@code Tsuuiisou}, while an all terminal hand
 * would be {@code Chinroutou}.
 * @see Tsuuiisou
 * @see Chinroutou
 */
public class Honroutou implements Yaku {
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
        return 2;
    }
}
