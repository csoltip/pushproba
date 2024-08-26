package hu.soter;

import hu.soter.modell.Harcos;

public class Main {

    private static Harcos h;

    public Main() {
        h = new Harcos(5);
        kiiro("alap: " + h.getEro() );
        h.setEro(7);
        kiiro("beállítva: " + h.getEro() + "");
    }

    private static void kiiro(String msg) {
        System.out.println(msg);
    }


    public static void main(String[] args) {
        kiiro("kezdés:");
        new Main().feladat();
    }

    private void feladat() {
        System.out.println(h);
    }
}