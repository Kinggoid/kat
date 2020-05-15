package opdracht2;

import java.util.*;
import java.util.stream.IntStream;


public class Node {
    String mainNode; //Naam van node
    Boolean isEindNode; //Is het een eindnode
    private Map<Node, Integer> wegen = new HashMap(); // Naar welke richting elke node op kan (2a)
    private Map<Character, Node> dict = new HashMap<>(); // Naar welke node deze node naartoe kan en hoeveel kans hij daarop heeft (2b)
    private List<String> nodeVolgorde = new ArrayList<>(); // Langs welke nodes komen we met de volgorde (2b)

    public Node(String mainNode, boolean waar) {
        this.mainNode = mainNode;
        isEindNode = waar;
    }

    public void weg(Node node, int getal) {
        wegen.put(node, getal);
    }



    public String nextB() {
        List<Node> kansen = new ArrayList<>();
        // Als een node 30% kans heeft om de volgende node in de reeks te worden dan komt hij 30 keer in deze lijst voor

        for (Node i : wegen.keySet()) {
            IntStream.range(0, wegen.get(i)).forEachOrdered(n -> {
                kansen.add(i);
            });
        }
        Random generator = new Random();
        int volgende = generator.nextInt(101);

        Node volgendeNode = kansen.get(volgende); // Pakt een random node uit de lijst van honderd nodes

        if (volgendeNode.isEindNode) { // Als de gekozen node een eindnode is, dan returnt hij de naam van deze eindnode
            return volgendeNode.mainNode;
        }
        return volgendeNode.nextB(); // Als ie niet een eindnode teruggeeft gaan we naar de volgende node en dan begint het proces opnieuw tot we een eindnode vinden
    }

    public void setDict(char nummer, Node node) {
        dict.put(nummer, node);
    }

    public List<String> nextA(List order, Node node) {
        // Deze tussenfunctie is vooral zodat ik de lijst "nodeVolgorde" kan clearen zodat ik niet op deze lijst voortbouw
        // Als ik weer deze methode op deze node oproep.

        nodeVolgorde.clear();
        List<String> antwoord = nxtA(order, node);
        return antwoord;
    }

    public List<String> nxtA(List order, Node node) {
        char eerste = (char) order.get(0); // Pakt eerstvolgende node uit de lijst
        node.nodeVolgorde.add(mainNode); // Voegt node toe aan de lijst
        if (dict.containsKey(eerste)) { // Als dit pad bestaat
            if (order.size() == 1) { // Als er nog maar één element in de volgorde staat doet hij dit nog bij de lijst en dan returnt hij deze
                node.nodeVolgorde.add(dict.get(eerste).mainNode);
                return node.nodeVolgorde;
            } else {
                return dict.get(eerste).nxtA(order.subList(1, order.size()), node); // Ga de volgorde af
            }
        } else { // als dit pad niet bestaat
            System.out.println("Node '" + mainNode + "' heeft geen weg '" + eerste + "'.");
            return node.nodeVolgorde;
        }
    }

}


