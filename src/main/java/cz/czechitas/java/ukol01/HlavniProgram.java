package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();
        /* první úkol + druhý ukol
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(400);
        zofka.penDown();
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
        konec prvního úkolu

        zofka.penUp();
        zofka.move(150);
        zofka.penDown();
        for(int i = 0; i < 8; i++) {
            zofka.move(50);
            zofka.turnRight(45);
        }
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();
        for(int i = 0; i < 18; i++) {
            zofka.move(20);
            zofka.turnRight(20);
        }
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();
        for(int i = 0; i < 18; i++) {
            zofka.move(20);
            zofka.turnRight(20);
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.turnRight(180);
            zofka.move(30);
            zofka.turnLeft(90);
        }
        Konec prvního a druhého úkolu
         */
        //sluníčko
        zofka.penUp();
        zofka.move(300);
        zofka.turnLeft(90);
        zofka.move(400);
        zofka.turnRight(180);
        zofka.penDown();
        for(int i = 0; i < 18; i++) {
            zofka.move(10);
            zofka.turnRight(20);
            zofka.turnLeft(90);
            zofka.move(20);
            zofka.turnRight(180);
            zofka.move(20);
            zofka.turnLeft(90);
        }

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnRight(180);
        zofka.penDown();

        //domečky 5x
        for (int i = 0; i < 1; i++) {
            zofka.turnRight(45);
            zofka.move(71);
            zofka.turnRight(90);
            zofka.move(71);
            zofka.turnRight(45);
        }

        for(int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.penDown();
        zofka.turnLeft(90);

        for (int i = 0; i < 1; i++) {
            zofka.turnRight(45);
            zofka.move(71);
            zofka.turnRight(90);
            zofka.move(71);
            zofka.turnRight(45);
        }

        for(int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.penDown();
        zofka.turnLeft(90);

        for (int i = 0; i < 1; i++) {
            zofka.turnRight(45);
            zofka.move(71);
            zofka.turnRight(90);
            zofka.move(71);
            zofka.turnRight(45);
        }

        for(int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.penDown();
        zofka.turnLeft(90);

        for (int i = 0; i < 1; i++) {
            zofka.turnRight(45);
            zofka.move(71);
            zofka.turnRight(90);
            zofka.move(71);
            zofka.turnRight(45);
        }

        for(int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.penDown();
        zofka.turnLeft(90);

        for (int i = 0; i < 1; i++) {
            zofka.turnRight(45);
            zofka.move(71);
            zofka.turnRight(90);
            zofka.move(71);
            zofka.turnRight(45);
        }

        for(int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
        //domečky druhá řada
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.penDown();

        for (int i = 0; i < 1; i++) {
            zofka.turnLeft(45);
            zofka.move(71);
            zofka.turnLeft(90);
            zofka.move(71);
            zofka.turnLeft(45);
        }

        for(int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
        }
        //prasátko
        zofka.penUp();
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.penDown();
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

        //posledni domeček
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(400);
        zofka.turnRight(90);
        zofka.penDown();

        for (int i = 0; i < 1; i++) {
            zofka.turnLeft(45);
            zofka.move(71);
            zofka.turnLeft(90);
            zofka.move(71);
            zofka.turnLeft(45);
        }

        for(int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
        }

        //jmeno Lenka
        zofka.penUp();
        zofka.move(150);
        zofka.penDown();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(80);
        //L
        zofka.penUp();
        zofka.move(50);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnRight(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnRight(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(60);
        //E
        zofka.penUp();
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(100);
        zofka.turnRight(135);
        zofka.move(140);
        zofka.turnLeft(135);
        zofka.move(100);
        //N
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnLeft(135);
        zofka.move(70);
        zofka.turnLeft(180);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(70);
        //K
        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(50);
        zofka.turnLeft(70);
        zofka.penDown();
        zofka.move(120);
        zofka.turnRight(135);
        zofka.move(120);
        zofka.turnRight(180);
        zofka.move(60);
        zofka.turnLeft(70);
        zofka.move(40);
        //A








    }



    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
