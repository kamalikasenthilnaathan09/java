/**
 * ============================================================================
 * Problem: Calculate Total and Average of 5 Subject Marks
 * Problem ID: 3
 * Topic: Variables
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-23T15:35:15.917Z
 * ============================================================================
 *
 * Description:
 * Read 5 integer marks obtained in 5 subjects. Calculate and print their total sum and exact average (formatted to 2 decimal places) separated by a space.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int total = a+b+c+d+e;
        double average=total/5.0;
        System.out.printf("%d %.2f",total,average);
        
        // Read 5 marks and calculate total and average
    }
}
