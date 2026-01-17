package org.dretez.riichijava.model.logic.common;

import org.dretez.riichijava.model.data.common.Wind;

public class WindOrder {
    private static final Wind[] WINDS = Wind.values();

    private WindOrder() {}

    public static Wind next(Wind wind) {
        return WINDS[(wind.ordinal() + 1) % WINDS.length];
    }

    public static Wind prev(Wind wind) {
        return WINDS[(wind.ordinal() - 1 + WINDS.length) % WINDS.length];
    }
}
