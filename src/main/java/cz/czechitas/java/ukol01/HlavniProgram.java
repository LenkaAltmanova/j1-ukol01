package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(45);
        zofka.move(71);
        zofka.turnRight(90);
        zofka.move(71);
        zofka.turnRight(45);

        for(int i = 0; i < 2; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }

        zofka.turnLeft(45);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnLeft(45);
        zofka.move(100);
        zofka.turnLeft(45);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(120);

    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
