/**
 * ============================================================================
 * Problem: Identify Triangle Type: Equilateral, Isosceles, or Scalene
 * Problem ID: 33
 * Topic: if, if else, nested if
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-10-02T00:50:02.159Z
 * ============================================================================
 *
 * Description:
 * Given three valid side lengths a, b, and c of a triangle, classify the triangle as:
 * - "Equilateral" if all three sides are equal
 * - "Isosceles" if any two sides are equal
 * - "Scalene" if all three sides are distinct
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b&&b==c&&c==a){
            System.out.println("Equilateral");
        }
        else if(a==b|| b==c || c==a){
            System.out.println("Isosceles");
        }
        else{
            System.out.println("Scalene");
        }
        // Classify triangle
    }
}
