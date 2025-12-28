package org.dretez.riichijava.model.game;

import org.dretez.riichijava.model.data.wall.Wall;
import org.dretez.riichijava.model.data.tiles.enums.Wind;

public class Game {
    private final Wall tiles;
    private Wind prevalentWind;
    private Wind dealerWind;

    public Game() {
        tiles = new Wall();
        prevalentWind = Wind.EAST;
        dealerWind = Wind.EAST;
    }

    public void nextRound() {
        dealerWind = dealerWind.next();
        if (dealerWind == Wind.EAST)
            prevalentWind = prevalentWind.next();
    }
}
