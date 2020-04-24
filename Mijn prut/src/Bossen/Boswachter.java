package Bossen;

public class Boswachter implements Leven {
    String naam;
    int leeftijd;
    boolean intern;
    double euroPerUur;
    int dieren;
    int bomen;


    public Boswachter(String naam, int leeftijd, boolean intern, double euroPerUur, int dieren, int bomen) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.intern = intern;
        this.euroPerUur = euroPerUur;
        this.dieren = dieren;
        this.bomen = bomen;
    }



    public void praten(String name) {
        System.out.println("Hey, wandelaar. Ik ben " + name + " en ik ben de boswachter van dit bos.");
    }

    public String toString() {
        return "Boswachter{" +
                "naam='" + naam + '\'' +
                ", leeftijd=" + leeftijd +
                '}';
    }

    public double salaris() {
        double totaal = euroPerUur * (bomen * 0.0001 + dieren * 0.008);

        if (intern) {
            return totaal * 0.5;
        }
        else {
            return totaal;
        }
    }

    public void eten() {
        System.out.println(naam + " is aan het eten.");
    }

    public void slapen() {
        System.out.println(naam + " is aan het slapen.");
    }
}
//dit moet ik doen om het te pushen