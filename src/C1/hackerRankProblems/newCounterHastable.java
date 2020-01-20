package C1.hackerRankProblems;

import java.util.ArrayList;
import java.util.Hashtable;

public class newCounterHastable {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Marin");
        list.add("Ana");
        list.add("Cornel");
        list.add("Ana");
        list.add("Ana");

        Hashtable<String, Integer> counterH = new Hashtable<>();
        for (String x: list
             ) {if (counterH.get(x) == null) {counterH.put(x,1);
        } else {int a = counterH.get(x);
        a++;
            counterH.put(x,a); }
        }
        System.out.println(counterH.size());
        }
}
