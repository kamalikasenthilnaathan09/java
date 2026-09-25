/**
 * ============================================================================
 * Problem: Calculate Electricity Bill Using Units and Rate
 * Problem ID: 5
 * Topic: Variables
 * Difficulty: MEDIUM
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-25T16:00:31.261Z
 * ============================================================================
 *
 * Description:
 * Given units consumed (integer) and rate per unit (double), calculate the total bill amount. A fixed meter surcharge of 50.00 is added to every bill. Formula: Bill = (units * rate) + 50.00. Print the final bill amount formatted to 2 decimal places.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double rate = sc.nextDouble();
        double bill = (units * rate) + 50.00;
        System.out.printf("%.2f", bill);
    }
}
