package org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman.Daisangen;

/**
 * Scored when a hand has two triplets of dragons and a pair of the third dragon.
 * <p></p>
 * It is related to the yakuman called {@code Daisangen} ("big three dragons"), which requires three triplets of dragons.
 * @see Daisangen
 */
public class Shousangen implements Yaku {
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
