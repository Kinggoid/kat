package Opdracht3a;

public class Main {
    public static void main(String[] args) {
        AlfabetCode deze = new AlfabetCode();
        deze.sortedLetters(); // Deze werkt het beste van de twee
        deze.iets(); // Bij deze gebruik ik treeSort maar daar kan ik niet twee dezelfde letters van het alfabet in één set stoppen.
                     // Dus dan pakt hij gewoon een nieuwe letter en dan gebruikt ie die. Maar dit is niet wat we zouden willen.

        System.out.println(deze.list1);
        System.out.println(deze.list2);
        }
    }

