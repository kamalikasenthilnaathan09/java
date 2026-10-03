/**
 * ============================================================================
 * Problem: Calculate Electricity Bill Using Slab-Based Conditions
 * Problem ID: 34
 * Topic: if, if else, nested if
 * Difficulty: MEDIUM
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-10-03T14:52:30.494Z
 * ============================================================================
 *
 * Description:
 * Calculate electricity bill based on consumed units U according to slabs:
 * - First 100 units: 1.50 per unit
 * - Next 100 units (101-200): 2.50 per unit
 * - Next 100 units (201-300): 4.00 per unit
 * - Above 300 units: 6.00 per unit
 * An additional fixed charge of 35.00 is added to every bill. Print total bill formatted to 2 decimal places.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double bill;
        if (units <= 100) {
            bill = units * 1.50;
        } else if (units <= 200) {
            bill = (100 * 1.50) + ((units - 100) * 2.50);
        } else if (units <= 300) {
            bill = (100 * 1.50) + (100 * 2.50) + ((units - 200) * 4.00);
        } else {
            bill = (100 * 1.50) + (100 * 2.50) + (100 * 4.00)
                   + ((units - 300) * 6.00);
        }
        bill = bill + 35.00;
        System.out.printf("%.2f%n", bill);
    }
}
