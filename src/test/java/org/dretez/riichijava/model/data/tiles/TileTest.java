package org.dretez.riichijava.model.data.tiles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TileTest {

    @Test
    void windDora() {
        Tile east = HonourTile.get(Wind.EAST);
        Tile south = HonourTile.get(Wind.SOUTH);
        Tile west = HonourTile.get(Wind.WEST);
        Tile north = HonourTile.get(Wind.NORTH);

        assertEquals(east, north.getDora());
        assertEquals(south, east.getDora());

        assertNotEquals(north, east.getDora());
        assertNotEquals(west, north.getDora());
    }

    @Test
    void dragonDora() {
        Tile white = HonourTile.get(Dragon.WHITE);
        Tile green = HonourTile.get(Dragon.GREEN);
        Tile red = HonourTile.get(Dragon.RED);

        assertEquals(white, red.getDora());
        assertEquals(green, white.getDora());

        assertNotEquals(green, red.getDora());
        assertNotEquals(white, green.getDora());
    }

    @Test
    void suitDora() {
        Tile sou1 = SuitTile.get(Suit.SOUZU, 1);
        Tile sou6 = SuitTile.get(Suit.SOUZU, 6);
        Tile sou9 = SuitTile.get(Suit.SOUZU, 9);

        Tile man5 = SuitTile.get(Suit.MANZU, 5);
        Tile man7 = SuitTile.get(Suit.MANZU, 7);
        Tile man8 = SuitTile.get(Suit.MANZU, 8);

        Tile pin2 = SuitTile.get(Suit.PINFU, 2);
        Tile pin3 = SuitTile.get(Suit.PINFU, 3);

        assertEquals(sou1, sou9.getDora());
        assertEquals(pin3, pin2.getDora());
        assertEquals(man8, man7.getDora());

        assertNotEquals(sou6, man5.getDora());
        assertNotEquals(sou9, sou6.getDora());
        assertNotEquals(pin2, sou1.getDora());
    }

    @Test
    void crossHonourDora() {
        Tile east = HonourTile.get(Wind.EAST);        // 1st wind
        Tile south = HonourTile.get(Wind.SOUTH);      // 2nd wind
        Tile white = HonourTile.get(Dragon.WHITE);    // 1st dragon
        Tile red = HonourTile.get(Dragon.RED);        // 3rd dragon

        assertNotEquals(south, white.getDora());
        assertNotEquals(east, red.getDora());
        assertNotEquals(red, south.getDora());
    }
}