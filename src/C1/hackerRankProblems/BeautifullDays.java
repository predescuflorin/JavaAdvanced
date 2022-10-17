package C1.hackerRankProblems;

import java.util.Scanner;

public class BeautifullDays {
    public static int reverse (int number) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(number);
        stringBuilder.reverse();
        return Integer.parseInt(stringBuilder.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();

        int count=0;
        for (int number = i; number<=j; number++) {
            if ((Math.abs(number-reverse(number))%k ==0)) {count++;}
        }
        System.out.println(count);

    }
}
