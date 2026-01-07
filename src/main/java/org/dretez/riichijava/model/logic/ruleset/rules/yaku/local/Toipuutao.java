package org.dretez.riichijava.model.logic.ruleset.rules.yaku.local;

/**
 * A hand that only consists of tiles that look the same when turned upside down. That means haku/white dragon, all
 * pinfu/sticks tiles except 1, 3 and 7 and all pinfu/dots tiles except for 6 and 7.
 */
public enum ToipuutaoRule {
    DISALLOW,
    ALLOW
}
