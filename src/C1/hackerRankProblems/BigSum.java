package C1.hackerRankProblems;

import java.util.Scanner;

public class BigSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        long n = scanner.nextLong();
        for (int i = 0; i<n; i++) {
        long elem =scanner.nextLong();
        sum +=elem;
        }
        System.out.println(sum);
    }
}
