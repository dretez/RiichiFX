package org.dretez.riichijava.model.data.tiles;

public enum Dragon implements HonourEnum<Dragon> {
    WHITE,
    GREEN,
    RED;

    private static final Dragon[] colors = values();

    public Dragon next() {
        return colors[(ordinal() + 1) % colors.length];
    }

    @Override
    public int typeOrder() {
        return 1;
    }
}
