package Girokonto;

public class Konto {
    protected String kontonummer;
    protected double kontostand;

    public Konto(String kontonummer, double kontostand) {
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void einzahlen (double betrag){
        kontostand += betrag;
        //return "Einzahlen erfolgreich" + kontostand;
    }

    public void auszahlen(double betrag){
        if (kontostand - betrag < 0){
            kontostand -= betrag;
            //return "Erfolgreich "+ betrag + " abgehoben; Neuer Kontostand: " + kontostand;
        }else{
            System.out.println("Nicht genügend Geld");
        }
    }
}
