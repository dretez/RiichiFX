package org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * Scored when a hand has four closed triplets with a tanki wait, i.e. it has completed the four triplets by tenpai.
 * The hand may win from another player's discard, counting for a yakuman. A hand of this pattern may count double
 * yakuman, as an added variation.
 * <p>
 * Regardless of the wait, {@code Suuankou} must be scored with a closed hand; none of the triplets can be called from
 * other players' discards. An "all triplet" hand with open calls would then either count for {@code Toitoi},
 * {@code Sanankou}, or both.
 * @see SuuankouTanki
 */
public class SuuankouTanki implements Yaku {
    private final boolean doubleYakumanPolicy;

    public SuuankouTanki(boolean doubleYakumanPolicy) {
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
