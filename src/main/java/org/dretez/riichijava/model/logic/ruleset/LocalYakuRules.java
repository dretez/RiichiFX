package org.dretez.riichijava.model.logic.ruleset;

import org.dretez.riichijava.model.logic.ruleset.local_yaku.*;

public record LocalYakuRules(TsubameGaeshiRule tsubameGaeshi,
                             ShiiaruRaotaiRule shiiaruRaotai,
                             KanfuriRule kanfuri,
                             SangenChiitoitsuRule sangenChiitoitsu,
                             SuushiChiitoitsuRule suushiChiitoitsu,
                             UushinTsuukanRule uushinTsuukan,
                             KetsupaihouRule ketsupaihou,
                             ToipuutaoRule toipuutao) {
    public static final LocalYakuRules defaultRules = new LocalYakuRules(
            TsubameGaeshiRule.DISALLOW,
            ShiiaruRaotaiRule.DISALLOW,
            KanfuriRule.DISALLOW,
            SangenChiitoitsuRule.DISALLOW,
            SuushiChiitoitsuRule.DISALLOW,
            UushinTsuukanRule.DISALLOW,
            KetsupaihouRule.DISALLOW,
            ToipuutaoRule.DISALLOW
    );
}
