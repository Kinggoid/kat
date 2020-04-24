package Bossen;

public class Rivier {
    int breedteVanDeRivier;
    String naam;


    public Rivier(int breedteVanDeRivier, String naam) {
        this.breedteVanDeRivier = breedteVanDeRivier;
        this.naam = naam;
    }

    public String toString() {
        return "Rivier{" +
                "breedteVanDeRivier=" + breedteVanDeRivier +
                ", naam='" + naam + '\'' +
                '}';
    }
}
//dit moet ik doen om het te pushen