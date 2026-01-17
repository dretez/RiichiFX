package org.dretez.riichijava.model.logic.wall;

import org.dretez.riichijava.model.data.tile.HonourTile;
import org.dretez.riichijava.model.data.tile.SuitTile;
import org.dretez.riichijava.model.data.tile.Tile;
import org.dretez.riichijava.model.data.tile.Dragon;
import org.dretez.riichijava.model.data.tile.SuitType;
import org.dretez.riichijava.model.data.common.Wind;

import java.util.ArrayList;
import java.util.Collections;

public class Wall {
    private final LiveWall liveWall;
    private final DeadWall deadWall;

    public Wall() {
        ArrayList<Tile> tiles = new ArrayList<>(136);
        for (var suit : SuitType.values())
            for (int num = 1; num < 10; num++)
                tiles.addAll(Collections.nCopies(4, new SuitTile(suit, num)));
        for (var wind : Wind.values())
            tiles.addAll(Collections.nCopies(4, new HonourTile(wind)));
        for (var dragon : Dragon.values())
            tiles.addAll(Collections.nCopies(4, new HonourTile(dragon)));
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
