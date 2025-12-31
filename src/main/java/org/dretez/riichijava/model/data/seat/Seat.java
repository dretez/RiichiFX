package org.dretez.riichijava.model.data.seat;

import org.dretez.riichijava.model.data.Pond;
import org.dretez.riichijava.model.data.tiles.Tile;
import org.dretez.riichijava.model.data.tiles.enums.Wind;
import org.dretez.riichijava.model.game.Player;

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
