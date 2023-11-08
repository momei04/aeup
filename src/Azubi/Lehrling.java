package Azubi;

import java.time.LocalDate;

public class Lehrling extends Mitarbeiter{
    private int lehrjahr;

    public Lehrling(String name, String vorname, int day, int month, int year, double gehalt, int lehrjahr) {
        super(name, vorname, day, month, year, gehalt);
        this.lehrjahr = lehrjahr;
    }

    @Override
    public void print() {
        System.out.println("--------------------------------");
        super.print();
        System.out.println("Lehrjahr: " + lehrjahr);
        System.out.println("--------------------------------");
    }
}
