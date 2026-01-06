package org.dretez.riichijava.model.logic.common;

public enum Dragon implements Honour<Dragon> {
    WHITE,
    GREEN,
    RED;

    private static final Dragon[] colors = values();

    @Override
    public Dragon next() {
        return colors[(ordinal() + 1) % colors.length];
    }

    @Override
    public int typeOrder() {
        return 1;
    }
}
