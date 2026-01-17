package org.dretez.riichijava.model.logic.board;

import org.dretez.riichijava.model.data.tile.Tile;
import org.dretez.riichijava.model.data.common.Wind;
import org.dretez.riichijava.model.logic.common.WindOrder;

public class Seat {
    private final Wind wind;
    private final Pond pond;

    public Seat(Wind wind) {
        this.wind = wind;
        this.pond = new Pond();
    }

    /* ******************************** INFO ******************************** */

    public Wind wind() {
        return wind;
    }

    public Tile getLastDiscard() {
        return pond.getLastDiscard();
    }

    public Wind shimocha() {
        return WindOrder.next(wind);
    }

    public Wind toimen() {
        return WindOrder.next(WindOrder.next(wind));
    }

    public Wind kamicha() {
        return WindOrder.prev(wind);
    }

    /* ********************************************************************** */

    public void discard(Tile tile) {
        pond.discard(tile);
    }

    /* ********************************************************************** */

    @Override
    public String toString() {
        return wind.toString();
    }
}
