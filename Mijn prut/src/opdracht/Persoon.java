package opdracht;

public class Persoon {
    private String naam;
    private int studentennummer;

    public Persoon(String name) {
        naam = name;
    }

    public String getNaam() {
        return naam;
    }

    public Persoon(String name, int nummer) {
        naam = name;
        studentennummer = nummer;
    }

    public int getStudentennummer() {
        return studentennummer;
    }

    public void setStudentennummer(int klei) {
        studentennummer = klei;
    }

    public String toString() {
        return "naam='" + naam + '\'' +
                ", nummer=" + studentennummer;
    }
}
//dit moet ik doen om het te pushen
