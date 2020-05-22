package Opdracht3a;

public class Main {
    public static void main(String[] args) {
        AlfabetCode deze = new AlfabetCode();
        deze.sortedLetters(); // Deze werkt het beste van de twee
        deze.iets(); // Bij deze gebruik ik treeSort 'want die sort automatisch' maar het is een set waardoor je niet twee dezelfde letters kan sorteren.

        System.out.println(deze.list1);
        System.out.println(deze.list2);
        }
    }

