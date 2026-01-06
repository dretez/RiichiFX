package org.dretez.riichijava.model.logic.tile;

import org.dretez.riichijava.model.logic.common.Honour;

import java.util.Comparator;

class HonourComparator implements Comparator<HonourTile<?>> {
    @Override
    public int compare(HonourTile<?> o1, HonourTile<?> o2) {
        Honour<?> h1 = o1.getHonour();
        Honour<?> h2 = o2.getHonour();

        if (h1.typeOrder() != h2.typeOrder())
            return Integer.compare(o1.getHonour().typeOrder(), h2.typeOrder());
        return 0;
    }
}
