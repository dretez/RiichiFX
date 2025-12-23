package org.dretez.riichijava.model.game;

import org.dretez.riichijava.model.data.tiles.HonourTile;
import org.dretez.riichijava.model.data.tiles.SuitTile;
import org.dretez.riichijava.model.data.tiles.Tile;
import org.dretez.riichijava.model.data.tiles.enums.Dragon;
import org.dretez.riichijava.model.data.tiles.enums.Suit;
import org.dretez.riichijava.model.data.tiles.enums.Wind;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
    private final ArrayList<Tile> tiles = new ArrayList<>(136);
    private Wind prevalentWind;
    private Wind dealerWind;

    public Game() {
        initTiles();
        prevalentWind = Wind.EAST;
        dealerWind = Wind.EAST;
    }

    private void initTiles() {
        tiles.clear();
        for (var suit : Suit.values())
            for (int num = 1; num < 10; num++)
                tiles.addAll(Collections.nCopies(4, SuitTile.get(suit, num)));
        for (var wind : Wind.values())
            tiles.addAll(Collections.nCopies(4, HonourTile.get(wind)));
        for (var dragon : Dragon.values())
            tiles.addAll(Collections.nCopies(4, HonourTile.get(dragon)));
    }

    public void nextRound() {
        dealerWind = dealerWind.next();
        if (dealerWind == Wind.EAST)
            prevalentWind = prevalentWind.next();
    }
}
