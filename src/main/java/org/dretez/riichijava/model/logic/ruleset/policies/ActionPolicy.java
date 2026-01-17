package org.dretez.riichijava.model.logic.ruleset.policies;

import org.dretez.riichijava.model.logic.game.action.GameAction;

public interface ActionPolicy {
    boolean allows(GameAction action, GameContext ctx);
}
