package opdacht1a;

public class Auto {
    private String type;
    private double PrijsPerDag;

    public Auto(String AutoType, double Prijs) {
        type = AutoType;
        PrijsPerDag = Prijs;
    }

    public void setPrijsPerDag(double Prijs) {
        PrijsPerDag = Prijs;
    }

    public double getPrijsPerDag() {
        return PrijsPerDag;
    }

    public String toString() {
        return "type='" + type + '\'' +
                ", PrijsPerDag=" + PrijsPerDag;
    }
}
