package org.dretez.riichijava.model.logic.ruleset.rules.yaku.local;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;
import org.dretez.riichijava.model.data.common.Wind;
import org.dretez.riichijava.model.data.tile.HonourTile;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard.Chiitoitsu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * A Chiitoitsu hand (seven pairs) containing pairs of all 4 winds.
 * @see Chiitoitsu
 */
public class SuushiChiitoitsu implements Yaku {
    private static final List<HonourTile> winds = Arrays.stream(Wind.values()).map(HonourTile::new).toList();

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
        // Check if hand is chiitoitsu
        return new HashSet<>(hand.tiles()).containsAll(winds);
    }

    @Override
    public int han(WinContext ctx) {
        return 1;
    }
}
