package org.dretez.riichijava.model.logic.ruleset.rules.yaku.local;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.board.meld.Meld;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * A hand with 4 called melds with a single wait for a pair.
 */
public class ShiiaruRaotai implements Yaku {
    public enum ClosedKanPolicy {
        ALLOW,
        DISALLOW
    }

    private final ClosedKanPolicy closedKanPolicy;

    public ShiiaruRaotai(ClosedKanPolicy closedKanPolicy) {
        this.closedKanPolicy = closedKanPolicy;
    }

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
        return hand.melds().size() == 4 && (
                closedKanPolicy == ClosedKanPolicy.ALLOW ||
                hand.melds().stream().allMatch(Meld::isOpen));
    }

    @Override
    public int han(WinContext ctx) {
        return 1;
    }
}
