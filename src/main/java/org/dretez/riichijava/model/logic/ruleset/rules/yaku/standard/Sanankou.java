package org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman.Suuankou;

/**
 * Scored when the hand has three concealed triplets (ankou). A concealed kan counts as a concealed triplet.
 * <p></p>
 * The third triplet may not be completed off another player's discard (ron), as the triplet would not be "concealed".
 * However, the third triplet may be completed by tsumo. Note that {@code Sanankou} and the related {@code Suuankou} are
 * the only two yaku that care whether the tile group is closed; all other yaku only check if the hand itself is closed.
 * @see Suuankou
 */
public class Sanankou implements Yaku {
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
