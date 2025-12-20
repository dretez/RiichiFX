package org.dretez.riichijava.model.data.tiles;

import java.util.Objects;

public class HonourTile<T extends Enum<T> & HonourEnum<T>> extends Tile implements Comparable<HonourTile<?>> {
    private final T honour;

    public HonourTile(T honour) {
        this.honour = honour;
    }

    public T getHonour() {
        return honour;
    }

    @Override
    public Tile getDora() {
        return new HonourTile<>(honour.next());
    }

    @Override
    public int compareTo(HonourTile<?> o) {
        if (o == null) return 0;
        HonourComparator comparator = new HonourComparator();
        if (comparator.compare(this, o) != 0)
            return comparator.compare(this, o);
        return honour.compareTo((T) o.honour);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HonourTile<?> that = (HonourTile<?>) o;
        return Objects.equals(honour, that.honour);
    }
}
