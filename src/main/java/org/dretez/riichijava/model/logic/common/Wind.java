package org.dretez.riichijava.model.logic.common;

public enum Wind implements Honour<Wind> {
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
