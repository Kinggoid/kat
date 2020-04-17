package opdracht;

public class egeli {
    private String naam;
    private int age;

    public egeli(String name, int leeftijd) {
        naam = name;
        age = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "naam='" + naam + '\'' +
                ", age=" + age;
    }
}