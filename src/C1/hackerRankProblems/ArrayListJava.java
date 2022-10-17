package C1.hackerRankProblems;

import java.util.Scanner;

public class ArrayListJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        while (scanner.hasNext()) {
            String linie = scanner.nextLine();
            System.out.print(i+" " + linie);
            i++;
        }
        scanner.close();
    }
}

   