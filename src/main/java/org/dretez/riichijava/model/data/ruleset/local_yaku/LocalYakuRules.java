package org.dretez.riichijava.model.data.ruleset.local_yaku;

public record LocalYakuRules(TsubameGaeshi tsubameGaeshi,
                             ShiiaruRaotai shiiaruRaotai,
                             Kanfuri kanfuri) {
    public static final LocalYakuRules defaultRules = new LocalYakuRules(
            TsubameGaeshi.DISALLOW,
            ShiiaruRaotai.DISALLOW,
            Kanfuri.DISALLOW);
}
