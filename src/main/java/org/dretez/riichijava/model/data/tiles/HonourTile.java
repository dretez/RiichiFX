package org.dretez.riichijava.model.data.tiles;

import org.dretez.riichijava.model.data.tiles.comparators.HonourComparator;
import org.dretez.riichijava.model.data.tiles.enums.Dragon;
import org.dretez.riichijava.model.data.tiles.enums.HonourEnum;
import org.dretez.riichijava.model.data.tiles.enums.Wind;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class HonourTile<T extends Enum<T> & HonourEnum<T>> implements Tile, Comparable<HonourTile<?>> {
    private final T honour;

    private HonourTile(T honour) {
        this.honour = honour;
    }

    public static <T extends Enum<T> & HonourEnum<T>> HonourTile<T> get(T honour) throws IllegalStateException {
        @SuppressWarnings("unchecked") EnumMap<T, HonourTile<T>> map = (EnumMap<T, HonourTile<T>>) CACHE.get(honour.getDeclaringClass());
        if (map == null) throw new IllegalStateException("Unregistered honour: " + honour);
        return map.get(honour);
    }

    public T getHonour() {
        return honour;
    }

    @Override
    public Tile getDora() {
        return HonourTile.get(honour.next());
    }

    @Override
    public Tile prev() {
        return null;
    }

    @Override
    public Tile next() {
        return null;
    }

    /* ************************************************************************************************************** */

    @Override
    public int compareTo(HonourTile<?> o) {
        if (o == null) return 0;
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

    @Override
    public int hashCode() {
        return Objects.hash(honour);
    }

    @Override
    public String toString() {
        return honour.toString();
    }

    /* ************************************************************************************************************** */

    @SuppressWarnings("rawtypes")
    private static final Map<Class<?>, EnumMap> CACHE = new HashMap<>();
    static {
        register(Dragon.class, Dragon.values());
        register(Wind.class, Wind.values());
    }

    private static final HonourComparator comparator = new HonourComparator();
    private static <T extends Enum<T> & HonourEnum<T>> void register(Class<T> type, T[] values) {
        EnumMap<T, HonourTile<T>> map = new EnumMap<>(type);
        for (T t : values)
            map.put(t, new HonourTile<>(t));
        CACHE.put(type, map);
    }

}
