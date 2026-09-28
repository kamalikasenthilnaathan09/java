/**
 * ============================================================================
 * Problem: Calculate Simple Interest
 * Problem ID: 8
 * Topic: Data Type
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-28T00:45:41.931Z
 * ============================================================================
 *
 * Description:
 * Given principal P (double), annual interest rate R (double), and time in years T (double), calculate the Simple Interest using formula: SI = (P * R * T) / 100.0. Print the interest formatted to 2 decimal places.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double si = (p*r*t)/100.0;
        System.out.printf("%.2f\n", si);
        // Compute and print simple interest
    }
}
