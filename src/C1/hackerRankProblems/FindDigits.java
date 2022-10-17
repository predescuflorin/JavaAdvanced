package C1.hackerRankProblems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FindDigits {
    // Complete the findDigits function below.
    static int findDigits(int number) {
        int counter = 0;
        int n = number;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && number % digit == 0) {
                counter++;
            }
            n = n / 10;
        }
        return counter;
    }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {

                int t = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int tItr = 0; tItr < t; tItr++) {
                    int n = scanner.nextInt();
                    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                    int result = findDigits(n);
                    bufferedWriter.write(String.valueOf(result));
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            }

            scanner.close();
        }
    }


