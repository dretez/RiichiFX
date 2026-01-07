package org.dretez.riichijava.model.logic.game;

import org.dretez.riichijava.model.logic.common.Wind;
import org.dretez.riichijava.model.logic.tile.Tile;

public class Game {
    private GameState state;

    public Game() {
        this.state = new GameSetupState(this);
    }

    void setState(GameState state) {
        this.state = state;
    }

    /* ********************************************************************** */

    public void addPlayer(String name) throws IllegalStateException {
        state.addPlayer(name);
    }

    public void removePlayer(String name) throws IllegalStateException {
        state.removePlayer(name);
    }

    public void startGame() throws IllegalStateException {
        state.startGame();
    }

    /* ********************************************************************** */

    public void draw(Wind seat) throws IllegalStateException {
        state.draw(seat);
    }

    public void discard(Wind seat, Tile tile) throws IllegalStateException {
        state.discard(seat, tile);
    }

    public void riichi(Wind seat) throws IllegalStateException {
        state.riichi(seat);
    }

    public void tsumo(Wind seat) throws IllegalStateException {
        state.tsumo(seat);
    }

    public void ron(Wind seat) throws IllegalStateException {
        state.ron(seat);
    }

    /* ********************************************************************** */

    public void nextRound() throws IllegalStateException {
        state.nextRound();
    }

    public void endGame() throws IllegalStateException {
        state.endGame();
    }
}
