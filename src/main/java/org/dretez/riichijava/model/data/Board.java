package org.dretez.riichijava.model.data;

import org.dretez.riichijava.model.data.tiles.Tile;
import org.dretez.riichijava.model.data.tiles.enums.Wind;
import org.dretez.riichijava.model.data.wall.Wall;

public class Board {
    private final Wall wall;
    private Wind roundWind;
    private Wind currentSeat;

    public Board() {
        wall = new Wall();
        roundWind = Wind.EAST;
        currentSeat = Wind.EAST;
    }

    /* ******************************** INFO ******************************** */

    public Wind getRoundWind() {
        return roundWind;
    }

    public Wind getCurrentSeat() {
        return currentSeat;
    }

    /* ********************************************************************** */

    public void nextRound() {
        roundWind = roundWind.next();
    }

    public void passTurn() {
        currentSeat = currentSeat.next();
    }

    public Tile draw() {
        return wall.getLiveWall().draw();
    }
}
