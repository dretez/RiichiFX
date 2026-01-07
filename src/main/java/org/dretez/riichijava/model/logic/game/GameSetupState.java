package org.dretez.riichijava.model.logic.game;

import org.dretez.riichijava.model.exceptions.NotEnoughPlayersException;
import org.dretez.riichijava.model.exceptions.PlayerAlreadyExistsException;
import org.dretez.riichijava.model.exceptions.TooManyPlayersException;
import org.dretez.riichijava.model.logic.board.Player;
import org.dretez.riichijava.model.logic.common.Wind;

import java.util.*;

public class GameSetupState extends GameState {
    private final List<String> names;

    GameSetupState(Game game) {
        super(game);
        this.names = new ArrayList<>();
    }

    @Override
    void addPlayer(String name) throws TooManyPlayersException, PlayerAlreadyExistsException {
        if (names.size() >= 4)
            throw new TooManyPlayersException("This game is already full");
        if (names.contains(name))
            throw new PlayerAlreadyExistsException("There's already a player named \"" + name + "\" in this game");
        names.add(name);
    }

    @Override
    void removePlayer(String name) {
        names.remove(name);
    }

    @Override
    void startGame() throws NotEnoughPlayersException, TooManyPlayersException {
        if (names.size() < 2)
            throw new NotEnoughPlayersException("At least 2 players are needed to start the game");
        if (names.size() >= 4)
            throw new TooManyPlayersException("At most 4 players can join this game");
        Collections.shuffle(names);
        List<Player> players = new LinkedList<>();
        for (Wind wind : Wind.values()) {
            if (wind.ordinal() >= names.size()) break;
            players.add(new Player(wind, names.get(wind.ordinal()), 25000));
        }
        game.setState(new InGameState(game, players, Wind.EAST, 1, 0));
    }
}
