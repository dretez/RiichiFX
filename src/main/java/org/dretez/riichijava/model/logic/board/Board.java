package org.dretez.riichijava.model.logic.board;

import org.dretez.riichijava.model.logic.tile.Tile;
import org.dretez.riichijava.model.logic.common.Wind;
import org.dretez.riichijava.model.logic.wall.Wall;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final List<Seat> seats;
    private final Wall wall;
    private final Wind roundWind;
    private final int roundNumber;
    private final int honba;
    private Wind currentSeat;

    public Board(Wind round, int number, int honba) {
        this.roundWind = round;
        this.roundNumber = number;
        this.honba = honba;

        this.wall = new Wall();
        this.currentSeat = Wind.EAST;
        this.seats = new ArrayList<>(4);
        for (Wind wind : Wind.values())
            seats.add(new Seat(wind));
    }

    /* ******************************** INFO ******************************** */

    public Wind getRoundWind() {
        return roundWind;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public int getHonba() {
        return honba;
    }

    public Wind getCurrentSeat() {
        return currentSeat;
    }

    public Tile getLastDiscard() {
        return null;
    }

    public boolean isRenchan() {
        // TODO
        return false;
    }

    /* ********************************************************************** */

    public Tile draw() {
        return wall.getLiveWall().draw();
    }
}
