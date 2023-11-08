package Girokonto;

import java.util.Scanner;

public class Anwendung{


    public static void main(String[] args) {
        Girokonto moritz = new Girokonto("0003425790", 12000, 13000);
        Scanner scanner = new Scanner(System.in);


        System.out.println("Kontostand: " + moritz.getKontostand());
        System.out.println("Kontonummer: " + moritz.getKontonummer());
        System.out.println("-----------");

        System.out.println("Welche Transaktion möchten Sie durchführen?");
        System.out.println("Auszahlung: 1");
        System.out.println("Einzahlung: 2");
        System.out.println("Verlassen: 3");
        int transaction = scanner.nextInt();
        while(transaction != 3){
            switch (transaction){
                case 1:
                    System.out.println("Wie viel Geld wollen Sie auszahlen?");
                    double auszahlbetrag = scanner.nextDouble();
                    moritz.auszahlen(auszahlbetrag);
                    System.out.println(moritz.kontostand);
                case 2:
                    System.out.println("Wie viel Geld wollen Sie auszahlen?");
                    double einzahlbetrag = scanner.nextDouble();
                    moritz.einzahlen(einzahlbetrag);
                    System.out.println(moritz.kontostand);
                case 3: System.exit(0);
            }
            System.out.println("Möchten Sie eine weitere Transaktion vornehmen?");
            transaction = scanner.nextInt();

        }

    }

}
