package Bossen;

public class Bos {
    String naamBos;
    String land;
    int aantalBomen;
    int aantalDieren;
    private Boswachter boswachter;



    public Boswachter getBoswachter() {
        return boswachter;
    }

    public void setBoswachter(Boswachter boswachter) {
        this.boswachter = boswachter;
    }





    public Bos(String naamBos, String land, int aantalBomen, int aantalDieren) {
        this.naamBos = naamBos;
        this.land = land;
        this.aantalBomen = aantalBomen;
        this.aantalDieren = aantalDieren;
    }



    public String toString() {
        return "Bos{" +
                "naamBos='" + naamBos + '\'' +
                ", land='" + land + '\'' +
                ", aantalBomen=" + aantalBomen +
                ", aantalDieren=" + aantalDieren +
                ", boswachter=" + boswachter +
                '}';
    }
}
