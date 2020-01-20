package C1.hackerRankProblems;

import java.io.*;
import java.time.LocalDate;

public class findDay{
    public static String findDay(int month, int day, int year) {
        int m = Integer.valueOf(month);
        int d = Integer.valueOf(day);
        int y = Integer.valueOf(year);
        LocalDate date = LocalDate.of(y, m, y);
        return date.getDayOfWeek().toString();
    }


        public static void main (String[] args) throws  IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH0000")));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int month = Integer.parseInt(firstMultipleInput[0]);

            int day = Integer.parseInt(firstMultipleInput[1]);

            int year = Integer.parseInt(firstMultipleInput[2]);
//
//            String res = Result.

//            bufferedWriter.write(res);
//            bufferedWriter.newLine();

//            bufferedReader.close();
//            bufferedWriter.close();
        }
    }

