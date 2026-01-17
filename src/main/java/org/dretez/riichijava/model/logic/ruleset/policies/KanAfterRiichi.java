package org.dretez.riichijava.model.logic.ruleset.policies;

import org.dretez.riichijava.model.logic.game.action.GameAction;

public enum KanAfterRiichi implements ActionPolicy {
    DISALLOW,
    MUST_KEEP_STRUCTURE,
    MUST_KEEP_WAIT;

    @Override
    public boolean allows(GameAction action, GameContext ctx) {
        return action != GameAction.KAN || !ctx.riichiDeclared() || switch (this) {
            case DISALLOW -> false;
            case MUST_KEEP_STRUCTURE -> false; // TODO
            case MUST_KEEP_WAIT -> false; // TODO
        };
    }
}
