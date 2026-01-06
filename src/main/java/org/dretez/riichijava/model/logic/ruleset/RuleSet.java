package org.dretez.riichijava.model.logic.ruleset;

import org.dretez.riichijava.model.logic.ruleset.rules.KanAfterRiichi;

public record RuleSet(KanAfterRiichi kanAfterRiichi, LocalYakuRules localYaku) {
    public static final RuleSet defaultRules = new RuleSet(KanAfterRiichi.MUST_KEEP_WAIT, LocalYakuRules.defaultRules);
}
