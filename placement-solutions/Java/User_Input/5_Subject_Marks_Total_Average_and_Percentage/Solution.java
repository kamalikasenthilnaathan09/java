/**
 * ============================================================================
 * Problem: 5 Subject Marks Total, Average, and Percentage
 * Problem ID: 17
 * Topic: User Input
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-29T15:16:19.610Z
 * ============================================================================
 *
 * Description:
 * Read 5 subject marks (maximum 100 per subject). Calculate and print the Total, Average, and Percentage. Since each subject is out of 100, Average and Percentage are numerically identical. Print Total as integer, Average with 2 decimal places, and Percentage with 2 decimal places separated by space.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int total = a+b+c+d+e;
        double avg = total/5.0;
        double per = (total/500.0)*100;
        System.out.printf("%d %.2f %.2f%%%n", total, avg, per);
        // Read 5 marks
    }
}
