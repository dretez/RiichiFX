package org.dretez.riichijava.model.data.tiles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TileTest {

    @Test
    void windDora() {
        Tile east = new HonourTile<>(Wind.EAST);
        Tile south = new HonourTile<>(Wind.SOUTH);
        Tile west = new HonourTile<>(Wind.WEST);
        Tile north = new HonourTile<>(Wind.NORTH);

        assertEquals(east, north.getDora());
        assertEquals(south, east.getDora());

        assertNotEquals(north, east.getDora());
        assertNotEquals(west, north.getDora());
    }

    @Test
    void dragonDora() {
        Tile white = new HonourTile<>(Dragon.WHITE);
        Tile green = new HonourTile<>(Dragon.GREEN);
        Tile red = new HonourTile<>(Dragon.RED);

        assertEquals(white, red.getDora());
        assertEquals(green, white.getDora());

        assertNotEquals(green, red.getDora());
        assertNotEquals(white, green.getDora());
    }

    @Test
    void suitDora() {
        Tile sou1 = new SuitTile(Suit.SOUZU, 1);
        Tile sou6 = new SuitTile(Suit.SOUZU, 6);
        Tile sou9 = new SuitTile(Suit.SOUZU, 9);

        Tile man5 = new SuitTile(Suit.MANZU, 5);
        Tile man7 = new SuitTile(Suit.MANZU, 7);
        Tile man8 = new SuitTile(Suit.MANZU, 8);

        Tile pin2 = new SuitTile(Suit.PINFU, 2);
        Tile pin3 = new SuitTile(Suit.PINFU, 3);

        assertEquals(sou1, sou9.getDora());
        assertEquals(pin3, pin2.getDora());
        assertEquals(man8, man7.getDora());

        assertNotEquals(sou6, man5.getDora());
        assertNotEquals(sou9, sou6.getDora());
        assertNotEquals(pin2, sou1.getDora());
    }

    @Test
    void crossHonourDora() {
        Tile east = new HonourTile<>(Wind.EAST);        // 1st wind
        Tile south = new HonourTile<>(Wind.SOUTH);      // 2nd wind
        Tile white = new HonourTile<>(Dragon.WHITE);    // 1st dragon
        Tile red = new HonourTile<>(Dragon.RED);        // 3rd dragon

        assertNotEquals(south, white.getDora());
        assertNotEquals(east, red.getDora());
        assertNotEquals(red, south.getDora());
    }
}