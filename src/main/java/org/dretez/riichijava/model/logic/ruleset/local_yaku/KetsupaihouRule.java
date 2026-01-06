package org.dretez.riichijava.model.logic.ruleset.local_yaku;

/**
 * A hand with a single wait where 3 of the waiting tile are already visible on the board (discard pool, open calls or
 * dora indicators)
 */
public enum KetsupaihouRule {
    DISALLOW,
    ALLOW
}
