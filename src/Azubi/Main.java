package Azubi;

public class Main {
    public static void main(String[] args) {
        Mitarbeiter Sebastian = new Mitarbeiter("Weih", "Sebastian",19,4,1985, 80000);
        Lehrling Moritz = new Lehrling("Meier", "Moritz", 28,12,2001, 12000, 2);
        Angestellter Stefan = new Angestellter("Stefan", "Egerer", 4, 8, 1995, 40000, 6);
        Sebastian.print();
        Moritz.print();
        Stefan.print();

        for (int i = 0; i < 6; i++) {
            Stefan.befoerdern();
            Stefan.print();
        }
    }
}
