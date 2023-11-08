package Azubi;

import java.time.LocalDate;
import java.util.Date;

public class Mitarbeiter {
    private String name;
    private String vorname;
    private LocalDate geburtsdatum;
    private double gehalt;
    private int lehrjahr;

    public Mitarbeiter(String name, String vorname, int day, int month, int year, double gehalt) {
        this.name = name;
        this.vorname = vorname;
        this.geburtsdatum = LocalDate.of(year, month, day);
        this.gehalt = gehalt;
    }

    public void print(){
        System.out.println("Name: "+this.name);
        System.out.println("Vorname: "+this.vorname);
        System.out.println("Geburtstag: "+this.geburtsdatum);
        System.out.println("Gehalt: "+this.gehalt);
    }


}

