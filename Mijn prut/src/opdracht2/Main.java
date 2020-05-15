package opdracht2;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Node n0 = new Node("n0", false);
        Node n1 = new Node("n1", false);
        Node n2 = new Node("n2", false);
        Node n3 = new Node("n3", false);
        Node n4 = new Node("n4", false);
        Node n5 = new Node("n5", false);
        Node n6 = new Node("n6", false);

        Node e1 = new Node("1", true);
        Node e2 = new Node("2", true);
        Node e3 = new Node("3", true);
        Node e4 = new Node("4", true);
        Node e5 = new Node("5", true);
        Node e6 = new Node("6", true);


        n0.weg(n1, 16);
        n0.weg(n2, 20);
        n0.weg(n3, 25);
        n0.weg(n4, 12);
        n0.weg(n5, 28);

        n1.weg(n3, 15);
        n1.weg(n4, 30);
        n1.weg(n1, 16);
        n1.weg(n2, 31);
        n1.weg(n6, 8);


        n2.weg(n5, 23);
        n2.weg(n6, 18);
        n2.weg(n0, 17);
        n2.weg(n2, 21);
        n2.weg(n3, 20);

        n3.weg(n1, 24);
        n3.weg(n0, 9);
        n3.weg(n3, 17);
        n3.weg(n6, 20);
        n3.weg(n4, 30);

        n4.weg(n1, 27);
        n4.weg(n0, 36);
        n4.weg(n5, 21);
        n4.weg(n3, 16);

        n5.weg(n0, 17);
        n5.weg(n2, 17);
        n5.weg(e1, 24);
        n5.weg(e2, 21);
        n5.weg(e3, 21);

        n6.weg(n2, 20);
        n6.weg(n3, 19);
        n6.weg(e4, 24);
        n6.weg(e5, 18);
        n6.weg(e6, 19);

        n0.setDict('A', n1);
        n0.setDict('B', n2);
        n0.setDict('C', n3);
        n0.setDict('D', n4);
        n0.setDict('E', n5);

        n1.setDict('A', n1);
        n1.setDict('B', n2);
        n1.setDict('C', n4);
        n1.setDict('D', n6);

        n2.setDict('A', n0);
        n2.setDict('B', n1);
        n2.setDict('C', n5);
        n2.setDict('D', n6);

        n3.setDict('B', n0);
        n3.setDict('D', n3);
        n3.setDict('E', n5);

        n4.setDict('A', n1);
        n4.setDict('C', n1);
        n4.setDict('D', n1);
        n4.setDict('E', n1);

        n5.setDict('A', n0);
        n5.setDict('B', n3);
        n5.setDict('C', n4);
        n5.setDict('D', n5);
        n5.setDict('E', n6);

        n6.setDict('A', n0);
        n6.setDict('B', n1);
        n6.setDict('C', n2);
        n6.setDict('D', n3);
        n6.setDict('E', n4);
        n6.setDict('F', n5);
        n6.setDict('G', n6);

        List<Character> volgorde = new ArrayList<>();

        System.out.println(n0.nextB());

        volgorde.add('B');
        volgorde.add('D');
        volgorde.add('C');
        volgorde.add('A');
        volgorde.add('E');
        volgorde.add('E');
        volgorde.add('A');

        System.out.println(n0.nextA(volgorde, n0));
    }
}
