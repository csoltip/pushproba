package hu.soter;

import hu.soter.modell.Harcos;

public class Main {

    private Harcos h;

    public Main() {
        kiiro();
        h = new Harcos(5);
    }

    private static void kiiro() {
        System.out.println();
    }


    public static void main(String[] args) {
        kiiro();
        new Main().feladat();
    }

    private void feladat() {
        System.out.println(h);
    }
}