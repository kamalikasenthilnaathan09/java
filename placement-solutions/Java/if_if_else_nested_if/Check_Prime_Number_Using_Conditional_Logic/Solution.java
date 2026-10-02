/**
 * ============================================================================
 * Problem: Check Prime Number Using Conditional Logic
 * Problem ID: 29
 * Topic: if, if else, nested if
 * Difficulty: MEDIUM
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-10-02T00:37:24.293Z
 * ============================================================================
 *
 * Description:
 * Given an integer N, check whether N is a Prime number. A prime number is greater than 1 and has no positive divisors other than 1 and itself. Print "Prime" or "Not Prime".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;
        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
