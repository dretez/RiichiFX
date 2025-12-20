package org.dretez.riichijava.model.data.tiles.comparators;

import org.dretez.riichijava.model.data.tiles.enums.HonourEnum;
import org.dretez.riichijava.model.data.tiles.HonourTile;

import java.util.Comparator;

public class HonourComparator implements Comparator<HonourTile<?>> {
    @Override
    public int compare(HonourTile<?> o1, HonourTile<?> o2) {
        HonourEnum<?> h1 = o1.getHonour();
        HonourEnum<?> h2 = o2.getHonour();

        if (h1.typeOrder() != h2.typeOrder())
            return Integer.compare(o1.getHonour().typeOrder(), h2.typeOrder());
        return 0;
    }
}
