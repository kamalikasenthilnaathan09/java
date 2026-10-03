/**
 * ============================================================================
 * Problem: Check Armstrong Number
 * Problem ID: 31
 * Topic: if, if else, nested if
 * Difficulty: MEDIUM
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-10-03T14:46:39.425Z
 * ============================================================================
 *
 * Description:
 * An Armstrong number of order K is a number whose sum of digits raised to the power of K equals the number itself (e.g. 153 = 1^3 + 5^3 + 3^3 = 153). Given an integer N, check whether it is an Armstrong number. Print "Armstrong" or "Not Armstrong".
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int digits = 0;
        int temp = n;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }
        int sum = 0;
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }
        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
