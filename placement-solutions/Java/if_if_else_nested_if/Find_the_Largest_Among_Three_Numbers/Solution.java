/**
 * ============================================================================
 * Problem: Find the Largest Among Three Numbers
 * Problem ID: 27
 * Topic: if, if else, nested if
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-10-02T14:53:51.795Z
 * ============================================================================
 *
 * Description:
 * Given three integers A, B, and C, find and print the largest value using if-else statements.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a >= b && a >= c){
            System.out.println(a);
        }
        else if(b >= c){
            System.out.println(b);
        } else{
            System.out.println(c);
        }
        // Print the largest
    }
}
