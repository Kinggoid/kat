package Bossen;

public class Boom {
    String soortBoom;
    int aantalBladeren;


    public Boom(String soortBoom, int aantalBladeren) {
        this.soortBoom = soortBoom;
        this.aantalBladeren = aantalBladeren;
    }

    public String toString() {
        return "Boom{" +
                "soortBoom='" + soortBoom + '\'' +
                ", aantalBladeren=" + aantalBladeren +
                '}';
    }
}
//dit moet ik doen om het te pushen