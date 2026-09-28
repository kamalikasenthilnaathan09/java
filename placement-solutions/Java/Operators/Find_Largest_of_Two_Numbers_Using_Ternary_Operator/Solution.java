/**
 * ============================================================================
 * Problem: Find Largest of Two Numbers Using Ternary Operator
 * Problem ID: 12
 * Topic: Operators
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-28T00:29:08.424Z
 * ============================================================================
 *
 * Description:
 * Given two integers A and B, determine the larger number using the ternary operator (?:) and print it. If both are equal, print either.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = (a >= b) ? a : b;{
            System.out.println(max);
        }// Use ternary operator to find and print max
    }
}
