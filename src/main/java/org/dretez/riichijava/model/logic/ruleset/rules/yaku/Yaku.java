package org.dretez.riichijava.model.logic.ruleset.rules.yaku;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;

public interface Yaku {
    boolean isYakuman();
    boolean isDoubleYakuman();
    boolean matches(Hand hand, WinContext ctx);
    int han(WinContext ctx);
}
