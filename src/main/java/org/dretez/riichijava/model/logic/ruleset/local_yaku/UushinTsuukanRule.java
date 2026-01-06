package org.dretez.riichijava.model.logic.ruleset.local_yaku;

/**
 * An Ittsu hand with a kanchan (middle sequence wait) for a 5 on the straight suit.
 * <p>
 * For example: {@code 6-man} {@code 6-man} {@code 7-man} {@code 8-man} {@code 9-man} {@code 1-sou}
 * {@code 2-sou} {@code 3-sou} {@code 4-sou} {@code 6-sou} {@code 7-sou} {@code 8-sou} {@code 9-sou},
 * wait: {@code 5-sou}
 */
public enum UushinTsuukanRule {
    DISALLOW,
    ALLOW
}
