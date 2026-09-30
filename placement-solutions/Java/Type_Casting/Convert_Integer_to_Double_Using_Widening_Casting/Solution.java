/**
 * ============================================================================
 * Problem: Convert Integer to Double Using Widening Casting
 * Problem ID: 21
 * Topic: Type Casting
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-30T14:51:11.851Z
 * ============================================================================
 *
 * Description:
 * Read an integer value N. Convert it to double using widening (implicit) casting and print the double value formatted to 2 decimal places.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = n; 
        System.out.printf("%.2f\n", d);
        // Convert to double and print
    }
}
