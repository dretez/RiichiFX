package org.dretez.riichijava.model.data.player;

import org.dretez.riichijava.model.data.game.Board;
import org.dretez.riichijava.model.data.player.meld.Meld;
import org.dretez.riichijava.model.data.seat.Seat;
import org.dretez.riichijava.model.data.tiles.Tile;

import java.util.ArrayList;

/**
 * The {@code Player} class is responsible for handling all interactions a player can directly have with the game.
 */
public class Player {
    private final Board board;
    private final Hand hand;
    private final String name;
    private Seat seat;

    /**
     * Constructor for a player with an empty hand and pond.
     *
     * @param board {@code Board} associated to this player
     * @param name Player's name
     */
    public Player(Board board, String name) {
        this.board = board;
        this.hand = new Hand();
        this.name = name;
        this.seat = null;
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

    /* ******************************* MOVES ******************************* */

    /**
     * Pulls a tile from the wall into the player's hand.
     */
    public void draw() {
        hand.draw(board.draw());
    }

    /**
     * Discards a tile from the player's hand into the player's pond.
     *
     * @param idx Index of the tile to be discarded
     */
    public void discard(int idx) {
        seat.discard(hand.discard(idx));
    }

    /**
     * Discards a tile from the player's hand into the player's pond.
     *
     * @param tile The tile to be discarded.
     */
    public void discard(Tile tile) {
        if (hand.discard(tile))
            seat.discard(tile);
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
    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}
