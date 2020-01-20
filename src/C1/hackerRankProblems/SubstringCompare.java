package C1.hackerRankProblems;

import java.util.Scanner;

public class SubstringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i<s.length()-k+1; i++)
        {
            String A = s.substring(i,k+i);

            if (smallest.compareTo(A) > 0) {
                smallest = A;
            }
            if (largest.compareTo(A) <0) {
                largest = A;
            }

        }

        System.out.println(smallest);
        System.out.println(largest);



    }
}
