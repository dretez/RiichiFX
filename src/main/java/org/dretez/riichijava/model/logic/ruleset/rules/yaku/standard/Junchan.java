package org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman.Chinroutou;

/**
 * Scored when every tile group and the pair contains at least one terminal tile (either 1/9). At least one non-terminal
 * must be present to score junchan, or the hand would score {@code Chinroutou} instead. It is similar to
 * {@code Chanta}, but {@code Chanta} allows the use of honor tiles.
 * @see Chanta
 * @see Chinroutou
 */
public class Junchan implements Yaku {
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
        return ctx.closedHand() ? 3 : 2;
    }
}
