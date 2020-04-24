package Bossen;

public class Dier implements Leven {
    int leeftijd;
    String soort;
    String naam;


    public Dier(int leeftijd, String soort, String naam) {
        this.leeftijd = leeftijd;
        this.soort = soort;
        this.naam = naam;
    }

    public String toString() {
        return "Dier{" +
                "leeftijd=" + leeftijd +
                ", soort='" + soort + '\'' +
                ", naam='" + naam + '\'' +
                '}';
    }

    public void eten() {
        System.out.println(naam + " is aan het eten.");
    }

    public void slapen() {
        System.out.println(naam + " is aan het slapen.");
    }
}
//dit moet ik doen om het te pushen
