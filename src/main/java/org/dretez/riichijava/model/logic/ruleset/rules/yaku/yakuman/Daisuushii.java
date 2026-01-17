package org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * Scored by having triplets/quads of all four winds.
 */
public class Daisuushii implements Yaku {
    private final boolean doubleYakumanPolicy;

    public Daisuushii(boolean doubleYakumanPolicy) {
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
