package C1.hackerRankProblems;

import java.util.Scanner;

public class Staircases {
    public static void main(String[] args) {
        Scanner diez = new Scanner(System.in);
        int n = diez.nextInt();
     diez.close();

     for (int a = n-1; a>=0; a--) {
            for (int b =0; b<=a; b++) {
                System.out.print(" ");
            }
            for (int b =a; b<n; b++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
