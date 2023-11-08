package Azubi;

public class Main {
    public static void main(String[] args) {
        Mitarbeiter Sebastian = new Mitarbeiter("Weih", "Sebastian",19,4,1985, 80000);
        Lehrling Moritz = new Lehrling("Meier", "Moritz", 28,12,2001, 12000, 2);

        Sebastian.print();
        Moritz.print();

    }
}
