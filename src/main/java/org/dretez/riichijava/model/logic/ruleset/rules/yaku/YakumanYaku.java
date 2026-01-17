package org.dretez.riichijava.model.logic.ruleset.rules.yaku;

import org.dretez.riichijava.model.logic.ruleset.rules.yaku.yakuman.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A set of almost all standard yakuman, excluding yakuman with special policies.
 * @see ChuurenKyuumen
 * @see Daisuushii
 * @see SuuankouTanki
 */
public class YakumanYaku {
    private final Set<Yaku> yaku;

    public YakumanYaku() {
        yaku = new HashSet<>(List.of(
                new Chiihou(),
                new Chinroutou(),
                new ChuurenPoutou(),
                new Daisangen(),
                new KokushiMusou(),
                new Ryuuiisou(),
                new Shousuushii(),
                new Suuankou(),
                new Suukantsu(),
                new Tenhou(),
                new Tsuuiisou()
        ));
    }

    public Set<Yaku> yaku() {
        return Collections.unmodifiableSet(yaku);
    }
}
