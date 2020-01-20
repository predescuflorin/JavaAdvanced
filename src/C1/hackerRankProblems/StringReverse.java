package C1.hackerRankProblems;

import java.util.Scanner;

public class StringReverse {
//    polindrome

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();

        String palindrome = new StringBuilder(A).reverse().toString();
        String alfa = new StringBuilder(A).reverse().substring(1, 4).toString();
        if (A.equals(palindrome)) {
            System.out.println("Yes");}
        else {
            System.out.println("No");
        }
        System.out.println(alfa);
//        System.out.println(A.equals(palindrome) ? "yes" "no");

    }
}
