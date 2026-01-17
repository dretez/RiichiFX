package org.dretez.riichijava.model.logic.ruleset;

import org.dretez.riichijava.model.logic.board.Hand;
import org.dretez.riichijava.model.logic.ruleset.policies.ActionPolicy;
import org.dretez.riichijava.model.logic.ruleset.policies.GameContext;
import org.dretez.riichijava.model.logic.game.action.GameAction;
import org.dretez.riichijava.model.logic.ruleset.policies.KanAfterRiichi;
import org.dretez.riichijava.model.logic.ruleset.rules.Score;
import org.dretez.riichijava.model.logic.ruleset.rules.WinContext;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.StandardYaku;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.Yaku;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.YakumanYaku;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard.NagashiMangan;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman.ChuurenKyuumen;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman.Daisuushii;
import org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman.SuuankouTanki;

import java.util.HashSet;
import java.util.Set;

public class StandardRuleSet implements RuleSet {
    private final Set<Yaku> yaku;
    private final Set<ActionPolicy> actionPolicies;

    public StandardRuleSet() {
        yaku = new HashSet<>();
        actionPolicies = new HashSet<>();

        yaku.addAll(new StandardYaku().yaku());
        yaku.add(new NagashiMangan(NagashiMangan.OpenHandPolicy.ALLOW));
        yaku.addAll(new YakumanYaku().yaku());
        yaku.add(new ChuurenKyuumen(true));
        yaku.add(new Daisuushii(true));
        yaku.add(new SuuankouTanki(true));

        actionPolicies.add(KanAfterRiichi.MUST_KEEP_WAIT);
    }

    @Override
    public int startingPoints() {
        return 25000;
    }

    @Override
    public Set<Yaku> allowedYaku() {
        return yaku;
    }

    @Override
    public Score calculateScore(Hand hand, WinContext context) {
        return null;
    }

    @Override
    public boolean allowsAction(GameAction action, GameContext context) {
        for (ActionPolicy policy : actionPolicies)
            if (!policy.allows(action, context))
                return false;
        return true;
    }
}
