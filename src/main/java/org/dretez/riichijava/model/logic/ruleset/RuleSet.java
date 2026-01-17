package org.dretez.riichijava.model.logic.ruleset;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.policies.GameContext;
import org.dretez.riichijava.model.logic.game.action.GameAction;
import org.dretez.riichijava.model.logic.ruleset.rules.Score;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;

import java.util.Set;

public interface RuleSet {
    int startingPoints();
    Set<Yaku> allowedYaku();
    Score calculateScore(Hand hand, WinContext context);
    boolean allowsAction(GameAction action, GameContext context);
}
