package org.dretez.riichijava.model.logic.board;

import org.dretez.riichijava.model.logic.board.meld.Meld;
import org.dretez.riichijava.model.logic.tile.Tile;
import org.dretez.riichijava.model.logic.common.Wind;
import org.dretez.riichijava.model.exceptions.IllegalTileCallException;

import java.util.ArrayList;

/**
 * The {@code Player} class is responsible for handling all interactions a player can directly have with the game.
 */
public class Player {
    private final String name;
    private final Wind seat;
    private final Hand hand;
    private final int points;

    /**
     * Constructor for a player with an empty hand.
     *
     * @param name Player's name
     */
    public Player(Wind seat, String name, int points) {
        this.seat = seat;
        this.name = name;
        this.points = points;
        this.hand = new Hand();
    }

    /* ******************************** INFO ******************************** */

    public String name() {
        return name;
    }

    public Hand hand() {
        return hand;
    }

    public ArrayList<Meld> getOpenMelds() {
        // TODO
        return null;
    }

    public int points() {
        return points;
    }

    public Wind seat() {
        return seat;
    }

    /* ******************************* MOVES ******************************* */

    /**
     * Adds a {@code Tile} to the player's hand.
     *
     * @param tile {@code Tile} to be drawn
     */
    public void draw(Tile tile) {
        hand.draw(tile);
    }

    /**
     * Discards a {@code Tile} from the player's {@code Hand}.
     *
     * @param idx Index of the {@code Tile} to be discarded
     * @return The discarded {@code Tile}
     */
    public Tile discard(int idx) {
        return hand.discard(idx);
    }

    /**
     * Discards a tile from the player's hand into the player's pond.
     *
     * @param tile The tile to be discarded.
     */
    public Tile discard(Tile tile) {
        return hand.discard(tile) ? tile : null;
    }

    /**
     * Steals the last discarded tile to form an open sequence.
     *
     * @param stolen The tile that will form the quad
     * @param tile1 A tile already owned by the player which will form a sequence with the stolen tile
     * @param tile2 A tile already owned by the player which will form a sequence with the stolen tile
     * @param blame The {@code Wind} of the seat from which a tile is being stolen
     */
    public void chi(Tile stolen, Tile tile1, Tile tile2, Wind blame) throws IllegalTileCallException {
        hand.chi(stolen, tile1, tile2, blame);
    }

    /**
     * Steals the last discarded tile to form an open triplet.
     *
     * @param stolen The tile that will form the quad
     * @param blame The {@code Wind} of the seat from which a tile is being stolen
     */
    public void pon(Tile stolen, Wind blame) throws IllegalTileCallException {
        hand.pon(stolen, blame);
    }

    /**
     * Declares a closed quad meld.
     *
     * @param tile The tile that will form the quad
     */
    private void ankan(Tile tile) throws IllegalTileCallException {
        hand.ankan(tile);
    }

    /**
     * Steals the last discarded tile to form an open quad.
     *
     * @param stolen The tile that will form the quad
     * @param blame The {@code Wind} of the seat from which a tile is being stolen
     */
    private void daiminkan(Tile stolen, Wind blame) throws IllegalTileCallException {
        hand.daiminkan(stolen, blame);
    }

    /**
     * Adds a drawn tile to an already open triplet.
     *
     * @param tile The tile that will form the quad
     */
    private  void shouminkan(Tile tile) throws IllegalTileCallException {
        hand.shouminkan(tile);
    }

    /**
     * Declares a ready hand.
     * <p>
     * After declaring riichi, the player's hand gets locked, and the player must discard all new draws until a
     * ron or tsumo call is possible.
     * <p>
     * Under special circumstances and rulesets, kan calls may still be allowed even after riichi.
     */
    public void riichi() {
        // TODO
    }

    /**
     * Wins the round by stealing the last discarded tile.
     */
    public void ron() {
        // TODO
    }

    /**
     * Wins the round by drawing the last tile needed for a legal hand.
     */
    public void tsumo() {
        // TODO
    }
}
