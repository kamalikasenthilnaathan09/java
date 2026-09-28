/**
 * ============================================================================
 * Problem: Check Divisibility by 5 and 11
 * Problem ID: 13
 * Topic: Operators
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-28T00:31:46.002Z
 * ============================================================================
 *
 * Description:
 * Given an integer N, check whether N is divisible by both 5 and 11 using logical operators. Print "YES" if it is divisible by both, otherwise print "NO".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 5 == 0 && n % 11 == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        // Check divisibility by 5 and 11
    }
}
