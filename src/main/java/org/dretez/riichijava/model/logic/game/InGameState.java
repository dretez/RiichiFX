package org.dretez.riichijava.model.logic.game;

import org.dretez.riichijava.model.exceptions.IllegalPlayerActionException;
import org.dretez.riichijava.model.logic.board.Board;
import org.dretez.riichijava.model.logic.board.Player;
import org.dretez.riichijava.model.logic.common.Wind;
import org.dretez.riichijava.model.logic.tile.Tile;

import java.util.LinkedList;
import java.util.List;

public class InGameState extends GameState {
    private final List<Player> players;
    private final Board board;

    InGameState(Game game, List<Player> players, Wind round, int number, int honba) {
        super(game);
        this.players = new LinkedList<>(players);
        this.board = new Board(round, number, honba);
        for (Player player: this.players) {
            for (int i = 0; i < 13; i++)
                player.draw(board.draw());
        }
    }

    @Override
    void draw(Wind seat) throws IllegalPlayerActionException {
        if (seat != board.getCurrentSeat())
            throw new IllegalPlayerActionException("The " + seat + " seat cannot draw a tile at this moment");
        // TODO
    }

    @Override
    void discard(Wind seat, Tile tile) throws IllegalPlayerActionException {
        if (seat != board.getCurrentSeat())
            throw new IllegalPlayerActionException("The " + seat + " seat cannot discard a tile at this moment");
        // TODO
    }

    @Override
    void riichi(Wind seat) {
        // TODO
    }

    @Override
    void tsumo(Wind seat) {
        // TODO
        game.setState(new GameOverState(game, players, board));
    }

    @Override
    void ron(Wind seat) {
        // TODO
        game.setState(new GameOverState(game, players, board));
    }
}
