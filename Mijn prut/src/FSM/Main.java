package FSM;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        s0.setNode1("s2");
        s0.setNode2("s1");
        s1.setNode1("s1");
        s1.setNode2("s2");
        s2.setNode2("s3");
        s3.setNode1("s3");
        s3.setNode2("s0");

        List<String> order = new ArrayList<String>();

        order.add("A");
        order.add("C");
        order.add("A");

        List<String> antwoord = new ArrayList<String>();

        antwoord.add("s0");

        String node = "s0";

        for (String i : order) {
            if (node.equals("Dit pad gaat niet verder")) {
                break;
            }
            switch (node) {
                case "s0":
                    node = s0.check(i);
                    antwoord.add(node);
                    break;
                case "s1":
                    node = s1.check(i);
                    antwoord.add(node);
                    break;
                case "s2":
                    node = s2.check(i);
                    antwoord.add(node);
                    break;
                case "s3":
                    node = s3.check(i);
                    antwoord.add(node);
                    break;
            }
        }
        System.out.println(antwoord);
    }

}
