/**
 * ============================================================================
 * Problem: Convert Celsius to Fahrenheit
 * Problem ID: 7
 * Topic: Data Type
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-28T00:41:37.386Z
 * ============================================================================
 *
 * Description:
 * Read a double value C representing temperature in Celsius. Convert it into Fahrenheit using formula: F = (C * 9.0 / 5.0) + 32.0. Print the temperature in Fahrenheit formatted to 2 decimal places.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double fahrenheit =(c * 9.0 / 5.0) + 32.0;
        System.out.printf("%.2f", fahrenheit);
    }
}
