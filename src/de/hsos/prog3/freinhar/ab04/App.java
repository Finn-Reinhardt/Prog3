package de.hsos.prog3.freinhar.ab04;

import de.hsos.prog3.freinhar.ab04.basket.util.Interaktionsbrett;

public class App {

    public static void main(String[] args) {
        // write your code here
        Gamemaster gamemaster = new Gamemaster();
    }

    /*public void legacy(){
        Interaktionsbrett ib = new Interaktionsbrett();
        Ball ball = new Ball();
        Korb korb = new Korb();
        ball.darstellen(ib);
        korb.darstellen(ib);

        long start = System.currentTimeMillis();
        long stop = System.currentTimeMillis();

        long time = start-stop;

        if(korb.getroffen(ball)){
            int x = 100,y = 100;
            ib.neuerText(x,y,"Sie haben "+time+" Millisekunden benötigt.");
        }
    }*/
}
