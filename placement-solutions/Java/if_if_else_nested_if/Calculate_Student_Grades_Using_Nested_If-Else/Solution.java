/**
 * ============================================================================
 * Problem: Calculate Student Grades Using Nested If-Else
 * Problem ID: 30
 * Topic: if, if else, nested if
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-10-02T00:33:19.242Z
 * ============================================================================
 *
 * Description:
 * Given marks M (0 to 100), assign a grade using the following criteria:
 * - M >= 90: Grade A
 * - 80 <= M < 90: Grade B
 * - 70 <= M < 80: Grade C
 * - 60 <= M < 70: Grade D
 * - 50 <= M < 60: Grade E
 * - M < 50: Fail
 * Print the corresponding grade or "Fail".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        if(M >= 90){
            System.out.println("Grade A");
        }
        else if(M >= 80){
            System.out.println("Grade B");
        }
        else if(M >= 70){
            System.out.println("Grade C");
        }
        else if(M >= 60){
            System.out.println("Grade D");
        }
        else if(M >= 50){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Fail");
        }
        // Output grade
    }
}
