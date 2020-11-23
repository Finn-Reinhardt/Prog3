package de.hsos.prog3.freinhar.ab04;

import de.hsos.prog3.freinhar.ab04.basket.util.Interaktionsbrett;

public class Korb {

    int x, y;
    int breite = 100;
    int hoehe = 100;

    int range_MIN = 10;
    int range_MAX = 100;

    Korb() {

    }

    void darstellen(Interaktionsbrett ib) {
        setX(ib.zufall(range_MIN, range_MAX));
        setY(ib.zufall(range_MIN, range_MAX));
        ib.neuesRechteck(this, "Finn", x, y, breite, hoehe);
    }

    boolean getroffen(Ball ball) {
        //X-Koordinate stimmt
        if (ball.getX() > this.x + ball.getRadius() && ball.getX() < this.x + this.breite - ball.getRadius()) {
            //Y-Koordinate stimmt
            if (ball.getY() > this.y + ball.getRadius() && ball.getY() < this.y + this.hoehe - ball.getRadius()) {
                //Der Ball ist im Feld und berührt das Rechteck nicht
                return true;
            }
        }
        return false;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCenterX(){
        return (this.x + breite/2);
    }

    public int getY(){
        return this.y;
    }
}
