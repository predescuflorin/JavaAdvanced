package C1.hackerRankProblems;

import java.util.Scanner;

public class BonAppetit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int sumA = 0;

        for (int i = 0; i<n; i++) {
            int bills = scanner.nextInt();
            if (i!=k) { sumA  +=bills;
            }
        }
        sumA = sumA/2;
        int b=scanner.nextInt();
        if (sumA ==b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b-sumA);
        }

    }
}
