package org.dretez.riichijava.model.data.tiles.enums;

public interface HonourEnum<T extends HonourEnum<T>> {
    T next();
    int typeOrder();
}
