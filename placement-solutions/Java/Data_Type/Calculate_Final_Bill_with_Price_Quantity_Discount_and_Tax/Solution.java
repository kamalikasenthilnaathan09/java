/**
 * ============================================================================
 * Problem: Calculate Final Bill with Price, Quantity, Discount, and Tax
 * Problem ID: 10
 * Topic: Data Type
 * Difficulty: MEDIUM
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-28T00:53:06.782Z
 * ============================================================================
 *
 * Description:
 * Given item unit price (double), quantity (int), discount percentage (double), and tax percentage (double): calculate the subtotal = price * quantity, apply discount = subtotal * (discount / 100.0), then apply tax on discounted amount = discountedAmount * (tax / 100.0). Final Bill = discountedAmount + taxAmount. Print the final bill formatted to 2 decimal places.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        int qty = sc.nextInt();
        double discount = sc.nextDouble();
        double tax = sc.nextDouble();
        double subtotal = price * qty;
        double discounted = subtotal - (subtotal *  discount / 100.0);
        double finalBill = discounted + (discounted * tax / 100.0);
        System.out.printf("%.2f",finalBill);
        // Compute and print final bill
    }
}
