package org.dretez.riichijava.model.logic;

import org.dretez.riichijava.model.logic.board.Board;
import org.dretez.riichijava.model.logic.board.Player;
import org.dretez.riichijava.model.logic.board.Seat;
import org.dretez.riichijava.model.logic.common.Wind;

import java.util.*;

public class Game {
    private final Board board;
    private final List<Player> players;
    private final List<Seat> seats;

    public Game() {
        board = new Board();
        players = new ArrayList<>(4);
        seats = new ArrayList<>(4);
        for (Wind wind : Wind.values())
            seats.add(new Seat(wind));
    }

    public void start() {
        Collections.shuffle(players);
        board.rotatePlayers();
    }

    public void draw(Wind seat) throws IllegalArgumentException {
        if (seat != board.getCurrentSeat())
            throw new IllegalArgumentException("The " + seat + " seat cannot draw now.");
        seats.get(seat.ordinal()).player().draw();
    }
}
