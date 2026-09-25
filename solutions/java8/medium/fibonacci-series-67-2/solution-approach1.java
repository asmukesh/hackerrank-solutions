// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/fundamentals-of-programming/challenges/fibonacci-series-67-2/problem?isFullScreen=true
// Problem     Recursion - Fibonacci Series 
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-25, 11:21 a.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static int fib(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int z = fib(n);

        System.out.print("The term " + n + " in the Fibonacci series is " + z);
    }
}

