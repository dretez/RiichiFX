package org.dretez.riichijava.model.logic.ruleset.rules.yaku.local;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;
import org.dretez.riichijava.model.data.tile.Dragon;
import org.dretez.riichijava.model.data.tile.HonourTile;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard.Chiitoitsu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * A {@code Chiitoitsu} hand (seven pairs) containing pairs of all 3 dragons.
 * @see Chiitoitsu
 */
public class SangenChiitoitsu implements Yaku {
    private static final List<HonourTile> dragons = Arrays.stream(Dragon.values()).map(HonourTile::new).toList();

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
        return new HashSet<>(hand.tiles()).containsAll(dragons);
    }

    @Override
    public int han(WinContext ctx) {
        return 1;
    }
}
