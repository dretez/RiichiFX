package org.dretez.riichijava.model.data.common;

import org.dretez.riichijava.model.data.tile.HonourGroup;
import org.dretez.riichijava.model.data.tile.HonourType;

public enum Wind implements HonourType {
    EAST,
    SOUTH,
    WEST,
    NORTH;

    @Override
    public HonourGroup group() {
        return HonourGroup.WIND;
    }
}
