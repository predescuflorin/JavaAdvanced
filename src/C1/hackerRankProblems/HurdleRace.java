package C1.hackerRankProblems;

import java.util.Scanner;

public class HurdleRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int maxHeight = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++) {
            int height = scanner.nextInt();
            maxHeight = Math.max(maxHeight, height);
        }
        if ((maxHeight -k ) >0) {
            System.out.println(maxHeight -k);
        } else {
            System.out.println(0);
        }
    }
}
