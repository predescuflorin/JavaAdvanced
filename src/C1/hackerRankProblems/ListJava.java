package C1.hackerRankProblems;

import java.util.*;


public class ListJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<N; i++) {
            int value = scan.nextInt();
            list.add(value);
        }

        int Q = scan.nextInt();
        for (int i = 0;i<Q; i++){
            String toDo = scan.next();
            if (toDo.equalsIgnoreCase("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else { if (toDo.equalsIgnoreCase("Delete")) {
                int index = scan.nextInt();
                list.remove(index);
            }
            }
        }

        for (Integer x:list
             ) {
            System.out.print(x + " ");

        }
    }
}
