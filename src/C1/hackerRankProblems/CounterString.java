package C1.hackerRankProblems;

import java.util.ArrayList;
import java.util.Hashtable;

public class CounterString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Marin");
        list.add("Ana");
        list.add("Cornel");
        list.add("Ana");
        list.remove("Marin");
        list.add("Ana");

        Hashtable<String, Integer> order = new Hashtable<>();

        for (String i : list
        ) {
            if (order.get(i) == null) {
                order.put(i, 1);
            } else {
                int a = order.get(i);
                a++;
                order.put(i, a);

            }

        }
        System.out.println(order.toString());
    }

    }

