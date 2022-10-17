package C1.hackerRankProblems;

import java.util.Scanner;

public class fibonacci {
public static int fibonacci (int n) {
    int prim = 0;
    int sec = 1;
    for (int i =2; i<= n; i++) {
       int sum = prim + sec;
       prim = sec;
       sec = sum;
    }
    return sec;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}


//    if (n == 0 || n==1) return n;
//    else return (fibonacci(n-2)+fibonacci(n-1));