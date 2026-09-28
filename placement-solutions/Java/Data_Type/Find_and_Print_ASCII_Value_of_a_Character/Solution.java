/**
 * ============================================================================
 * Problem: Find and Print ASCII Value of a Character
 * Problem ID: 9
 * Topic: Data Type
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-28T00:47:23.637Z
 * ============================================================================
 *
 * Description:
 * Read a single character from the input and print its corresponding integer ASCII value.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        System.out.println(ascii);
        // Print ASCII value
    }
}
