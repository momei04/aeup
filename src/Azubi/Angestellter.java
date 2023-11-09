package Azubi;

public class Angestellter extends Mitarbeiter{
    private int hirachiestufe;

    public Angestellter(String name, String vorname, int day, int month, int year, double gehalt, int hirachiestufe) {
        super(name, vorname, day, month, year, gehalt);
        setHirachiestufe(hirachiestufe);
    }

    public void setHirachiestufe(int hirachiestufe) {
        if (this.hirachiestufe >1 && this.hirachiestufe < 5){
            this.hirachiestufe = hirachiestufe;
        }else {
            System.out.println("Die Hirachiestufe muss zwischen 1 und 5 liegen.\n " +
                            "Aufgrund ihrer Eingaben wurde die Hirachistufe standartmäßig auf 1 gesetzt"
                    );
            this.hirachiestufe = 1;
        }

    }

    @Override
    public void print() {
        System.out.println("--------------------");
        super.print();
        System.out.println("Gehaltsstufe: "+ this.hirachiestufe);
    }

    public void befoerdern(){
        if(hirachiestufe <= 4){
            hirachiestufe += 1;
        }else{
            System.out.println("Dieser Mitarbeiter ist schon auf der maximalen Beförderungsstufe");
        }

    }
}
