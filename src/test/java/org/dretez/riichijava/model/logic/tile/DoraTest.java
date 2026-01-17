package org.dretez.riichijava.model.logic.tile;

import org.dretez.riichijava.model.data.tile.HonourTile;
import org.dretez.riichijava.model.data.tile.SuitTile;
import org.dretez.riichijava.model.data.tile.SuitType;
import org.dretez.riichijava.model.data.tile.Tile;
import org.dretez.riichijava.model.data.common.Wind;
import org.dretez.riichijava.model.data.tile.Dragon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DoraTest {
    Tile east  = new HonourTile(Wind.EAST);
    Tile south = new HonourTile(Wind.SOUTH);
    Tile west  = new HonourTile(Wind.WEST);
    Tile north = new HonourTile(Wind.NORTH);
    Tile white = new HonourTile(Dragon.WHITE);
    Tile green = new HonourTile(Dragon.GREEN);
    Tile red   = new HonourTile(Dragon.RED);
    Tile sou1 = new SuitTile(SuitType.SOUZU, 1);
    Tile sou6 = new SuitTile(SuitType.SOUZU, 6);
    Tile sou9 = new SuitTile(SuitType.SOUZU, 9);
    Tile man5 = new SuitTile(SuitType.MANZU, 5);
    Tile man7 = new SuitTile(SuitType.MANZU, 7);
    Tile man8 = new SuitTile(SuitType.MANZU, 8);
    Tile pin2 = new SuitTile(SuitType.PINZU, 2);
    Tile pin3 = new SuitTile(SuitType.PINZU, 3);

    @Test
    void windDora() {
        assertEquals(east, Dora.of(north));
        assertEquals(south, Dora.of(east));

        assertNotEquals(north, Dora.of(east));
        assertNotEquals(west, Dora.of(north));
    }

    @Test
    void dragonDora() {
        assertEquals(white, Dora.of(red));
        assertEquals(green, Dora.of(white));

        assertNotEquals(green, Dora.of(red));
        assertNotEquals(white, Dora.of(green));
    }

    @Test
    void suitDora() {
        assertEquals(sou1, Dora.of(sou9));
        assertEquals(pin3, Dora.of(pin2));
        assertEquals(man8, Dora.of(man7));

        assertNotEquals(sou6, Dora.of(man5));
        assertNotEquals(sou9, Dora.of(sou6));
        assertNotEquals(pin2, Dora.of(sou1));
    }

    @Test
    void crossHonourDora() {
        assertNotEquals(south, Dora.of(white));
        assertNotEquals(east, Dora.of(red));
        assertNotEquals(red, Dora.of(south));
    }
}