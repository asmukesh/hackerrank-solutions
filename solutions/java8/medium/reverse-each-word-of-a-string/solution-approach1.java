// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/fundamentals-of-programming/challenges/reverse-each-word-of-a-string/problem?isFullScreen=true
// Problem     Strings - Reverse each word of a string
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-25, 09:54 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {

        // Create Scanner to take input
        Scanner in = new Scanner(System.in);

        // Read the complete sentence
        String s = in.nextLine();

        // Split sentence into individual words
        String[] words = s.trim().split("\\s+");

        // Start from the last word and move backwards
        for (int i = words.length - 1; i >= 0; i--) {

            // Print the current word
            System.out.print(words[i]);

            // Print space between words
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
