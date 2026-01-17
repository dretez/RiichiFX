package org.dretez.riichijava.model.logic.board;

import org.dretez.riichijava.model.data.tile.Tile;
import org.dretez.riichijava.model.data.common.Wind;
import org.dretez.riichijava.model.exceptions.IllegalTileCallException;
import org.dretez.riichijava.model.logic.board.meld.Kantsu;
import org.dretez.riichijava.model.logic.board.meld.Koutsu;
import org.dretez.riichijava.model.logic.board.meld.Meld;
import org.dretez.riichijava.model.logic.board.meld.Shuntsu;
import org.dretez.riichijava.model.logic.tile.TileOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {
    private final List<Tile> tiles;
    private final List<Meld> callMelds;
    private boolean open;

    public Hand() {
        this.tiles = new ArrayList<>(14);
        this.callMelds = new ArrayList<>();
        this.open = false;
    }

    /* ******************************** INFO ******************************** */

    public boolean isOpen() {
        return open;
    }

    public List<Meld> melds() {
        return Collections.unmodifiableList(callMelds);
    }

    public List<Tile> tiles() {
        return Collections.unmodifiableList(tiles);
    }

    /* ***************************** EVALUATION ***************************** */

    public int shanten() {
        List<Tile> tilesCopy = new ArrayList<>(tiles);
        tilesCopy.sort(TileOrder.instance());
        // TODO
        return 0;
    }

    /* ******************************* MOVES ******************************* */

    public void draw(Tile tile) {
        tiles.add(tile);
    }

    public Tile discard(int idx) {
        return tiles.remove(idx);
    }

    public Tile discard(Tile tile) {
        return tiles.remove(tile) ? tile : null;
    }

    public void chi(Tile stolen, Tile tile1, Tile tile2, Wind blame) throws IllegalTileCallException {
        if (tile1 == null || Collections.frequency(tiles, tile1) < 1)
            throw new IllegalTileCallException("Hand doesn't contain tile " + tile1);
        if (tile2 == null || Collections.frequency(tiles, tile2) < 1)
            throw new IllegalTileCallException("Hand doesn't contain tile " + tile2);
        callMelds.add(Shuntsu.factory(new ArrayList<>(List.of(stolen, tile1, tile2)), blame));
        tiles.remove(tile1);
        tiles.remove(tile2);
        open = true;
    }

    public void pon(Tile tile, Wind blame) throws IllegalTileCallException {
        if (Collections.frequency(tiles, tile) != 2)
            throw new IllegalTileCallException("Hand must already have 2 " + tile + " tiles before calling an open triplet");
        callMelds.add(new Koutsu(tile, blame));
        tiles.removeIf(t -> t == tile);
        open = true;
    }

    public void ankan(Tile tile) throws IllegalTileCallException {
        if (Collections.frequency(tiles, tile) != 4)
            throw new IllegalTileCallException("Hand must have 4 " + tile + " tiles before calling a closed quad");
        callMelds.add(new Kantsu(tile));
        tiles.removeIf(t -> t == tile);
    }

    public void daiminkan(Tile tile, Wind blame) throws IllegalTileCallException {
        if (Collections.frequency(tiles, tile) != 3)
            throw new IllegalTileCallException("Hand must already have 3 " + tile + " tiles before calling an open quad");
        callMelds.add(new Kantsu(tile, blame));
        tiles.removeIf(t -> t == tile);
        open = true;
    }

    public void shouminkan(Tile tile) throws IllegalTileCallException {
        Koutsu meld = (Koutsu) callMelds.stream()
                .filter(m -> m instanceof Koutsu && m.tiles().getFirst() == tile)
                .findFirst().orElse(null);
        if (meld == null)
            throw new IllegalTileCallException("Hand contains no " + tile + " open triplet");
        callMelds.add(meld.promote());
        callMelds.remove(meld);
        open = true;
    }

    public void sort() {
        tiles.sort(TileOrder.instance());
    }
}
