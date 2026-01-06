package org.dretez.riichijava.model.logic.board;

import org.dretez.riichijava.model.logic.tile.Tile;
import org.dretez.riichijava.model.logic.common.Wind;

public class Seat {
    private final Wind wind;
    private final Pond pond;
    private Player player;

    public Seat(Wind wind) {
        this.wind = wind;
        this.pond = new Pond();
        this.player = null;
    }

    /* ******************************** INFO ******************************** */

    public Wind wind() {
        return wind;
    }

    public Player player() {
        return player;
    }

    public Tile getLastDiscard() {
        return pond.getLastDiscard();
    }

    public Wind shimocha() {
        return wind.next();
    }

    public Wind toimen() {
        return wind.next().next();
    }

    public Wind kamicha() {
        return wind.next().next().next();
    }

    /* ********************************************************************** */

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void discard(Tile tile) {
        pond.discard(tile);
    }

    /* ********************************************************************** */

    @Override
    public String toString() {
        return wind.toString();
    }
}
