package org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * After declaring {@code Riichi}, if the player wins before their next discard, and before anyone makes a tile call,
 * {@code Ippatsu} is scored. You must declare {@code Riichi} to score {@code Ippatsu}, so a hand can never have
 * {@code Ippatsu} by itself.
 * @see Riichi
 */
public class Ippatsu implements Yaku {
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
        return 1;
    }
}
