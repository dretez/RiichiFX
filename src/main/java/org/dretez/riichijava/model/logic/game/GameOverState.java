package org.dretez.riichijava.model.logic.game;

import org.dretez.riichijava.model.logic.board.Board;
import org.dretez.riichijava.model.logic.board.Player;
import org.dretez.riichijava.model.logic.common.Wind;

import java.util.LinkedList;
import java.util.List;

public class GameOverState extends GameState {
    private final List<Player> players;
    private final List<Integer> updatedPoints;
    private final Board board;
    private final int nextRoundNumber;
    private final Wind nextRoundWind;
    private final int nextRoundHonba;

    GameOverState(Game game, List<Player> players, Board board) {
        super(game);
        this.board = board;
        this.players = new LinkedList<>(players);
        this.updatedPoints = players.stream().map(Player::points).toList(); // TODO calculate new points

        this.nextRoundNumber = board.isRenchan() ? board.getRoundNumber() : board.getRoundNumber() % players.size() + 1;
        this.nextRoundWind = nextRoundNumber == 1 && !board.isRenchan() ? board.getRoundWind().next() : board.getRoundWind();
        this.nextRoundHonba = board.isRenchan() ? board.getHonba() + 1 : 0;
    }

    @Override
    void nextRound() {
        if (!board.isRenchan())
            players.addFirst(players.removeLast()); // rotate players
        for (Wind wind : Wind.values()) {
            if (wind.ordinal() >= players.size()) break;
            this.players.add(new Player(wind, players.get(wind.ordinal()).name(), updatedPoints.get(wind.ordinal())));
        }
        game.setState(new InGameState(game, players, nextRoundWind, nextRoundNumber, nextRoundHonba));
    }

    @Override
    void endGame() {
        // TODO
    }
}
