package opdacht1a;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String name) {
        naam = name;
    }

    public String getNaam() {
        return naam;
    }

    public void setKorting(double korting) {
        kortingsPercentage = korting;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public String toString() {
        return "naam='" + naam + '\'' +
                ", kortingsPercentage=" + kortingsPercentage;
    }
}
