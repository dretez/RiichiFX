package org.dretez.riichijava.model.logic.tile;

import org.dretez.riichijava.model.data.common.Wind;
import org.dretez.riichijava.model.data.tile.*;
import org.dretez.riichijava.model.data.tile.HonourTile;
import org.dretez.riichijava.model.data.tile.SuitTile;
import org.dretez.riichijava.model.data.tile.Tile;

public final class Dora {
    private Dora() {}

    public static Tile of(Tile indicator) {
        return switch (indicator) {
            case SuitTile tile -> new SuitTile(tile.suit(), tile.number() % 9 + 1);
            case HonourTile tile -> new HonourTile(nextHonour(tile.type()));
        };
    }

    private static HonourType nextHonour(HonourType type) {
        return switch (type) {
            case Wind t -> Wind.values()[(t.ordinal() + 1) % Wind.values().length];
            case Dragon t -> Dragon.values()[(t.ordinal() + 1) % Dragon.values().length];
        };
    }
}
