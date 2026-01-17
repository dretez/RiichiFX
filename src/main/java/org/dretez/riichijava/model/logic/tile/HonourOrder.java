package org.dretez.riichijava.model.logic.tile;

import org.dretez.riichijava.model.data.tile.Dragon;
import org.dretez.riichijava.model.data.tile.HonourType;
import org.dretez.riichijava.model.data.common.Wind;

import java.util.Comparator;

public class HonourOrder implements Comparator<HonourType> {
    private final static HonourOrder instance = new HonourOrder();

    private HonourOrder() {}

    @Override
    public int compare(HonourType o1, HonourType o2) {
        if (!o1.group().equals(o2.group()))
            return o1.group().compareTo(o2.group());
        if (o1 instanceof Wind w1 && o2 instanceof Wind w2)
            return w1.compareTo(w2);
        if (o1 instanceof Dragon d1 && o2 instanceof Dragon d2)
            return d1.compareTo(d2);
        throw new IllegalStateException("Honour order not defined for: " + o1.getClass());
    }

    public static int compareHonours(HonourType o1, HonourType o2) {
        return instance.compare(o1, o2);
    }

    public static HonourOrder instance() {
        return instance;
    }
}
