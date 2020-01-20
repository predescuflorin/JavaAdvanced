package C1.hackerRankProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerc {
    public static void main(String[] args) {
        Scanner bigScan = new Scanner(System.in);
        BigInteger bigA= new BigInteger(String.valueOf(bigScan.nextBigInteger()));
        BigInteger bigB = new BigInteger(String.valueOf(bigScan.nextBigInteger()));
        BigInteger bigC = bigA.add(bigB);
        BigInteger bigD = bigA.multiply(bigB);

        System.out.println(bigC);
        System.out.println(bigD);


    }
}
