package org.dretez.riichijava.model.logic.wall;

import org.dretez.riichijava.model.logic.tile.HonourTile;
import org.dretez.riichijava.model.logic.tile.SuitTile;
import org.dretez.riichijava.model.logic.tile.Tile;
import org.dretez.riichijava.model.logic.common.Dragon;
import org.dretez.riichijava.model.logic.tile.Suit;
import org.dretez.riichijava.model.logic.common.Wind;

import java.util.ArrayList;
import java.util.Collections;

public class Wall {
    private final LiveWall liveWall;
    private final DeadWall deadWall;

    public Wall() {
        ArrayList<Tile> tiles = new ArrayList<>(136);
        for (var suit : Suit.values())
            for (int num = 1; num < 10; num++)
                tiles.addAll(Collections.nCopies(4, SuitTile.get(suit, num)));
        for (var wind : Wind.values())
            tiles.addAll(Collections.nCopies(4, HonourTile.get(wind)));
        for (var dragon : Dragon.values())
            tiles.addAll(Collections.nCopies(4, HonourTile.get(dragon)));
        Collections.shuffle(tiles);

        liveWall = new LiveWall(tiles.subList(14, 136));
        deadWall = new DeadWall(tiles.subList(0, 14), liveWall);
    }

    public LiveWall getLiveWall() {
        return liveWall;
    }

    public DeadWall getDeadWall() {
        return deadWall;
    }
}
