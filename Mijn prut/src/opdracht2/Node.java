package opdracht2;

import java.util.*;
import java.util.stream.IntStream;


public class Node {
    String mainNode;
    Boolean isEindNode;
    private Map<Node, Integer> wegen = new HashMap();
    private Map<String, Integer> eindnode = new HashMap();
    private Map<Character, Node> dict = new HashMap<>();
    private List<String> nodeVolgorde = new ArrayList<>();

    public Node(String mainNode, boolean waar) {
        this.mainNode = mainNode;
        isEindNode = waar;
    }

    public void weg(Node node, int getal) {
        wegen.put(node, getal);
    }

    public String nextB() {
        List<Node> kansen = new ArrayList<>();

        for (Node i : wegen.keySet()) {
            IntStream.range(0, wegen.get(i)).forEachOrdered(n -> {
                kansen.add(i);
            });
        }
        Random generator = new Random();
        int volgende = generator.nextInt(101);

        Node volgendeNode = kansen.get(volgende);

        if (volgendeNode.isEindNode) {
            return volgendeNode.mainNode;
        }
        return volgendeNode.nextB();
    }

    public void setDict(char nummer, Node node) {
        dict.put(nummer, node);
    }

    public List<String> nextA(List order, Node node) {
        char eerste = (char) order.get(0);
        node.nodeVolgorde.add(mainNode);
        if (dict.containsKey(eerste)) {
            if (order.size() == 1) {
                node.nodeVolgorde.add(dict.get(eerste).mainNode);
                return node.nodeVolgorde;
            } else {
                return dict.get(eerste).nextA(order.subList(1, order.size()), node);
            }
        } else {
            System.out.println("Node '" + mainNode + "' heeft geen weg '" + eerste + "'.");
            return node.nodeVolgorde;
        }
    }

}


