package FSM;

public class Node {
    String naam;
    String Node1;
    String Node2;

    public Node(String name) {
        naam = name;
    }

    public void setNode1(String node1) {
        Node1 = node1;
    }

    public void setNode2(String node2) {
        Node2 = node2;
    }

    public String getNaam() {
        return naam;
    }

    public String check(String letter) {
        if (letter.equals("A")) {
            if (Node1 == null) {
                return "Dit pad gaat niet verder";
            }
            return Node1;
        } else if (letter.equals("B")) {
            if (Node2 == null) {
                return "Dit pad gaat niet verder";
            }
            return Node2;
        } else {
            return "Dit pad gaat niet verder";
        }
    }
}
