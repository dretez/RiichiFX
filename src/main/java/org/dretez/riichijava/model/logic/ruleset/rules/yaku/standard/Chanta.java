package org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * Scored when every tile group and the pair contains at least one terminal / honor tile. The hand must contain at least
 * one honor and one non-terminal tile to score {@code Chanta}, or it would score the more valuable {@code Junchan} or
 * {@code Honroutou} instead.
 * @see Junchan
 * @see Honroutou
 */
public class Chanta implements Yaku {
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
        return ctx.closedHand() ? 2 : 1;
    }
}
