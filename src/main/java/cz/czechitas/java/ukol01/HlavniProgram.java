package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();



    public void start() {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(400);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliDomecek(100);
        nakresliDomecek1(100);
        nakresliDomecek1(100);
        nakresliDomecek1(100);
        nakresliDomecek1(100);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliDomecek(100);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(700);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliDomecek(100);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(300);
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.turnRight(180);
        zofka.penDown();
        nakresliPrasatko();
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(400);
        zofka.turnRight(90);
        zofka.move(500);
        zofka.penDown();
        nakresliL(100);
        nakresliE(50);
        nakresliN(100);
        nakresliK(100);
        nakresliA(100);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(550);
        zofka.turnLeft(90);
        zofka.move(550);
        zofka.penDown();
        nakresliSlunicko(18);



    }
    private void nakresliPrasatko() {
        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(100);
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
    }


    public void nakresliSlunicko(double polomer){
        for(int i = 0; i < 18; i++) {
            zofka.move(10);
            zofka.turnRight(20);
            zofka.turnLeft(90);
            zofka.move(20);
            zofka.turnRight(180);
            zofka.move(20);
            zofka.turnLeft(90);
        }
    }

    public void nakresliDomecek(double strana) {
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
    }

    public void nakresliDomecek1(double strana) {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.penDown();
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
    }

    public void nakresliL(double strana) {
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(80);
    }
    public void nakresliE(double strana) {
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
    }

    public void nakresliN(double strana) {
        zofka.penUp();
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(100);
        zofka.turnRight(135);
        zofka.move(140);
        zofka.turnLeft(135);
        zofka.move(100);
    }

    public void nakresliK(double strana) {
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
    }

    public void nakresliA(double strana) {
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
    }








    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
