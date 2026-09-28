/**
 * ============================================================================
 * Problem: Build a Simple Calculator Using Arithmetic Operators
 * Problem ID: 15
 * Topic: Operators
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-28T00:38:43.679Z
 * ============================================================================
 *
 * Description:
 * Read two integers A and B, and a character op representing an operator (+, -, *, /). Perform the operation on A and B and print the integer result. For division (/), assume B != 0 and use integer division.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);
        int result;
        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else {
            result = a / b;
        }

        System.out.println(result);
    }
}
