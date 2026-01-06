package org.dretez.riichijava.model.logic.board;

import org.dretez.riichijava.model.logic.tile.Tile;
import org.dretez.riichijava.model.logic.common.Wind;
import org.dretez.riichijava.model.logic.wall.Wall;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final List<Player> players;
    private final List<Seat> seats;
    private final Wall wall;
    private Wind roundWind;
    private Wind currentSeat;

    public Board() {
        wall = new Wall();
        roundWind = Wind.EAST;
        currentSeat = Wind.EAST;
        players = new ArrayList<>(4);
        seats = new ArrayList<>(4);
        for (Wind wind : Wind.values())
            seats.add(new Seat(wind));
    }

    /* ******************************** INFO ******************************** */

    public Wind getRoundWind() {
        return roundWind;
    }

    public Wind getCurrentSeat() {
        return currentSeat;
    }

    public Tile getLastDiscard() {
        return null;
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

    public void rotatePlayers() {
        players.addFirst(players.removeLast());
        for (int i = 0; i < players.size(); i++) {
            seats.get(i).setPlayer(players.get(i));
        }
    }
}
