/**
 * ============================================================================
 * Problem: Sum, Difference, Product, and Quotient of Two Numbers
 * Problem ID: 16
 * Topic: User Input
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-29T15:06:45.422Z
 * ============================================================================
 *
 * Description:
 * Read two integers A and B from standard input using Scanner. Print their sum, difference (A - B), product (A * B), and quotient (integer division A / B) each on a new line. Assume B != 0.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        // Print sum, diff, product, quotient on separate lines
    }
}
