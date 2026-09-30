/**
 * ============================================================================
 * Problem: Calculate Percentage of 5 Subjects Without Precision Loss
 * Problem ID: 25
 * Topic: Type Casting
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-30T14:57:32.375Z
 * ============================================================================
 *
 * Description:
 * Read 5 integer marks obtained in 5 subjects out of 100 each (maximum total = 500). Calculate the exact percentage using double type casting to avoid integer truncation. Print the percentage formatted to 2 decimal places with a "%" suffix.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int total = a+b+c+d+e;
        double per = ((double) total / 500.0) * 100.0;
        System.out.printf("%.2f%%\n", per);
        // Calculate exact percentage
    }
}
