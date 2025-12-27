package org.dretez.riichijava.model.data.tiles.enums;

public enum Wind implements HonourEnum<Wind> {
    EAST,
    SOUTH,
    WEST,
    NORTH;

    private static final Wind[] winds = values();

    @Override
    public Wind next() {
        return winds[(ordinal() + 1) % winds.length];
    }

    @Override
    public int typeOrder() {
        return 0;
    }
}
