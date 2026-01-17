package org.dretez.riichijava.model.data.tile;

import org.dretez.riichijava.model.data.common.Wind;

public sealed interface HonourType extends TileType permits Dragon, Wind {
    HonourGroup group();
}
