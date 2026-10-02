/**
 * ============================================================================
 * Problem: Check Whether a Year is a Leap Year
 * Problem ID: 28
 * Topic: if, if else, nested if
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-10-02T00:32:58.194Z
 * ============================================================================
 *
 * Description:
 * Given a year Y, determine if it is a Leap Year according to the Gregorian calendar rules: A year is a leap year if it is divisible by 4, except end-of-century years (divisible by 100) which must also be divisible by 400. Print "Leap Year" or "Not a Leap Year".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%400==0 || year%4==0 && year%100!=0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
        // Check leap year
    }
}
