package org.dretez.riichijava.model.logic.game;

import org.dretez.riichijava.model.exceptions.IllegalPlayerActionException;
import org.dretez.riichijava.model.exceptions.NotEnoughPlayersException;
import org.dretez.riichijava.model.exceptions.PlayerAlreadyExistsException;
import org.dretez.riichijava.model.exceptions.TooManyPlayersException;
import org.dretez.riichijava.model.data.common.Wind;
import org.dretez.riichijava.model.data.tile.Tile;

public abstract class GameState {
    protected final Game game;

    protected GameState(Game game) {
        this.game = game;
    }

    /* ********************************************************************** */

    void addPlayer(String name) throws IllegalStateException, TooManyPlayersException, PlayerAlreadyExistsException {
        throw new IllegalStateException();
    }
    void removePlayer(String name) throws IllegalStateException {
        throw new IllegalStateException();
    }
    void startGame() throws IllegalStateException, NotEnoughPlayersException, TooManyPlayersException {
        throw new IllegalStateException();
    }

    /* ********************************************************************** */

    void draw(Wind seat) throws IllegalStateException, IllegalPlayerActionException {
        throw new IllegalStateException();
    }
    void discard(Wind seat, Tile tile) throws IllegalStateException, IllegalPlayerActionException {
        throw new IllegalStateException();
    }
    // TODO: tile calls
    void riichi(Wind seat) throws IllegalStateException {
        throw new IllegalStateException();
    }
    void tsumo(Wind seat) throws IllegalStateException {
        throw new IllegalStateException();
    }
    void ron(Wind seat) throws IllegalStateException {
        throw new IllegalStateException();
    }

    /* ********************************************************************** */

    void nextRound() throws IllegalStateException {
        throw new IllegalStateException();
    }
    void endGame() throws IllegalStateException {
        throw new IllegalStateException();
    }
}
