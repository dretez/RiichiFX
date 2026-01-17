package org.dretez.riichijava.model.logic.ruleset.rules.yaku.local;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.board.WaitType;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;
import org.dretez.riichijava.model.data.tile.SuitTile;

/**
 * An Ittsu hand with a kanchan (middle sequence wait) for a 5 on the straight suit.
 * <p>
 * For example: {@code 6-man} {@code 6-man} {@code 7-man} {@code 8-man} {@code 9-man} {@code 1-sou}
 * {@code 2-sou} {@code 3-sou} {@code 4-sou} {@code 6-sou} {@code 7-sou} {@code 8-sou} {@code 9-sou},
 * wait: {@code 5-sou}
 */
public class UushinTsuukan implements Yaku {
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
        return ctx.winTile() instanceof SuitTile s &&
                s.number() == 5 &&
                ctx.waitType() == WaitType.KANCHAN;
    }

    @Override
    public int han(WinContext ctx) {
        return 1;
    }
}
