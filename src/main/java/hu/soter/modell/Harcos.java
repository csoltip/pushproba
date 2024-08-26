package hu.soter.modell;

public class Harcos {
    private int ero;

    public Harcos(int ero) {
        this.setEro(ero);
    }

    public int getEro() {
        return ero;
    }

    public void setEro(int ero) {
        this.ero = ero;
    }

    @Override
    public String toString() {
        return "Harcos{" +
                "ero=" + ero +
                '}';
    }
}
