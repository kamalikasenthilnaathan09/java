/**
 * ============================================================================
 * Problem: Check Voting Eligibility Using Relational Operators
 * Problem ID: 14
 * Topic: Operators
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-28T00:36:17.553Z
 * ============================================================================
 *
 * Description:
 * Given the age of a person as an integer, determine if they are eligible to vote. A person is eligible if age is 18 or older. Print "Eligible" or "Not Eligible".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
        // Check eligibility
    }
}
