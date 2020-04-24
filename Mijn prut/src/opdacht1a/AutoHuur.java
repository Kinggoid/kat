package opdacht1a;

public class AutoHuur {
    private int aantalDagen;
    private Klant klant;
    private Auto auto;


    public AutoHuur() {
    }

    public void setAantalDagen(int dagen) {
        aantalDagen = dagen;
    }

    public void setGehuurdeAuto(Auto autos) {
        auto = autos;
    }

    public Auto getGehuurdeAuto() {
        return auto;
    }

    public void setHuurder(Klant k) {
        klant = k;
    }

    public Klant getHuurder() {
        return klant;
    }

    public double totaalPrijs() {
        return (auto.getPrijsPerDag() * (1 - klant.getKorting()) * aantalDagen);
    }

    public String toString() {
        return "aantalDagen=" + aantalDagen +
                ", klant=" + klant +
                ", auto=" + auto;
    }
}
