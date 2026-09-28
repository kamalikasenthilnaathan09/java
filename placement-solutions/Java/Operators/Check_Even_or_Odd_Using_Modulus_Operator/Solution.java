/**
 * ============================================================================
 * Problem: Check Even or Odd Using Modulus Operator
 * Problem ID: 11
 * Topic: Operators
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-28T00:26:38.996Z
 * ============================================================================
 *
 * Description:
 * Read an integer N. Check whether the number is Even or Odd using the modulus operator (%). Print "Even" or "Odd".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        // Print Even or Odd
    }
}
