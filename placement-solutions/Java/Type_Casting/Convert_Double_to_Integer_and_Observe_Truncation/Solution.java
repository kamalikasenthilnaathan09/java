/**
 * ============================================================================
 * Problem: Convert Double to Integer and Observe Truncation
 * Problem ID: 22
 * Topic: Type Casting
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-30T14:51:22.050Z
 * ============================================================================
 *
 * Description:
 * Read a double value D. Convert D to an integer using explicit narrowing type casting (int) D and print the resulting integer. Observe how fractional digits are truncated.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        int res = (int) d;
        System.out.println(res);
        
        // Cast to int and print
    }
}
