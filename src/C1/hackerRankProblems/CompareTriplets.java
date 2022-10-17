package C1.hackerRankProblems;

import java.util.Scanner;

public class CompareTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int b3 = scanner.nextInt();
        int countA = 0;
        int countB =0;
        if (a1>b1) {countA++;}
        else if (b1>a1) {countB++;}

        if (a2>b2) {countA++;}
        else if (b2>a2) {countB++;}

        if (a3>b3) {countA++;}
        else if (b3>a3) {countB++;}

        System.out.println(countA + " " + countB);

    }
}
