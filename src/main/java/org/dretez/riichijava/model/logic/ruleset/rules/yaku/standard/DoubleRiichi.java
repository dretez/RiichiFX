package org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * A special case for {@code Riichi} on the first turn. If the player reaches tenpai before discarding (i.e., within the
 * first 14 tiles), and before anyone has made a tile call, then {@code Riichi} will automatically be converted into
 * {@code DoubleRiichi}.
 * @see Riichi
 */
public class DoubleRiichi implements Yaku {
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
