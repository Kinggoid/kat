package opdracht;

public class Main {

    public static void main(String[] args) {


        egeli k = new egeli("Sonic", 2);
        System.out.println(k.toString());


        egeli e = new egeli("Senic", 7);
        System.out.println(e.toString());




        Persoon j = new Persoon("Mr. poep", 123847);
        System.out.println(j.toString());

        Persoon o = new Persoon("Dr. Eggman");
        System.out.println(o.getNaam());

        o.setStudentennummer(19837);
        System.out.println(o.toString());


    }
}