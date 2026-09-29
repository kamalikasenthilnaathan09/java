/**
 * ============================================================================
 * Problem: Sum of Digits of a Three-Digit Number
 * Problem ID: 20
 * Topic: User Input
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-29T15:25:42.573Z
 * ============================================================================
 *
 * Description:
 * Read a positive three-digit integer N (100 to 999). Extract its hundreds, tens, and units digits and print their sum.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hundreds = n/100;
        int tens = (n/10)%10;
        int units = n%10;
        int total = hundreds+tens+units;
        System.out.println(total);
        // Calculate sum of digits
    }
}
