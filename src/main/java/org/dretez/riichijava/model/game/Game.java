package org.dretez.riichijava.model.game;

import org.dretez.riichijava.model.data.Board;
import org.dretez.riichijava.model.data.seat.Seat;
import org.dretez.riichijava.model.data.tiles.enums.Wind;

import java.util.*;

public class Game {
    private final Board board;
    private List<Player> players;
    private List<Seat> seats;

    public Game() {
        board = new Board();
        players = new ArrayList<>(4);
        seats = new ArrayList<>(4);
        for (Wind wind : Wind.values())
            seats.add(new Seat(wind));
    }

    public void start() {
        Collections.shuffle(players);
        rotatePlayers();
    }

    public void draw(Wind seat) throws IllegalArgumentException {
        if (seat != board.getCurrentSeat())
            throw new IllegalArgumentException("The " + seat + " seat cannot draw now.");
        seats.get(seat.ordinal()).player().draw();
    }

    public void rotatePlayers() {
        players.addFirst(players.removeLast());
        for (int i = 0; i < players.size(); i++) {
            seats.get(i).setPlayer(players.get(i));
        }
    }
}
