package org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * A special yaku. Unlike other yaku, it is scored based off your discards, rather than the hand itself.
 * <p></p>
 * In order to score nagashi mangan:
 * <ul>
 *   <li>The hand must play all the way to exhaustive draw, meaning no one can win before all the tiles have been drawn.</li>
 *   <li>Every discard of the player must be a terminal or an honor tile.</li>
 *   <li>No tiles may have been called from the player's own discard pile.</li>
 *   <li>In some rulesets, the player's own hand must be closed to score nagashi mangan.</li>
 * </ul>
 */
public class NagashiMangan implements Yaku {
    public enum OpenHandPolicy {
        ALLOW,
        DISALLOW
    }

    private final OpenHandPolicy openHandPolicy;

    public NagashiMangan(OpenHandPolicy openHandPolicy) {
        this.openHandPolicy = openHandPolicy;
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
        // TODO
        return !(this.openHandPolicy == OpenHandPolicy.DISALLOW && !ctx.closedHand());
    }

    @Override
    public int han(WinContext ctx) {
        return 5; // Mangan
    }
}
