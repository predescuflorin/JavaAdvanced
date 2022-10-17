package C1.hackerRankProblems;

import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i<n; i++) {
            int grade = scanner.nextInt();
            System.out.println(roudedGrade(grade));
        }

    }

    public static int roudedGrade (int grade) {
        if (grade >= 38) {
            int gradeModulo5 = grade % 5;
            if (gradeModulo5 > 2) {
                grade += 5 - gradeModulo5;
            }
        }
        return grade;
    }
}


