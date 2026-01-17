package org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard.Chiitoitsu;

/**
 * One of the two exceptions to the "four tile groups and one pair" requirement for winning hands, the other being
 * {@code Chiitoitsu}. Kokushi requires having 13 unique terminal/honor tiles, and a duplicate of any one of these tiles.
 * @see Chiitoitsu
 */
public class KokushiMusou implements Yaku {
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
