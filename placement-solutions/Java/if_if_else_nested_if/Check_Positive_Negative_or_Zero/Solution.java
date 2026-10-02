/**
 * ============================================================================
 * Problem: Check Positive, Negative, or Zero
 * Problem ID: 26
 * Topic: if, if else, nested if
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-10-02T00:32:39.837Z
 * ============================================================================
 *
 * Description:
 * Given an integer N, determine whether it is Positive, Negative, or Zero. Print "Positive", "Negative", or "Zero".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            System.out.println("Positive");
        }
        else if(n<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        // Check and print Positive, Negative, or Zero
    }
}
