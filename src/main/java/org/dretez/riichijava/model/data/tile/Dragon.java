package org.dretez.riichijava.model.data.tile;

public enum Dragon implements HonourType {
    WHITE,
    GREEN,
    RED;

    @Override
    public HonourGroup group() {
        return HonourGroup.DRAGON;
    }
}
