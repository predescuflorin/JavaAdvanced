package C1.hackerRankProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
        private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String n = scanner.nextLine(); mistake
        BigInteger n = scanner.nextBigInteger();
        scanner.close();
        System.out.println(n.isProbablePrime(100) ? "prime" : "not prime");
    }


}
