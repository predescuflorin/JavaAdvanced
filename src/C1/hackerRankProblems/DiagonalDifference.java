package C1.hackerRankProblems;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diagPrincipala = 0;
        int diagSecundara = 0;
        int N = scanner.nextInt();

        for (int i = 0; i<N; i++) {
            for (int j=0; j<N; j++){
                int val =scanner.nextInt();
                if (i == j) {diagPrincipala += val;}
                if (i+j == N-1) {diagSecundara += val;}
            }
        }
        if (diagPrincipala -diagSecundara >= 0)
        { System.out.println(diagPrincipala-diagSecundara);}
            else { System.out.println(diagSecundara-diagPrincipala);
    }
}
}
