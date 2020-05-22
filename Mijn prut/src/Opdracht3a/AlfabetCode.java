package Opdracht3a;

import java.text.Collator;
import java.util.*;

public class AlfabetCode {
    List<String> list1 = new ArrayList<>();
    Collection<String> list2 = new TreeSet<String>(Collator.getInstance());

    public void sortedLetters() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rand = new Random();
        List<Integer> lst = new ArrayList<>();

        while (lst.size() < 5) {
            int index = rand.nextInt(letters.length());
            lst.add(index);
        }

        boolean waar = true;

        while (waar) {
            int gebruikt = 0;
            for (int i = 1; i < lst.size(); i++) {
                if (lst.get(i - 1) > lst.get(i)) {
                    Collections.swap(lst, i - 1, i);
                    gebruikt = 1;
                }
            }
            if (gebruikt == 0) {
                break;
            }
        }
        for (Integer i : lst) {
            list1.add(String.valueOf(letters.charAt(i)));
        }
        }


    public void iets() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rand = new Random();

        while (list2.size() < 5) {
            int index = rand.nextInt(letters.length());
            list2.add(String.valueOf(letters.charAt(index)));
        }
    }
}
