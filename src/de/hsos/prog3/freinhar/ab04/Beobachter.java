package de.hsos.prog3.freinhar.ab04;

import de.hsos.prog3.freinhar.ab04.basket.util.Interaktionsbrett;

public class Beobachter {
    int x, y;
    public boolean mitMausAngeklickt(String name, int x, int y) {
       /* System.out.println("Ich wurde angeklickt");*/

        return true;
    }

    public boolean mitMausVerschoben(String name, int x, int y) {
        /*System.out.println("Ich wurde verschoben");*/
        return true;
    }

    public boolean mitMausLosgelassen(String name, int x, int y) {
       /* System.out.println("Ich wurde losgelassen");*/
        this.x = x;
        this.y = y;
        return true;
    }
}
