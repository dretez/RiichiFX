package org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * Scored when a hand has four closed triplets and a pair.
 * <p>
 * If the hand is on a shanpon wait (two pairs waiting to complete a triplet), the winning tile must be a self-draw
 * (tsumo) and not a discard from another player (ron). While ron does not open the hand, it does open the resulting
 * triplet, which means the 4th triplet is not closed, invalidating the yakuman.
 * <p>
 * Regardless of the wait, {@code Suuankou} must be scored with a closed hand; none of the triplets can be called from
 * other players' discards. An "all triplet" hand with open calls would then either count for {@code Toitoi},
 * {@code Sanankou}, or both.
 * @see SuuankouTanki
 */
public class Suuankou implements Yaku {
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
