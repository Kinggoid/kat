package opdacht1a;

public class Main {
    public static void main(String[] args) {
        AutoHuur huurder1 = new AutoHuur();
        System.out.println("Eerste autohuur: " + huurder1.toString());

        Klant klant = new Klant("Mijnheer de Vries");
        klant.setKorting(10.0);
        huurder1.setHuurder(klant);
        System.out.println("Eerste autohuur: " + huurder1.toString());

        Auto a1 = new Auto("Peugeot 207", 50);
        huurder1.setGehuurdeAuto(a1);
        huurder1.setAantalDagen(4);
        System.out.println("Eerste autohuur:" + huurder1.toString());

        AutoHuur huurder2 = new AutoHuur();
        Auto andereAuto = new Auto("Ferrari", 3500);
        huurder2.setGehuurdeAuto(andereAuto);
        huurder2.setHuurder(klant);
        huurder2.setAantalDagen(1);
        System.out.println("Tweede autohuur: " + huurder2.toString());

        System.out.println("Gehuurd: " + huurder1.getGehuurdeAuto());
        System.out.println("Gehuurd: " + huurder2.getGehuurdeAuto());
    }
}
