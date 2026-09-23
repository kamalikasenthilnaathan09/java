/**
 * ============================================================================
 * Problem: Convert Total Seconds into Hours, Minutes, and Seconds
 * Problem ID: 4
 * Topic: Variables
 * Difficulty: EASY
 * Status: Solved / Accepted
 * Author: Kamali
 * Pushed at: 2026-09-23T15:48:09.262Z
 * ============================================================================
 *
 * Description:
 * Given an integer representing total elapsed seconds, convert it into hours, minutes, and remaining seconds in the format: H:M:S.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSeconds = sc.nextInt();
        int hours = totalSeconds/3600;
        int minutes = (totalSeconds%3600)/60;
        int seconds = totalSeconds%60;
        System.out.println(hours+":"+minutes+":"+seconds);
        // Compute hours, minutes, and seconds
    }
}
