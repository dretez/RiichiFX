package org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * Scored for completing a group of honor tiles. They come in three classes:
 * <ul>
 *     <li>Dragon tile groups always count for {@code Yakuhai}.</li>
 *     <li>Wind tiles of the round wind count as {@code Yakuhai}.</li>
 *     <li>
 *         Wind tiles of the seat wind also count as {@code Yakuhai}. (If a wind is both the round and seat wind, it is worth 2
 *         han.)
 *     </li>
 * </ul>
 * A wind that is neither round or seat wind is known as an "offwind" or "guest wind"; these are not {@code Yakuhai} and
 * not worth any han, but are still valid tile groups to complete the "4 groups + 1 pair" shape.
 */
public class Yakuhai implements Yaku {
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
        return false;
    }

    @Override
    public int han(WinContext ctx) {
        int yakuhaiGroups = 1; // TODO
        return 1 * yakuhaiGroups;
    }
}
