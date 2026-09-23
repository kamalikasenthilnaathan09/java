/**
 * ============================================================================
 * Problem: Swap Two Numbers Without Using a Third Variable
 * Problem ID: 2
 * Topic: Variables
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-23T15:22:15.797Z
 * ============================================================================
 *
 * Description:
 * Given two integers A and B, swap their values without using any additional temporary variable and print the swapped values separated by a space.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+" "+b);
        // Swap without a third variable
        
    }
}
