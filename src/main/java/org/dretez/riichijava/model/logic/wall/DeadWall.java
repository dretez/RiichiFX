package org.dretez.riichijava.model.logic.wall;

import org.dretez.riichijava.model.logic.tile.Tile;
import org.dretez.riichijava.model.exceptions.NoMoreDoraException;

import java.util.Collections;
import java.util.List;

public class DeadWall {
    private final List<Tile> doraIndicators;
    private final List<Tile> uradoraIndicators;
    private final List<Tile> kanDraws;
    private final LiveWall liveWall;
    private int openDora;

    public DeadWall(List<Tile> tiles, LiveWall liveWall) throws IllegalArgumentException {
        if (tiles.size() != 14)
            throw new IllegalArgumentException("The dead wall must contain exactly 14 tiles");
        this.doraIndicators = List.copyOf(tiles.subList(0, 5));
        this.uradoraIndicators = List.copyOf(tiles.subList(5, 10));
        this.kanDraws = List.copyOf(tiles.subList(10, 14));
        this.liveWall = liveWall;
        this.openDora = 1;
    }

    public List<Tile> getDoraIndicators() {
        return Collections.unmodifiableList(doraIndicators.subList(0, openDora));
    }

    public List<Tile> getUradoraIndicators() {
        return Collections.unmodifiableList(uradoraIndicators.subList(0, openDora));
    }

    public void revealNextDora() throws NoMoreDoraException {
        if (openDora >= 5)
            throw new NoMoreDoraException();
        openDora++;
    }

    public Tile draw() {
        kanDraws.addLast(liveWall.draw());
        return kanDraws.removeFirst();
    }
}
