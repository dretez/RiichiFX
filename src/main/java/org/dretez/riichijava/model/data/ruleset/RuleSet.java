package org.dretez.riichijava.model.data.ruleset;

import org.dretez.riichijava.model.data.ruleset.local_yaku.LocalYakuRules;
import org.dretez.riichijava.model.data.ruleset.rules.KanAfterRiichi;

public record RuleSet(KanAfterRiichi kanAfterRiichi, LocalYakuRules localYaku) {
    public static final RuleSet defaultRules = new RuleSet(KanAfterRiichi.MUST_KEEP_WAIT, LocalYakuRules.defaultRules);
}
