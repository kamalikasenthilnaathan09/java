/**
 * ============================================================================
 * Problem: Check Whether Three Sides Form a Valid Triangle
 * Problem ID: 32
 * Topic: if, if else, nested if
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-10-03T14:49:25.509Z
 * ============================================================================
 *
 * Description:
 * Given three positive integers a, b, and c representing the side lengths of a triangle, check if they can form a valid triangle using Triangle Inequality Theorem (sum of any two sides must be strictly greater than the third side: a + b > c && a + c > b && b + c > a). Print "Valid" or "Invalid".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
        // Check validity
    }
}
