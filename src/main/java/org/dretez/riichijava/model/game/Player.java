package org.dretez.riichijava.model.game;

import org.dretez.riichijava.model.data.Hand;
import org.dretez.riichijava.model.data.Meld;
import org.dretez.riichijava.model.data.Pond;
import org.dretez.riichijava.model.data.tiles.Tile;
import org.dretez.riichijava.model.data.tiles.enums.Wind;

import java.util.ArrayList;

/**
 * The {@code Player} class is responsible for handling all interactions a player can directly have with the game.
 */
public class Player {
    private final Game game;
    private Wind seat;
    private final Hand hand;
    private final Pond pond;

    /**
     * Constructor for a player with an empty hand and pond.
     *
     * @param game The game associated to this player
     * @param seat The player's starting seat
     */
    public Player(Game game, Wind seat) {
        this.game = game;
        this.seat = seat;
        this.hand = new Hand();
        this.pond = new Pond();
    }

    /* ******************************** INFO ******************************** */

    public Wind seat() {
        return seat;
    }

    public Hand hand() {
        return hand;
    }

    public ArrayList<Meld> getOpenMelds() {
        // TODO
        return null;
    }

    /* ******************************* MOVES ******************************* */

    /**
     * Pulls a tile from the wall into the player's hand.
     */
    public void draw() {
        // TODO
    }

    /**
     * Discards a tile from the player's hand into the player's pond.
     *
     * @param idx Index of the tile to be discarded
     */
    public void discard(int idx) {
        // TODO
    }

    /**
     * Discards a tile from the player's hand into the player's pond.
     *
     * @param tile The tile to be discarded.
     */
    public void discard(Tile tile) {
        // TODO
    }

    /**
     * Steals the last discarded tile to form an open sequence.
     */
    public void chi() {
        // TODO
    }

    /**
     * Steals the last discarded tile to form an open triplet.
     */
    public void pon() {
        // TODO
    }

    /**
     * Declares a quad meld, draws one tile from the dead wall and reveals a new dora indicator.
     */
    public void kan() {
        // TODO
    }

    /**
     * Declares a closed quad meld.
     *
     * @param tile The tile that will form the quad
     */
    private void ankan(Tile tile) {
        // TODO
    }

    /**
     * Steals the last discarded tile to form an open quad.
     */
    private void daiminkan() {
        // TODO
    }

    /**
     * Adds a drawn tile to an already open triplet.
     *
     * @param tile The tile that will form the quad
     */
    private  void shouminkan(Tile tile) {
        // TODO
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

    /* ******************************** GAME ******************************** */

    /**
     * Advances the player to the next seat wind.
     */
    public void switchSeat() {
        seat = seat.next();
    }
}
