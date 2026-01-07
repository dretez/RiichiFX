package org.dretez.riichijava.model.logic.ruleset.rules.yaku.local;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

/**
 * Scored for winning off an opponent's discarded tile after they called kan.
 */
public class KanfuriRule implements Yaku {
    @Override
    public boolean isYakuman() {
        return false;
    }

    @Override
    public boolean matches(Hand hand, WinContext context) {
        return false;
    }

    @Override
    public int han(WinContext context) {
        return 1;
    }
}
