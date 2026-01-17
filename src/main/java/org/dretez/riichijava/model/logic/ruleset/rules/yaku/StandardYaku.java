package org.dretez.riichijava.model.logic.ruleset.rules.yaku;

import org.dretez.riichijava.model.logic.ruleset.rules.yaku.standard.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A set of almost all standard yaku, excluding yaku with special policies.
 * @see NagashiMangan
 */
public class StandardYaku {
    private final Set<Yaku> yaku;

    public StandardYaku() {
        yaku = new HashSet<>(List.of(
                new Chankan(),
                new Chanta(),
                new Chiitoitsu(),
                new Chinitsu(),
                new DoubleRiichi(),
                new HaiteiRaoyue(),
                new HoiteiRaoyui(),
                new Honitsu(),
                new Honroutou(),
                new Iipeikou(),
                new Ippatsu(),
                new Ittsuu(),
                new Junchan(),
                new MenzenTsumo(),
                new Pinfu(),
                new Riichi(),
                new RinshanKaihou(),
                new Ryanpeikou(),
                new Sanankou(),
                new Sankantsu(),
                new SanshokuDoujun(),
                new Shousangen(),
                new Tanyao(),
                new Toitoi(),
                new Yakuhai()
        ));
    }

    public Set<Yaku> yaku() {
        return Collections.unmodifiableSet(yaku);
    }
}
