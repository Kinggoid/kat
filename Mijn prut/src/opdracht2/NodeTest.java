package opdracht2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

class NodeTest {
    Node n1 = new Node("n1", false);
    Node n2 = new Node("n2", false);
    Node e1 = new Node("1", true);
    Node e2 = new Node("2", true);

    @Test
    public void nextB() {
        n1.weg(n1, 50);
        n1.weg(n2, 50);
        n2.weg(n1, 50);
        n2.weg(n2, 50);
        n2.weg(e1, 100);
        n2.weg(e2, 0);

        assertEquals("1", n1.nextB()); // Ik heb de kansen zo gezet dat als alles klopt er alleen maar een '1' uit kan komen
    }

    @Test
    public void nextA() {
        n1.setDict('A', n2);
        n1.setDict('B', n1);
        n2.setDict('A', n1);
        n2.setDict('B', n2);

        List<Character> volgorde1 = new ArrayList<>();
        volgorde1.add('A');
        volgorde1.add('B');
        volgorde1.add('A');
        volgorde1.add('B');

        List<Character> volgorde2 = new ArrayList<>();
        volgorde2.add('A');
        volgorde2.add('B');
        volgorde2.add('C');
        volgorde2.add('A');

        List<String> nodeVolgorde1 = new ArrayList<>();
        nodeVolgorde1.add("n1");
        nodeVolgorde1.add("n2");
        nodeVolgorde1.add("n2");
        nodeVolgorde1.add("n1");
        nodeVolgorde1.add("n1");

        List<String> nodeVolgorde2 = new ArrayList<>();
        nodeVolgorde2.add("n1");
        nodeVolgorde2.add("n2");
        nodeVolgorde2.add("n2");

        assertEquals(nodeVolgorde1, n1.nextA(volgorde1, n1)); // Deze heeft een normale volgorde
        assertEquals(nodeVolgorde2, n1.nextA(volgorde2, n1)); // Deze heeft een volgorde die niet klopt en vroeger stopt
    }
}