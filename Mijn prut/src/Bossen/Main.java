package Bossen;

public class Main {

    public static void main(String[] args) {

        Dier Knabbel = new Dier(7, "Eekhoorn", "Knabbel");
        System.out.println(Knabbel.toString());

        Boom boom1 = new Boom("Eik", 5238475);
        System.out.println(boom1.toString());

        Rivier rivier1 = new Rivier(300, "Moe");
        System.out.println(rivier1.toString());

        Bos bos1 = new Bos("Honderd Bunderbos", "Narnia", 1000, 200);

        Boswachter Rik = new Boswachter("rick", 42, false, 10.0, bos1.aantalDieren, bos1.aantalBomen);
        System.out.println(Rik.naam + " verdient " + Rik.salaris() + " euro per uur als boswachter!");
    }
}
